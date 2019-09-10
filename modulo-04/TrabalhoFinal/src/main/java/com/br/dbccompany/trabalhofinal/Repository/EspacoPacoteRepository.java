package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.EspacoPacote;
import com.br.dbccompany.trabalhofinal.Entity.Pacote;

public interface EspacoPacoteRepository extends CrudRepository<EspacoPacote, Integer> {
    List<EspacoPacote> findAll();

    List<EspacoPacote> findAllByPacote(Pacote pacote);
}
