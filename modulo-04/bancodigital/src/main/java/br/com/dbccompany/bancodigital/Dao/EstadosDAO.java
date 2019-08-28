package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.EstadosDTO;
import br.com.dbccompany.bancodigital.Entity.Estados;
import br.com.dbccompany.bancodigital.Entity.Paises;

public class EstadosDAO extends AbstractDAO<Estados>{
	
	private static final PaisesDAO PAISES_DAO = new PaisesDAO();
	
	public Estados parseFrom( EstadosDTO dto) {
		Estados estado = null;
		if( dto.getId() != null ) {
			estado = buscar( dto.getId() );
		}else {
			estado = new Estados();
		}
		estado.setNome(dto.getNome());
		Paises pais = PAISES_DAO.parseFrom(dto.getPais());
		estado.setPais(pais);
		return estado;
	}
	
	@Override
	protected Class<Estados> getEntityClass() {
		return Estados.class;
	}
}
