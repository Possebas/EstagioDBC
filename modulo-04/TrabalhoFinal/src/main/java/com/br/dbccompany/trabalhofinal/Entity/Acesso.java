package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Acessos")
public class Acesso extends AbstractEntity {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "ACESSO_SEQ", sequenceName = "ACESSO_SEQ")
    @GeneratedValue(generator = "ACESSO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumns({
            @JoinColumn(name = "id_espaco_saldo_cliente", referencedColumnName = "id_espaco"),
            @JoinColumn(name = "id_cliente_saldo_cliente", referencedColumnName = "id_cliente")
    })
    private SaldoCliente saldoCliente;

    @Column(name = "Is_Entrada")
    private boolean isEntrada = false;

    private Date data = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SaldoCliente getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(SaldoCliente saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public boolean getIsEntrada() {
        return isEntrada;
    }

    public void setIsEntrada(boolean entrada) {
        isEntrada = entrada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
