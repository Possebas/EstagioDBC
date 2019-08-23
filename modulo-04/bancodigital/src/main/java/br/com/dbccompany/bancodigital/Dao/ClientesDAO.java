package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Clientes;

public class ClientesDAO extends AbstractDAO<Clientes>{

	@Override
	protected Class<Clientes> getEntityClass() {
		return Clientes.class;
	}
}
