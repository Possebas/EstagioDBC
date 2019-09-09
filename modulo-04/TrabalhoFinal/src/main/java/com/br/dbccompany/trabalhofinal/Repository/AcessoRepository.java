package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.dbccompany.trabalhofinal.Entity.Acesso;

@Repository
public interface AcessoRepository extends CrudRepository<Acesso, Integer> {

}
