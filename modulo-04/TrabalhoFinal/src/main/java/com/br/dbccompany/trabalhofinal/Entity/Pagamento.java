package com.br.dbccompany.trabalhofinal.Entity;


import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Enum.*;

@Entity
public class Pagamento extends AbstractEntity{

    @Id
    @SequenceGenerator(allocationSize = 1, name = "PAGAMENTO_SEQ", sequenceName = "PAGAMENTO_SEQ")
    @GeneratedValue(generator = "PAGAMENTO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente_pacote")
    private ClientePacote clientePacote;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_contratacao")
    private Contratacao contratacao;

    @Column(name = "tipo_pagamento")
    private TipoPagamento tipoPagamento;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public ClientePacote getClientePacote() {
        return clientePacote;
    }

    public void setClientePacote(ClientePacote clientePacote) {
        this.clientePacote = clientePacote;
    }

    public Contratacao getContratacao() {
        return contratacao;
    }

    public void setContratacao(Contratacao contratacao) {
        this.contratacao = contratacao;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}

