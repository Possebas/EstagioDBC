package br.com.dbccompany.vemserSpring.Entity;

import javax.persistence.*;

@Entity
@Table( name = "inventarios_x_itens")
@SequenceGenerator( allocationSize = 1, name = "INVENTARIOS_X_ITENS_SEQ", sequenceName = "INVENTARIOS_X_ITENS_SEQ" )
public class InventarioXItem {

    @Id
    @Column( name = "id_inventario_x_item")
    @GeneratedValue( generator = "INVENTARIOS_X_ITENS_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;
    private Integer quantidade;
    private boolean equipado;

    @ManyToOne
    @JoinColumn( name = "fk_id_item" )
    private Item idItem;

    @ManyToOne
    @JoinColumn( name = "fk_id_inventario" )
    private Inventario idInventario;

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

    public boolean isEquipado() {
        return equipado;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }

    public Item getIdItem() {
        return idItem;
    }

    public void setIdItem(Item idItem) {
        this.idItem = idItem;
    }

    public Inventario getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Inventario idInventario) {
        this.idInventario = idInventario;
    }
}
