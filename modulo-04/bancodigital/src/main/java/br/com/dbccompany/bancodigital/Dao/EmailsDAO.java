package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Correntistas;

public class EmailsDAO extends AbstractDAO<Correntistas>{

	@Override
	protected Class<Correntistas> getEntityClass() {
		return Correntistas.class;
	}

}
