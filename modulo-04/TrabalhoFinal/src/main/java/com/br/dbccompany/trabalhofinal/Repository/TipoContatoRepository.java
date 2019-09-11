package com.br.dbccompany.trabalhofinal.Repository;

import com.br.dbccompany.trabalhofinal.Entity.TipoContato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContatoRepository extends CrudRepository<TipoContato, Integer> {
    TipoContato findById(long id);

    TipoContato findByNome(String nome);
}
