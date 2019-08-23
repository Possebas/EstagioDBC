package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "ESTADOS_SEQ", sequenceName = "ESTADOS_SEQ" )
public class Estados extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_estado" )		
	@GeneratedValue( generator = "ESTADOS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "nome", length = 100, nullable = false )	
	private String nome;
	
	@OneToMany( mappedBy = "estado", cascade = CascadeType.ALL )
	private List<Cidades> cidades = new ArrayList<>();	
	
	@ManyToOne
	@JoinColumn( name = "fk_id_pais" )
	private Paises pais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cidades> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidades> cidades) {
		this.cidades = cidades;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
