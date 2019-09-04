package br.com.dbccompany.vemserSpring.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator( allocationSize = 1, name = "INVENTARIOS_SEQ", sequenceName = "INVENTARIOS_SEQ" )
public class Inventario {

    @Id
    @Column( name = "id_inventario" )
    @GeneratedValue( generator = "INVENTARIOS_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;
    private Integer tamanho;

    @OneToOne
    @JoinColumn( name = "fk_id_personagem" )
    private Personagem idPersonagem;

    @OneToMany ( mappedBy = "idInventario", cascade = CascadeType.ALL )
    private List<InventarioXItem> listaInventariosItens = new ArrayList<>();

    {
        tamanho = 0;
    }

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

    public List<InventarioXItem> getListaInventariosItens() {
        return listaInventariosItens;
    }

    public void setListaInventariosItens(List<InventarioXItem> listaInventariosItens) {
        this.listaInventariosItens = listaInventariosItens;
    }

    public Personagem getPersonagem() {
        return idPersonagem;
    }

    public void setPersonagem(Personagem idPersonagem) {
        this.idPersonagem = idPersonagem;
    }
}
