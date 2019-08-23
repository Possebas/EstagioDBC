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
@SequenceGenerator( allocationSize = 1, name = "CIDADES_SEQ", sequenceName = "CIDADES_SEQ" )
public class Cidades extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_cidade" )		
	@GeneratedValue( generator = "CIDADES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "nome", length = 100, nullable = false )	
	private String nome;
	
	@ManyToOne
	@JoinColumn( name = "fk_id_estado" )
	private Estados estado;

	@OneToMany( mappedBy = "cidade", cascade = CascadeType.ALL )
	private List<Bairros> bairros = new ArrayList<>();	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
