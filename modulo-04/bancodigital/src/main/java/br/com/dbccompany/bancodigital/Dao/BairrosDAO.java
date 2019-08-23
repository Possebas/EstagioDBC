package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Bairros;

public class BairrosDAO extends AbstractDAO<Bairros>{

	@Override
	protected Class<Bairros> getEntityClass() {
		return Bairros.class;
	}
}
