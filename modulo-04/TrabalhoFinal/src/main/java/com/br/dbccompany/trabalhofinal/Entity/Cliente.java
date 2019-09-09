package com.br.dbccompany.trabalhofinal.Entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Clientes")
public class Cliente extends AbstractEntity{
    
    @Id
    @SequenceGenerator(allocationSize = 1, name = "CLIENTE_SEQ", sequenceName = "CLIENTE_SEQ")
    @GeneratedValue(generator = "CLIENTE_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false, name = "Nome")
    private String nome;

    @Column(unique = true, nullable = false, name = "Cpf")
    private String cpf;

    @Column(name = "Data_nascimento", nullable = false)
    private Date dataNascimento;

    @OneToMany(mappedBy = "cliente")
    private List<Contato> contatos = new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<ClientePacote> clientesPacotes = new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<Contratacao> contratacoes = new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<SaldoCliente> saldosClientes = new ArrayList<>();

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<ClientePacote> getClientesPacotes() {
        return clientesPacotes;
    }

    public void setClientesPacotes(List<ClientePacote> clientesPacotes) {
        this.clientesPacotes = clientesPacotes;
    }

    public List<Contratacao> getContratacoes() {
        return contratacoes;
    }

    public void setContratacoes(List<Contratacao> contratacoes) {
        this.contratacoes = contratacoes;
    }

    public List<SaldoCliente> getSaldosClientes() {
        return saldosClientes;
    }

    public void setSaldosClientes(List<SaldoCliente> saldosClientes) {
        this.saldosClientes = saldosClientes;
    }

    public void pushSaldosClientes(SaldoCliente... saldos){
        this.saldosClientes.addAll(Arrays.asList(saldos));
    }

    public void pushContratacoes(Contratacao... contratacoes){
        this.contratacoes.addAll(Arrays.asList(contratacoes));
    }

    public void pushClintesPacotes(ClientePacote... clientesPacotes){
        this.clientesPacotes.addAll(Arrays.asList(clientesPacotes));
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void pushContatos(Contato... contatos){
        this.contatos.addAll(Arrays.asList(contatos));
    }
}
