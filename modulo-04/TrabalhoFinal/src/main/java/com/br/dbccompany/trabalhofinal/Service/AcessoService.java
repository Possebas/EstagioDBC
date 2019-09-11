package com.br.dbccompany.trabalhofinal.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

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

        if(acesso == null) return "Acesso invalido";

        if(acesso.getIsEntrada()){
            acesso.setIsEntrada(true);
            Integer entradaValor = acesso.getSaldoCliente().getQuantidade();
        }

        if(acesso.getData() == null){
            acesso.setData(new Date(System.currentTimeMillis()));
        }

        if(acesso.getSaldoCliente().getQuantidade() == 0){
            throw new Exception("Saldo insuficiente!");
        }
/* 
        List<Acesso> acessosIT = acesso.getSaldoCliente().getAcessos();
        
        SaldoCliente saldoCliente = acesso.getSaldoCliente();
        double desconto = 0.0;

        switch (acesso.get) {
            case value:
                
                break;
        
            default:
                break;
        } */
  
        
        /* Regras desconto do saldo:
        ■ Minutos: Apenas descontar
        ■ Horas: Múltiplos de 1 hora
        ■ Turnos: 1 Turno possui 5 horas, então múltiplos de 5
        ■ Diárias: deve ser quantidade simples 1 a 1
        ■ Semana e Mês o que conta é o vencimento final
        ■ OBS: Todos valores arredondados para cima */


        Acesso desk =  super.salvar(acesso);

        return "";
    }
}
