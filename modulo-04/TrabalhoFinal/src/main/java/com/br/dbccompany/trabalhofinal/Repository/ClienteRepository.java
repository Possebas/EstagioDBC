package com.br.dbccompany.trabalhofinal.Repository;

import com.br.dbccompany.trabalhofinal.Entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
