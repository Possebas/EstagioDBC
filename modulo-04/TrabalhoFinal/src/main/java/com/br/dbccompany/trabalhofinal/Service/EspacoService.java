package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.Espaco;
import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Repository.EspacoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspacoService extends AbstractService<EspacoRepository, Espaco> {
    
    @Override
    public Espaco buscarPorId(Integer id) {
        Espaco espaco =  super.buscarPorId(id);
        espaco.setValorFormatado(Utils.parseToString(espaco.getValor()));
        return espaco;
    }
    public Espaco buscarPorNome(String nome){
        Espaco espaco = repository.findByNome(nome);
        espaco.setValorFormatado(Utils.parseToString(espaco.getValor()));
        return espaco;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Espaco salvar(Espaco espaco) throws Exception{
        espaco.setValorFormatado(espaco.getValorFormatado());
        return super.salvar(espaco);
    }
}
