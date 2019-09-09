package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;

import com.br.dbccompany.trabalhofinal.Entity.SaldoCliente;
import com.br.dbccompany.trabalhofinal.Entity.SaldoClienteID;

public interface SaldoClienteRepository extends CrudRepository<SaldoCliente, SaldoClienteID> {

}
