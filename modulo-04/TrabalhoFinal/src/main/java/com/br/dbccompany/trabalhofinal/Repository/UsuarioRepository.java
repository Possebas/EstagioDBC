package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findAll();
}
