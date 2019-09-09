package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.TipoContato;

import org.springframework.data.repository.CrudRepository;

public interface TipoContatoRepository extends CrudRepository<TipoContato, Integer> {
    List<TipoContato> findAll();
}
