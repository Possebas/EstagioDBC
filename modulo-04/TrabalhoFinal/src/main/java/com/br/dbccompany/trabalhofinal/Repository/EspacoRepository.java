package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Espaco;

import org.springframework.data.repository.CrudRepository;

public interface EspacoRepository extends CrudRepository<Espaco, Integer> {
    List<Espaco> findAll();
}
