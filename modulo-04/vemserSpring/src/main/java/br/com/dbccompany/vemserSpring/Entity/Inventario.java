package br.com.dbccompany.vemserSpring.Entity;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
public class Inventario {

    @Id
    @GeneratedValue( generator = "INVENTARIO_SEQ", strategy = GenerationType.SEQUENCE )
    @SequenceGenerator( allocationSize = 1, name = "INVENTARIO_SEQ", sequenceName = "INVENTARIO_SEQ" )
    private Integer id;

    @Column( name = "tamanho",  length = 100, nullable = false)
    private Integer tamanho;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    /*@JoinColumn( name="itens" )
    @ManyToMany( mappedBy = "itens", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private ArrayList<Item> itens = new ArrayList<>();*/

}