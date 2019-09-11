package com.br.dbccompany.trabalhofinal.Repository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Usuario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UsuarioRepository repository;

    @Test
    public void searchByName(){
        Usuario user = new Usuario();
        user.setNome("Dbc");
        entityManager.persist(user);
        entityManager.flush();

        Usuario resposta = repository.findByUsername(user.getNome());

        assertThat(resposta.getNome()).isEqualTo(user.getNome());
    }

    @Test
    public void searchByID(){
        Usuario user = new Usuario();
        user.setNome("Dbc");
        user.setId(12);
        entityManager.persist(user);
        entityManager.flush();

        Usuario resposta = repository.findById(user.getId()).get();

        assertThat(resposta.getId()).isEqualTo(user.getId());
    }

    @Test
    public void searchByEmail(){
        Usuario user = new Usuario();
        user.setNome("Dbc");
        user.setEmail("dbccompany@dbccompany.com.br");
        entityManager.persist(user);
        entityManager.flush();

        Usuario resposta = repository.findByUsername(user.getEmail());

        assertThat(resposta.getEmail()).isEqualTo(user.getEmail());
    }

    @Test
    public void searchByNameList(){
        Usuario user1 = new Usuario();
        user1.setNome("Dbc");
        Usuario user2 = new Usuario();
        user2.setEmail("Dbc");

        entityManager.persist(user1);
        entityManager.flush();

        List<Usuario> resposta = repository.findAllByNome(user1.getNome());

        assertEquals(user1.getNome(), resposta.get(0));
    }

}
