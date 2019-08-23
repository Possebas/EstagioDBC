package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Bancos;

public class BancosDAO extends AbstractDAO<Bancos>{

	@Override
	protected Class<Bancos> getEntityClass() {
		return Bancos.class;
	}
}
