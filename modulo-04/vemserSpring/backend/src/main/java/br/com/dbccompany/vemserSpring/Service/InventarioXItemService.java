package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Inventario;
import br.com.dbccompany.vemserSpring.Entity.InventarioXItem;
import br.com.dbccompany.vemserSpring.Entity.Item;
import br.com.dbccompany.vemserSpring.Repository.InventarioRepository;
import br.com.dbccompany.vemserSpring.Repository.InventarioXItemRepository;
import br.com.dbccompany.vemserSpring.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventarioXItemService {

    @Autowired
    private InventarioXItemRepository inventarioXItemRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private InventarioRepository inventarioRepository;

    @Transactional( rollbackFor = Exception.class )
    public InventarioXItem salvar(InventarioXItem inventarioXItem ) {
        Item itemObject = inventarioXItem.getIdItem();
        Inventario inventarioObject = inventarioXItem.getIdInventario();

        if ( itemObject.getId() == null ) {
            itemObject = itemRepository.save( itemObject );
        }

        if ( inventarioObject.getId() == null ) {
            inventarioObject = inventarioRepository.save( inventarioObject );
        }
        inventarioXItem.setIdInventario( inventarioObject );
        inventarioXItem.setIdItem( itemObject );

        return inventarioXItemRepository.save( inventarioXItem );
    }

    
    public void removerById(Integer id) {
        inventarioXItemRepository.deleteById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public InventarioXItem editar(Integer id, InventarioXItem inventarioXItem){
        inventarioXItem.setId(id);
        return inventarioXItemRepository.save( inventarioXItem );
    }

    public List<InventarioXItem> todosInventariosXItens() {
        return (List<InventarioXItem>) inventarioXItemRepository.findAll(); // ou subescreve o método no item e ai não precisa o cast
    }
}
