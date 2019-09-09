package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

import java.io.Serializable;

@Embeddable
public class SaldoClienteID implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_espaco")
    private Espaco espaco;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }
}
