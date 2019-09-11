package com.br.dbccompany.trabalhofinal.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.SaldoCliente;
import com.br.dbccompany.trabalhofinal.Entity.SaldoClienteID;

@Repository
public interface SaldoClienteRepository extends CrudRepository<SaldoCliente, SaldoClienteID> {
    List<SaldoCliente> findAllById_Espaco(Integer idEspaco);

    List<SaldoCliente> findAllById_Cliente(Integer idCliente);
}
