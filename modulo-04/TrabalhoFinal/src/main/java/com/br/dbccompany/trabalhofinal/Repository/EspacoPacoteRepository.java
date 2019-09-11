package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.EspacoPacote;
import com.br.dbccompany.trabalhofinal.Entity.Pacote;

@Repository
public interface EspacoPacoteRepository extends CrudRepository<EspacoPacote, Integer> {
    List<EspacoPacote> findAll();

    List<EspacoPacote> findAllByPacote(Pacote pacote);
}
