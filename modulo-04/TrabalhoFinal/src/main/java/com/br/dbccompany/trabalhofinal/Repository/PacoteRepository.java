package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Pacote;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Integer> {
    List<Pacote> findAll();
    Pacote findById(long id);
}
