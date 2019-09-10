package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.TipoContato;
import com.br.dbccompany.trabalhofinal.Repository.TipoContatoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoContatoService extends AbstractService<TipoContatoRepository, TipoContato> {

    public TipoContato buscarPorNome(String nome){
        return repository.findByNome(nome);
    }
    
}
