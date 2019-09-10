package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.Pacote;
import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Repository.PacoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacoteService extends AbstractService<PacoteRepository, Pacote> {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Pacote salvar(Pacote pacote) throws Exception{
        pacote.setValor(Utils.parseToDouble(pacote.getValorReais());
        return super.salvar(pacote);
    }

    @Override
    public Pacote buscarPorId(Integer id) {
        Pacote pacote = super.buscarPorId(id);
        pacote.setValorReais(Utils.parseToString(pacote.getValor()));
        return pacote;
    }
}
