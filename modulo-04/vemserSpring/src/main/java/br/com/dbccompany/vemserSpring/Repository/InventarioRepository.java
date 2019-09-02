package br.com.dbccompany.vemserSpring.Repository;

import br.com.dbccompany.vemserSpring.Entity.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer> {

    Inventario findByDano( Double dano );
    List<Inventario> findAll();

}
