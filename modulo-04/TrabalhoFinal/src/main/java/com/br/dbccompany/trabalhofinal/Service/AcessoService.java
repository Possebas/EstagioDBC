package com.br.dbccompany.trabalhofinal.Service;

import javax.transaction.Transactional;
import java.util.Date;

import com.br.dbccompany.trabalhofinal.Entity.*;
import com.br.dbccompany.trabalhofinal.Repository.AcessoRepository;
import org.springframework.stereotype.Service;


@Service
public class AcessoService extends AbstractService<AcessoRepository, Acesso> {

    @Transactional
    public String acessar(Acesso acesso) throws Exception {

        if(acesso.getIsEntrada()){
            acesso.setIsEntrada(true);
        }

        if(acesso.getData() == null){
            acesso.setData(new Date(System.currentTimeMillis()));
        }

        if(acesso.getSaldoCliente().getQuantidade() == 0){
            throw new Exception("Saldo insuficiente!");
        }

        
        
        /* Regras desconto do saldo:
        ■ Minutos: Apenas descontar
        ■ Horas: Múltiplos de 1 hora
        ■ Turnos: 1 Turno possui 5 horas, então múltiplos de 5
        ■ Diárias: deve ser quantidade simples 1 a 1
        ■ Semana e Mês o que conta é o vencimento final
        ■ OBS: Todos valores arredondados para cima */


        repository.save(acesso);
        return "";
    }
}
