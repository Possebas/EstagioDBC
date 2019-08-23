package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Enderecos;

public class EnderecosDAO extends AbstractDAO<Enderecos>{

	@Override
	protected Class<Enderecos> getEntityClass() {
		return Enderecos.class;
	}

}
