package br.com.dbccompany.vemserSpring.Repository;

import br.com.dbccompany.vemserSpring.Entity.Personagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem, Integer> {

    Personagem findByDano( Double dano );
    List<Personagem> findAll();

}
