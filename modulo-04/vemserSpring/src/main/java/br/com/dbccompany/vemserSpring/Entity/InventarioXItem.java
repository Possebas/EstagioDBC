package br.com.dbccompany.vemserSpring.Entity;


import javax.persistence.*;

@Entity
public class InventarioXItem {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "INVENTARIO_ITEM_SEQ", sequenceName = "INVENTARIO_ITEM_SEQ")
    @GeneratedValue( generator = "INVENTARIO_ITEM_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer quantidade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "fk_id_inventario")
    private Inventario inventario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "fk_item_id")
    private Item item;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
