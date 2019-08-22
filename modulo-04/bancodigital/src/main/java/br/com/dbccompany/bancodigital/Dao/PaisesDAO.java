package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Paises;

public class PaisesDAO extends AbstractDAO<Paises> {

	@Override
	protected Class<Paises> getEntityClass() {
		return Paises.class;
	}
}
