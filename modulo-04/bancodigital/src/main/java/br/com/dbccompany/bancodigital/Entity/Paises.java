package br.com.dbccompany.bancodigital.Entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "PAISES_SEQ", sequenceName = "PAISES_SEQ" )
public class Paises extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_pais" )	
	@GeneratedValue( generator = "PAISES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;

	@Column( name = "nome", length = 100, nullable = false )	
	private String nome;
	
	@OneToMany( mappedBy = "pais", cascade = CascadeType.ALL )
	private List<Estados> estados = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estados> getEstados() {
		return estados;
	}

	public void setEstados(List<Estados> estados) {
		this.estados = estados;
	}

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
}
