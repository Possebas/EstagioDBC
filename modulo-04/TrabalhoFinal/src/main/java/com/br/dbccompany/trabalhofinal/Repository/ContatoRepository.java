package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Contato;

import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
    List<Contato> findAll();
}
