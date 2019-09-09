package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Clientes_Pacotes")
public class ClientePacote extends AbstractEntity {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "CLIENTE_PACOTE_SEQ", sequenceName = "CLIENTE_PACOTE_SEQ")
    @GeneratedValue(generator = "CLIENTE_PACOTE_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "Id_cliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "Id_pacote")
    private Pacote pacote;

    @Column(name = "Quantidade")
    public int quantidade;

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
