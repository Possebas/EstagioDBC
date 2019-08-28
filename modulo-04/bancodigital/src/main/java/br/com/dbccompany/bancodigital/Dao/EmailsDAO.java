package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Emails;

public class EmailsDAO extends AbstractDAO<Emails> {
	@Override
	protected Class<Emails> getEntityClass() {
		return Emails.class;
	}
}
