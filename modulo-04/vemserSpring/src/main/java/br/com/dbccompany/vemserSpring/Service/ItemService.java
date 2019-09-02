package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Item;
import br.com.dbccompany.vemserSpring.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Transactional( rollbackFor = Exception.class )
    public Item salvar( Item item ) {
        return itemRepository.save( item );
    }

    public List<Item> todosPersonagens() {
        return (List<Item>) itemRepository.findAll();
    }
    
}
