package com.br.dbccompany.trabalhofinal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.br.dbccompany.trabalhofinal.Entity.*;
import com.br.dbccompany.trabalhofinal.Repository.PagamentoRepository;

@Service
public class PagamentoService extends AbstractService<PagamentoRepository, Pagamento> {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ContratacaoService contratacaoService;

    @Autowired
    ClientePacoteService clientePacoteService;

    @Autowired
    EspacoService espacoService;

    @Autowired
    SaldoClienteService saldoClienteService;

    @Autowired
    EspacoPacoteService espacoPacoteService;

    public Pagamento realizarPagamento(Pagamento pagamento) throws Exception {

        ClientePacote clientePacote = null;
        Contratacao contratacao = null;

        if (pagamento.getClientePacote() != null) { //Caso pagamento seja clientePacote
            
            clientePacote = clientePacoteService.buscarPorId(pagamento.getClientePacote().getId());

            Pacote pacote = clientePacote.getPacote(); // separar o pacote
            Cliente cliente = clientePacote.getCliente(); // separar o cliente

            List<EspacoPacote> espacoPacotes = espacoPacoteService.buscarTodosPorPacote(pacote); // todos os pacotes de espacos deste pacote

            for (EspacoPacote espPacote : espacoPacotes) {
                SaldoClienteID id = new SaldoClienteID();
                id.setCliente(cliente);
                id.setEspaco(espPacote.getEspaco());
                SaldoCliente saldoCliente = new SaldoCliente();
                saldoCliente.setId(id);
                saldoCliente.setQuantidade(clientePacote.getQuantidade());
                saldoCliente.setVencimento(new Date(System.currentTimeMillis() + (espPacote.getPrazo() * saldoCliente.getQuantidade()))); //REVISAR O CALCULO
                saldoCliente.setTipoContratacao(espPacote.getTipoContratacao());
                saldoClienteService.salvar(saldoCliente);
            }

        } else if (pagamento.getContratacao() != null) { //Caso pagamento seja referente contratacao
            
            pagamento.setContratacao(contratacaoService.buscarPorId(pagamento.getContratacao().getId()));
            contratacao = pagamento.getContratacao();

            Integer idEspaco = contratacao.getEspaco().getId();
            Integer idCliente = contratacao.getCliente().getId();

            SaldoCliente saldoCliente = new SaldoCliente();
            SaldoClienteID id = new SaldoClienteID();

            id.setEspaco(espacoService.buscarPorId(idEspaco));
            id.setCliente(clienteService.buscarPorId(idCliente));

            saldoCliente.setVencimento(new Date(System.currentTimeMillis() + (contratacao.getPrazo() * saldoCliente.getQuantidade()))); //REVISAR O CALCULO
            saldoCliente.setTipoContratacao(contratacao.getTipoContratacao());
            saldoCliente.setId(id);
            saldoCliente.setQuantidade(contratacao.getQuantidade());

            if (saldoClienteService.buscarPorId(idCliente, idEspaco) != null) { //caso exista o espaco e cliente associado
                saldoClienteService.salvar(saldoCliente);
            } else {
                saldoClienteService.editarPorIds(idCliente, idEspaco, saldoCliente); //caso nao exista
            }
        } else {
            throw new Exception("ClientePacote ou Contratacao nao encontrada!");
        }
        return super.salvar(pagamento);
    }
}
