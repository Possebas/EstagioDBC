package br.com.dbccompany.vemserSpring.Entity;

import br.com.dbccompany.vemserSpring.Enum.Status;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="PERSONAGEM")
@SequenceGenerator( allocationSize = 1, name = "PERSONAGEM_SEQ", sequenceName = "PERSONAGEM_SEQ" )
public abstract class Personagem extends <AbstractPersonagem>{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_personagem")
    @GeneratedValue( generator = "PERSONAGEM_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column(name = "nome", length = 100, nullable = false)
    protected String nome;

    @Column(name = "vida", length = 100, nullable = true)
    protected Double vida;

    @Column(name = "status", length = 100, nullable = true)
    protected Status status;

    @Column(name = "experiencia", length = 100, nullable = true)
    protected Integer experiencia;

    @OneToOne
    @JoinColumn(name = "id_inventario", fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    protected Inventario inventario;

    @Column(name = "dano", length = 100, nullable = true)
    protected Double dano;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        inventario = new Inventario(0);
        qtdDano = 0.0;
        experiencia = 0;
        qtdAtaques  = 0;
    }

    protected Personagem(String nome) {
        this.nome = nome;
    }

    @Override
	public Integer getId() {
		return id;
	}

    protected String getNome() {
        return this.nome;
    }

    protected Double getVida() {
        return this.vida;
    }

    protected Status getStatus() {
        return this.status;
    }

    protected Integer getExperiencia() {
        return this.experiencia;
    }

    protected Inventario getInventario() {
        return this.mochila;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    protected void aumentarXp() {
        this.experiencia++;
    }
    
    protected boolean podeSofrerDano() {
        return this.vida > 0;
    }

    protected void ganharItem(Item item) {
        this.mochila.adicionar(item);
    }

    protected void perderItem(Item item) {
        this.mochila.remover(item);
    }

    protected Double calcularDano() {
        return this.dano;
    }

    protected void sofrerDano() {
        this.vida -= this.vida >= this.dano ? calcularDano() : this.vida;
        if(this.vida == 0.0) {
            this.status = Status.MORTO;
        }
        else {
            this.status = Status.SOFREU_DANO;
        }
    }
}
