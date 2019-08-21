package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="ESTADOS_SEQ", sequenceName = "ESTADOS_SEQ" )
public class Estados {

	@Id
	@GeneratedValue( generator = "ESTADOS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer idEstado;
	private String nome;
	
	@OneToMany( mappedBy = "estado", cascade = CascadeType.ALL )
	private List<Cidades> cidades = new ArrayList<>();
	
	//@OneToOne
	//@OneToMany
	//@ManyToOne
	//@ManyToMany
	
	@ManyToOne
	@JoinColumn( name = "fk_id_pais" )
	private Paises pais;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}
	
	
}
