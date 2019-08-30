package br.com.dbccompany.vemserSpring.Entity;

import javax.persistence.*;

@Entity

public class Item  {

    @Id
    @SequenceGenerator( allocationSize = 1, name = "ITEM_SEQ", sequenceName = "ITEM_SEQ" )
    @GeneratedValue( generator = "ITEM_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column( name = "descricao" )
    private String descricao;

/*
    @ManyToOne
    @JoinColumn( name = "fk_id_inventario" )
    private Inventario inventario; 
    */

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
