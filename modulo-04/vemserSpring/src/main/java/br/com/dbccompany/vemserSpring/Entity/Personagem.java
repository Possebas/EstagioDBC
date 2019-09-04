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
    public Integer id;

    @Column(name = "nome", length = 100)
    public String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_personagem")
    public RacaType tipoPersonagem = RacaType.NAO_DEFINIDO;

    @Column(name = "vida", length = 100)
    public Double vida;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 100)
    public Status status;

    @Column(name = "experiencia", length = 100)
    public Double experiencia;

    @OneToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
    @JoinColumn(name = "id_inventario")
    public Inventario inventario;

    @Column(name = "dano", length = 100)
    public Double dano;

    public int qtdExperienciaPorAtaque;

    public int qtdAtaques;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        //inventario = new Inventario(0);
        experiencia = 0.0;
        qtdAtaques  = 0;
    }

    @Override
	public Integer getId() {
		return id;
	}

    public String getNome() {
        return this.nome;
    }

    public Double getVida() {
        return this.vida;
    }

    public Status getStatus() {
        return this.status;
    }

    public Double getExperiencia() {
        return this.experiencia;
    }

 /*   public Inventario getInventario() {
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

    public void aumentarXp() {
        this.experiencia++;
    }
    
    public boolean podeSofrerDano() {
        return this.vida > 0;
    }

/*    public void ganharItem(Item item) {
        this.inventario.adicionarItem(item);
    }

    public void perderItem(Item item) {
        this.inventario.removerItem(item);
    }*/


    public Double calcularDano() {
        return this.dano;
    }

}
