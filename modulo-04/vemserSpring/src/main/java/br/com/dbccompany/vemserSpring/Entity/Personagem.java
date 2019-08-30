package br.com.dbccompany.vemserSpring.Entity;

import br.com.dbccompany.vemserSpring.Enum.RacaType;
import br.com.dbccompany.vemserSpring.Enum.Status;
import br.com.dbccompany.vemserSpring.Abstract.AbstractEntity;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="Personagens")
public abstract class Personagem extends AbstractEntity {

    @Id
    @SequenceGenerator( allocationSize = 1, name = "PERSONAGEM_SEQ", sequenceName = "PERSONAGEM_SEQ" )
    @Column(name = "id_personagem")
    @GeneratedValue( generator = "PERSONAGEM_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column(name = "nome", length = 100, nullable = false)
    protected String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_personagem")
    protected RacaType tipoPersonagem;

    @Column(name = "vida", length = 100)
    protected Double vida;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 100)
    protected Status status;

    @Column(name = "experiencia", length = 100)
    protected Double experiencia;

/*    @OneToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name = "id_inventario")
    protected Inventario inventario;*/

    @Column(name = "dano", length = 100)
    protected Double dano;

    protected int qtdExperienciaPorAtaque;

    protected double qtdDano;

    protected int qtdAtaques;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        //inventario = new Inventario(0);
        qtdDano = 0.0;
        experiencia = 0.0;
        qtdAtaques  = 0;
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

    protected Double getExperiencia() {
        return this.experiencia;
    }

 /*   protected Inventario getInventario() {
        return this.inventario;
    }*/

    public RacaType getTipoPersonagem() {
        return tipoPersonagem;
    }

    public void setTipoPersonagem(RacaType tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
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

/*    protected void ganharItem(Item item) {
        this.inventario.adicionarItem(item);
    }

    protected void perderItem(Item item) {
        this.inventario.removerItem(item);
    }*/


    protected Double calcularDano() {
        return this.dano;
    }

}
