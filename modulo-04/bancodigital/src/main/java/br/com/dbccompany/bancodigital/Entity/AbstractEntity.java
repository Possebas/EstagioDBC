package br.com.dbccompany.bancodigital.Entity;

import java.io.Serializable;

public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract Integer getId();
	
}
