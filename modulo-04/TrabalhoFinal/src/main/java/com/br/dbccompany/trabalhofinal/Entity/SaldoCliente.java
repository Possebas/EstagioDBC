package com.br.dbccompany.trabalhofinal.Entity;

import java.util.*;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Enum.*;

@Entity
public class SaldoCliente {

    @EmbeddedId
    private SaldoClienteID id;

    @Column(name = "Tipo_contratacao", nullable = false)
    private TipoContratacao tipoContratacao;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private Date vencimento;

    @OneToMany(mappedBy = "saldoCliente")
    private List<Acesso> acessos = new ArrayList<>();

    public SaldoClienteID getId() {
        return id;
    }

    public void setId(SaldoClienteID id) {
        this.id = id;
    }

    public TipoContratacao getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(TipoContratacao tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public List<Acesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<Acesso> acessos) {
        this.acessos = acessos;
    }

    public void adicionarAcessos(Acesso... acessos) {
        this.acessos.addAll(Arrays.asList(acessos));
    }
}
