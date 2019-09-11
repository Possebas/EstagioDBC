package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByUsername(String login);

    Usuario findById(long id);

    List<Usuario> findAllByNome(String nome);

    Usuario findByEmail(String email);
}
