package com.br.dbccompany.trabalhofinal.Entity;

import java.util.*;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Utils;

@Entity
public class Espaco extends AbstractEntity{

    @Id
    @SequenceGenerator(allocationSize = 1, name = "ESPACO_SEQ", sequenceName = "ESPACO_SEQ")
    @GeneratedValue(generator = "ESPACO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(unique = true, nullable = false, name = "nome")
    private String nome;

    @Column(name = "qtd_pessoas", nullable = false)
    private int qtdPessoas = 0;

    @Column(nullable = false, name = "Valor")
    private double valor = 0.0;

    @Transient
    private String valorFormatado = "";

    @OneToMany(mappedBy = "espaco")
    private List<EspacoPacote> espacosPacotes = new ArrayList<>();

    @OneToMany(mappedBy = "espaco")
    private List<SaldoCliente> saldosClientes = new ArrayList<>();

    @OneToMany(mappedBy = "espaco")
    private List<Contratacao> contratacoes = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
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

    public List<SaldoCliente> getSaldosClientes() {
        return saldosClientes;
    }

    public void setSaldosClientes(List<SaldoCliente> saldosClientes) {
        this.saldosClientes = saldosClientes;
    }

    public List<Contratacao> getContratacoes() {
        return contratacoes;
    }

    public void setContratacoes(List<Contratacao> contratacoes) {
        this.contratacoes = contratacoes;
    }

    public void pushContratacoes(Contratacao... contratacoes){
        this.contratacoes.addAll(Arrays.asList(contratacoes));
    }

    public void pushSaldosClientes(SaldoCliente... saldosClientes){
        this.saldosClientes.addAll(Arrays.asList(saldosClientes));
    }

    public void pushEspacosPacotes(EspacoPacote... espacosPacotes){
        this.espacosPacotes.addAll(Arrays.asList(espacosPacotes));
    }
    
    public String getValorFormatado() {
        return (valorFormatado != null)? valorFormatado : Utils.parseToString(valor);
    }

    public void setValorFormatado(String valorFormatado) {
        this.valorFormatado = valorFormatado;
        this.valor = Utils.parseToDouble(valorFormatado);
    }

}
