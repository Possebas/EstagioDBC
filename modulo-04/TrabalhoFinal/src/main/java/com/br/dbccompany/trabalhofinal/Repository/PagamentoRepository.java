package com.br.dbccompany.trabalhofinal.Repository;

import java.util.List;

import com.br.dbccompany.trabalhofinal.Entity.Pagamento;

import org.springframework.data.repository.CrudRepository;

public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {
    List<Pagamento> findAll();
}
