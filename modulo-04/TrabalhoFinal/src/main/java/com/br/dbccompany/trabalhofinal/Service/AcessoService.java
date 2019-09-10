package com.br.dbccompany.trabalhofinal.Service;

import javax.transaction.Transactional;

import com.br.dbccompany.trabalhofinal.Entity.*;
import com.br.dbccompany.trabalhofinal.Repository.AcessoRepository;
import org.springframework.stereotype.Service;


@Service
public class AcessoService extends AbstractService<AcessoRepository, Acesso> {

    @Transactional
    public String acessar(Acesso acesso) throws Exception {
        repository.save(acesso);
        return "";
    }
}
