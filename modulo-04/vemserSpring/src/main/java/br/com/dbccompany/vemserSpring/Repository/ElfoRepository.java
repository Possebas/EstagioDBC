package br.com.dbccompany.vemserSpring.Repository;

import br.com.dbccompany.vemserSpring.Entity.Elfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElfoRepository extends CrudRepository<Elfo, Integer> {

    Elfo findByDano( Double dano );
    List<Elfo> findAll();
}
