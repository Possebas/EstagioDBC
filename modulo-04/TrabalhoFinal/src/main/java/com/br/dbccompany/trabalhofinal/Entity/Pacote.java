package com.br.dbccompany.trabalhofinal.Entity;

import java.util.*;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Utils;

@Entity
@Table(name = "Pacotes")
public class Pacote extends AbstractEntity {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "PACOTE_SEQ", sequenceName = "PACOTE_SEQ")
    @GeneratedValue(generator = "PACOTE_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "Valor")
    private double valor = 0.0;

    @Transient
    private String valorFormatado = "";

    @OneToMany(mappedBy = "pacote")
    private List<EspacoPacote> espacosPacotes = new ArrayList<>();

    @OneToMany(mappedBy = "pacote")
    private List<ClientePacote> clientesPacotes = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<EspacoPacote> getEspacosPacotes() {
        return espacosPacotes;
    }

    public void setEspacosPacotes(List<EspacoPacote> espacosPacotes) {
        this.espacosPacotes = espacosPacotes;
    }

    public List<ClientePacote> getClientesPacotes() {
        return clientesPacotes;
    }

    public void setClientesPacotes(List<ClientePacote> clientesPacotes) {
        this.clientesPacotes = clientesPacotes;
    }

    public void pushClientesPacotes(ClientePacote... clientesPacotes){
        this.clientesPacotes.addAll(Arrays.asList(clientesPacotes));
    }

    public void pushEspacosPacotes(EspacoPacote... espacosPacotes){
        this.espacosPacotes.addAll(Arrays.asList(espacosPacotes));
    }
    
    public String getValorReais() {
        return (valorFormatado != null)? valorFormatado : Utils.parseToString(valor);
    }

    public void setValorReais(String valorFormatado) {
        this.valorFormatado = valorFormatado;
        this.valor = Utils.parseToDouble(valorFormatado);
    }
}
