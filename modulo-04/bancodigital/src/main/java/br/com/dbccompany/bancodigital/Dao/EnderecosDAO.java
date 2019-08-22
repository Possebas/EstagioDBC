package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Entity.Bairros;

public class EnderecosDAO extends AbstractDAO<Bairros>{

	@Override
	protected Class<Bairros> getEntityClass() {
		// TODO Auto-generated method stub
		return Bairros.class;
	}
}
