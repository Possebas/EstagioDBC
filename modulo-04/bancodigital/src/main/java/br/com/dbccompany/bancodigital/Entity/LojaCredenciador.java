package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.EmbeddedId;

public class LojaCredenciador {
	
	@EmbeddedId
	private LojaCredenciadorId id;
	
	private String nomeString;
	
	public LojaCredenciadorId getId() {
		return id;
	}

	public void setId(LojaCredenciadorId id) {
		this.id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	
}
