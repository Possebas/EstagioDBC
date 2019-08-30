package br.com.dbccompany.vemserSpring.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@SequenceGenerator( allocationSize = 1, name = "ITEM_SEQ", sequenceName = "ITEM_SEQ" )
public class Item extends AbstractEntity{

    @Id
    @Column( name = "id_item" )
    @GeneratedValue( generator = "ITEM_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column( name = "quantidade" )
    private Integer quantidade;

    @Column( name = "descricao" )
    private String descricao;

    /*
    @ManyToOne
    @JoinColumn( name = "fk_id_inventario" )
    private Inventario inventario; 
    */

    public Item(Integer quantidade, String descricao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
