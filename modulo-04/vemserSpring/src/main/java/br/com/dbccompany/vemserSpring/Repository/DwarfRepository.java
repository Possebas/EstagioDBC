package br.com.dbccompany.vemserSpring.Repository;

import br.com.dbccompany.vemserSpring.Entity.Dwarf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

    Dwarf findByDano( Double dano );
    List<Dwarf> findAll();
    
}
