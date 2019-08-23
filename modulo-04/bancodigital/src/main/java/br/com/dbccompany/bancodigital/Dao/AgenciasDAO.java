package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Agencias;

public class AgenciasDAO extends AbstractDAO<Agencias>{

	@Override
	protected Class<Agencias> getEntityClass() {
		return Agencias.class;
	}
}
