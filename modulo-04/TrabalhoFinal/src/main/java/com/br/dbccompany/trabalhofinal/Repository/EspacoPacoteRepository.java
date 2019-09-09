package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.EspacoPacote;

public interface EspacoPacoteRepository extends CrudRepository<EspacoPacote, Integer> {
    List<EspacoPacote> findAll();
}
