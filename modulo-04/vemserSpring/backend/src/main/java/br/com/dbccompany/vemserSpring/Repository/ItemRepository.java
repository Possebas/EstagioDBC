package br.com.dbccompany.vemserSpring.Repository;

import br.com.dbccompany.vemserSpring.Entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
    
    List<Item> findAll();
    
}
