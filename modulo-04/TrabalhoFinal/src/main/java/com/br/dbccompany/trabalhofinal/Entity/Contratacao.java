package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Enum.*;

@Entity
public class Contratacao extends AbstractEntity {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "CONTRATACAO_SEQ", sequenceName = "CONTRATACAO_SEQ")
    @GeneratedValue(generator = "CONTRATACAO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_espaco")
    private Espaco espaco;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "Tipo_contratacao")
    @Enumerated(EnumType.STRING)
    private TipoContratacao tipoContratacao;

    @Column(nullable = false)
    private int quantidade = 0;

    @Column(name = "desconto")
    private double desconto = 0.0;

    @Column(nullable = false)
    private int prazo = 0;

    @Transient
    private String descontoFormatado = "";

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public String getValorFormatado() {
        return (descontoFormatado != null)? descontoFormatado : Utils.parseToString(desconto);
    }

    public void setValorFormatado(String desconto) {
        this.descontoFormatado = desconto;
        this.desconto = Utils.parseToDouble(descontoFormatado);
    }
    
}
