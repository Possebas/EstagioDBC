package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.Contratacao;
import com.br.dbccompany.trabalhofinal.Entity.Espaco;

import javax.transaction.Transactional;

import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Repository.ContratacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratacaoService extends AbstractService<ContratacaoRepository, Contratacao> {

    @Autowired
    EspacoService espacoService;
    
    @Override
    public Contratacao buscarPorId(Integer id) {
        
        Contratacao contratacao = super.buscarPorId(id);
        contratacao.setValorFormatado(Utils.parseToString((contratacao.getDesconto())));
        return contratacao;
    }

    @Transactional
    public String retornaValorContrato(Contratacao contrato) {

        contrato.setDesconto(Utils.parseToDouble(contrato.getValorFormatado()));

        Espaco espaco = null;
        if(contrato.getEspaco().getId() != 0){
            espaco = espacoService.buscarPorId(contrato.getEspaco().getId());
        } 

        Contratacao contratacao = repository.save(contrato);
        double diariaEspaco = 0.0;
        if(espaco != null) {
            diariaEspaco = espaco.getValor();
        }

        double valorContracao = 0.0;

        switch (contrato.getTipoContratacao()){
            case MES: valorContracao = diariaEspaco * 30; //mes de 30 dias
                break;
            case SEMANA: valorContracao = diariaEspaco * 7; //7 dias
                break;
            case DIARIA: valorContracao = diariaEspaco; //como caso base é a diaria, atribui-se própria diaria
                break;
            case TURNO: valorContracao = diariaEspaco * 5 / 24; //pegar turno por 5 dias da semana
                break;
            case HORA: valorContracao = diariaEspaco / 24; //valor de uma hora 
                break;
            case MINUTO: valorContracao = diariaEspaco / 1440; //valor do minuto
                break;
            default: return "Tipo de contratacao invalida!";
        }

        double valorComDesconto = (1.0 * valorContracao * contratacao.getQuantidade()) - contratacao.getDesconto();
        String custoFormatado = "O valor a ser pago " + Utils.parseToString(valorComDesconto);

        return custoFormatado;
    }
}
