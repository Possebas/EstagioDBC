package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Cidades;

public class CicadesDAO extends AbstractDAO<Cidades> {

	@Override
	protected Class<Cidades> getEntityClass() {
		return Cidades.class;
	}

}
