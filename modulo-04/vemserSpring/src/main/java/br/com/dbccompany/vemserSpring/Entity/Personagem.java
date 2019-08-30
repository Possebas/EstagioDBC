package br.com.dbccompany.vemserSpring.Entity;

import br.com.dbccompany.vemserSpring.Enum.Status;


import br.com.dbccompany.vemserSpring.Entity.AbstractEntity;
import br.com.dbccompany.vemserSpring.Enum.TipoPersonagem;

import javax.persistence.*;

@Entity
@Table(name="Personagens")
@SequenceGenerator( allocationSize = 1, name = "PERSONAGEM_SEQ", sequenceName = "PERSONAGEM_SEQ" )
public abstract class Personagem extends AbstractEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_personagem")
    @GeneratedValue( generator = "PERSONAGEM_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column(name = "nome", length = 100, nullable = false)
    protected String nome;

    @Column(name = "tipo_personagem")
    protected TipoPersonagem tipoPersonagem;

    @Column(name = "vida", length = 100)
    protected Double vida;

    @Column(name = "status", length = 100)
    protected Status status;

    @Column(name = "experiencia", length = 100)
    protected Integer experiencia;

    @OneToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name = "id_inventario")
    protected Inventario inventario;

    @Column(name = "dano", length = 100)
    protected Double dano;

    protected int qtdExperienciaPorAtaque;

    protected double qtdDano;

    protected int qtdAtaques;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        inventario = new Inventario(0);
        qtdDano = 0.0;
        experiencia = 0;
        qtdAtaques  = 0;
    }

    public Personagem(String nome) {
        this.nome = nome;
        this.tipoPersonagem = TipoPersonagem.NAO_DEFINIDO;
    }

    public Personagem(String nome, TipoPersonagem tipo) {
        this.nome = nome;
        this.tipoPersonagem = tipo;
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
        return this.inventario;
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
        this.inventario.adicionarItem(item);
    }

    protected void perderItem(Item item) {
        this.inventario.removerItem(item);
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
