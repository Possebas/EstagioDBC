package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class LojaCredenciador {

	@EmbeddedId
	private LojaCredenciadorId id;
	
	private String nome;

	public LojaCredenciadorId getId() {
		return id;
	}

	//ao setar o id tenho que instanciar um "LojaCredenciadorId", passar os campos e ai sim setar
	public void setId(LojaCredenciadorId id) {  
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
