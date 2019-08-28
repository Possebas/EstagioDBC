package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.BancosDTO;
import br.com.dbccompany.bancodigital.Entity.Bancos;

public class BancosDAO extends AbstractDAO<Bancos> {

	public Bancos parseFrom( BancosDTO dto) {
		Bancos bancos = null;
		if( dto.getId() != null ) {
			bancos = buscar( dto.getId() );
		}else {
			bancos = new Bancos();
		}
		bancos.setNome(dto.getNome());
		return bancos;
	}
	
	@Override
	protected Class<Bancos> getEntityClass() {
		return Bancos.class;
	}
}
