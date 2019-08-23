package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) 
public class Elfo {
	
	@Id
	@SequenceGenerator( allocationSize = 1, name ="ELFO_SEQ", sequenceName = "ELFO_SEQ" )
	@GeneratedValue( generator = "ELFO_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id_elfo;
	
	private String nome;

	public Integer getId_elfo() {
		return id_elfo;
	}

	public void setId_elfo(Integer id_elfo) {
		this.id_elfo = id_elfo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
