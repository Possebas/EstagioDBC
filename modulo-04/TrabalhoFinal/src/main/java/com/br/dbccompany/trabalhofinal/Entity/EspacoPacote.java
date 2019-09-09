package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Enum.*;

@Entity
public class EspacoPacote extends AbstractEntity{

    @Id
    @SequenceGenerator(allocationSize = 1, name = "ESPACO_PACOTE_SEQ", sequenceName = "ESPACO_PACOTE_SEQ")
    @GeneratedValue(generator = "ESPACO_PACOTE_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_espaco")
    private Espaco espaco;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pacote")
    private Pacote pacote;

    @Column(name = "tipo_contratacao")
    private TipoContratacao tipoContratacao;

    private int quantidade;

    private int prazo;

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

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
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

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

}
