package com.br.dbccompany.trabalhofinal.Service;

import javax.transaction.Transactional;

import java.time.LocalDateTime;

import com.br.dbccompany.trabalhofinal.Entity.*;
import com.br.dbccompany.trabalhofinal.Repository.AcessoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AcessoService extends AbstractService<AcessoRepository, Acesso> {

    @Autowired
    AcessoService selfRepository;

    @Autowired
    SaldoClienteService saldoClienteService;

    @Transactional
    public String acessar(Acesso acesso) throws Exception {

        if(acesso == null) throw new Exception("Acesso invalido");

        Integer idCliente = acesso.getSaldoCliente().getId().getCliente().getId();
        Integer idEspaco = acesso.getSaldoCliente().getId().getEspaco().getId();
        SaldoCliente saldoCliente  = saldoClienteService.buscarPorId(idCliente, idEspaco);

        if(saldoCliente == null){
            throw new Exception("Nenhum saldoCliente relacionado ao Cliente e Espaco");
        } else{
            acesso.setSaldoCliente(saldoCliente);
        }

        LocalDateTime joinSystem = LocalDateTime.now();

        double saldoMomento = acesso.getSaldoCliente().getQuantidade();
        if(acesso.getIsEntrada()) { //CLIENTE ENTRANDO
            if (saldoMomento > 0) {
                if (acesso.getData() == null) { //data nao recebida
                    acesso.setData(joinSystem);
                }
                return String.format("Bem vindo(a), %s ! \n Saldo atual: %d , Tipo contratado: %s", acesso.getSaldoCliente().getId().getCliente().getNome(), saldoMomento, acesso.getSaldoCliente().getTipoContratacao());
            } else if(saldoMomento == 0){
                return "Saldo insuficiente";
            } else if (saldoMomento > 0 && joinSystem.isAfter(acesso.getSaldoCliente().getVencimento())) {
                acesso.getSaldoCliente().setQuantidade(0);
                saldoClienteService.salvar(acesso.getSaldoCliente());
                return "Saldo Vencido";
            } else return "Nao foi possivel realizar entrada!";
        } else{ //CLIENTE SAINDO
                LocalDateTime outSystem = acesso.getData();
                double quantidadeSaldo = saldoMomento;
                double tempoAlocado = 0;
                switch (acesso.getSaldoCliente().getTipoContratacao()) {
                    case MES:
                        tempoAlocado = Math.round(joinSystem.getMonthValue() - outSystem.getMonthValue());
                        break;
                    case MINUTO:
                        tempoAlocado = Math.round(joinSystem.getMinute() - outSystem.getMinute());
                        break;
                    case DIARIA:
                        tempoAlocado = Math.round(joinSystem.getDayOfMonth() - outSystem.getDayOfMonth());
                        break;       
                    case HORA:
                        tempoAlocado = Math.round(joinSystem.getHour() - outSystem.getHour());
                        break;
                    case TURNO:
                        tempoAlocado = ((joinSystem.getHour() - outSystem.getHour()) / 5);
                        break;
                    case SEMANA:
                        tempoAlocado = Math.round((joinSystem.getDayOfMonth() - outSystem.getDayOfMonth()) / 7);
                        break;
                    default:
                        tempoAlocado = 0.0;
                        break;
                }
                
                acesso.getSaldoCliente().setQuantidade(quantidadeSaldo - tempoAlocado);
                saldoClienteService.editarPorIds(idCliente,idEspaco,saldoCliente);
                selfRepository.salvar(acesso);
                return String.format("Até mais, %s ! \n Saldo atual: %d , Tipo contratado: %s", acesso.getSaldoCliente().getId().getCliente().getNome() ,saldoMomento, acesso.getSaldoCliente().getTipoContratacao());
            }
    }
}
