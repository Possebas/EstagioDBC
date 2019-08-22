package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Elfo {
	
	@Id
	@GeneratedValue( generator  = "ELFO_SEQ", strategy = GenerationType.SEQUENCE )
	@SequenceGenerator( allocationSize = 1, name ="ELFO_SEQ", sequenceName = "ELFO_SEQ" )
	private Integer idElfo;
	
	private String nome;
	
	public Integer getIdElfo() {
		return idElfo;
	}

	public void setIdElfo(Integer idElfo) {
		this.idElfo = idElfo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
