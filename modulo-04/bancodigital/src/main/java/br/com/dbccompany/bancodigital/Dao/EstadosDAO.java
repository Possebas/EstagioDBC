package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Estados;

public class EstadosDAO extends AbstractDAO<Estados>{

	@Override
	protected Class<Estados> getEntityClass() {
		return Estados.class;
	}
}
