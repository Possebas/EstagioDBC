package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="PAISES_SEQ", sequenceName = "PAISES_SEQ" )
public class Paises {
	
	@Id
	@GeneratedValue( generator = "PAISES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer idPais;
	private String nome;
	
	@OneToMany( mappedBy = "pais", cascade = CascadeType.ALL )
	private List<Estados> estados = new ArrayList<>();
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
