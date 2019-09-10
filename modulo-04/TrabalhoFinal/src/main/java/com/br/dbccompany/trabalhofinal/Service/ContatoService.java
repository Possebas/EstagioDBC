package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.Contato;
import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContatoService extends AbstractService<ContatoRepository, Contato> {

    @Autowired
    TipoContatoService tipoContatoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Contato salvar(Contato contato) throws Exception{
        if(!Utils.requiredContact(contato)){
            throw new Exception("Contato do tipo " + contato.getTipoContato().getNome() + " inválido" );
        }

        if(contato.getTipoContato() == null) {
            throw new Exception("Tipo de contato inválido");
        }
    
        return super.salvar(contato);
    }
}


