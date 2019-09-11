package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.ClientePacote;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientePacoteRepository extends CrudRepository<ClientePacote, Integer> {
    List<ClientePacote> findAll();
}
