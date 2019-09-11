package com.br.dbccompany.trabalhofinal.Repository;

import static org.assertj.core.api.Assertions.*;

import com.br.dbccompany.trabalhofinal.Entity.TipoContato;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TipoContatoRepositoryTest {
    
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TipoContatoRepository repository;

    @Test
    public void searchByName(){
        TipoContato user = new TipoContato();
        user.setNome("Dbc");
        entityManager.persist(user);
        entityManager.flush();

        TipoContato resposta = repository.findByNome(user.getNome());

        assertThat(resposta.getNome()).isEqualTo(user.getNome());
    }
}