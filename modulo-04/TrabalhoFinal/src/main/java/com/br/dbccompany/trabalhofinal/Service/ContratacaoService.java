package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.Contratacao;

import javax.transaction.Transactional;

import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Repository.ContratacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContratacaoService extends AbstractService<ContratacaoRepository, Contratacao> {

    @Override
    public Contratacao buscarPorId(Integer id) {
        Contratacao contratacao = super.buscarPorId(id);
        contratacao.setValorFormatado(Utils.parseToString((contratacao.getDesconto())));
        return contratacao;
    }

    @Transactional
    public String salvarRetornarValor(Contratacao entidade) {
        return "";
    }
}
