package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Pacote;

import org.springframework.data.repository.CrudRepository;

public interface PacoteRepository extends CrudRepository<Pacote, Integer> {
    List<Pacote> findAll();
    Pacote findById(long id);
}
