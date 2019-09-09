package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Contatos")
public class Contato extends AbstractEntity{

    @Id
    @SequenceGenerator(allocationSize = 1, name = "CONTATO_SEQ", sequenceName = "CONTATO_SEQ")
    @GeneratedValue(generator = "CONTATO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_tipo_contato")
    private TipoContato tipoContato;

    private String valor;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
