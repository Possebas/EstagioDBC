package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Contratacao;

import org.springframework.data.repository.CrudRepository;

public interface ContratacaoRepository extends CrudRepository<Contratacao, Integer> {
    List<Contratacao> findAll();
}
