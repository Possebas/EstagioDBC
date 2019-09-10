package com.br.dbccompany.trabalhofinal.Service;

import  com.br.dbccompany.trabalhofinal.Entity.Cliente;
import  com.br.dbccompany.trabalhofinal.Utils;
import  com.br.dbccompany.trabalhofinal.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService extends AbstractService<ClienteRepository, Cliente> {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Cliente salvar(Cliente cliente) throws Exception {

        if(repository.findByCpf(cliente.getCpf()) != null){
            throw new Exception("CPF já registrado");
        }

        if(!Utils.cpfValid(cliente.getCpf())){
            throw new Exception("CPF Não é válido");
        }

        return super.salvar(cliente);
    }
}
