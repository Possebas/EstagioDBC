package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.AbstractEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class AbstractService <
        Repository extends CrudRepository<Entidade, Integer>,
        Entidade extends AbstractEntity > {

    @Autowired
    Repository repository;

    @Transactional(rollbackFor = Exception.class)
    public Entidade salvar(Entidade entidade) throws Exception{
        return repository.save(entidade);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deletarPorId(Integer id){
        repository.deleteById(id);
    }

    public Entidade buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public List<Entidade> listarTodos(){
        return (List<Entidade>) repository.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public Entidade editarPorId(Integer id, Entidade entidade) throws Exception{
        Entidade novo = repository.findById(id).get();
        novo.setId(id);
        return repository.save(novo);
    }

}
