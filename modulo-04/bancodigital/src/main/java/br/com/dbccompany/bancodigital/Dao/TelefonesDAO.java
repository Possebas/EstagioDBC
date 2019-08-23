package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Telefones;

public class TelefonesDAO extends AbstractDAO<Telefones>{

	@Override
	protected Class<Telefones> getEntityClass() {
		return Telefones.class;
	}
}
