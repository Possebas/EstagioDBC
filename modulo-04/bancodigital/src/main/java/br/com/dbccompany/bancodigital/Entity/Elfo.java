package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance( strategy = InheritanceType.JOINED )  //para outros elfos que herdarem implementam o id do pai  (Elfo)
public class Elfo {

	@Id
	@SequenceGenerator( allocationSize = 1, name = "ELFOS_SEQ", sequenceName = "ELFOS_SEQ" )
	@GeneratedValue( generator = "ELFOS_SEQ", strategy = GenerationType.SEQUENCE )	
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
