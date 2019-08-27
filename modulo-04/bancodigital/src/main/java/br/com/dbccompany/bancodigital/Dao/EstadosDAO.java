package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.EstadosDTO;
import br.com.dbccompany.bancodigital.Entity.Estados;
import br.com.dbccompany.bancodigital.Entity.Paises;

public class EstadosDAO extends AbstractDAO<Estados>{

	private static final PaisesDAO PAISES_DAO = new PaisesDAO();
	
	public Estados parseFrom(EstadosDTO dto) {

		Estados estados = null;
		if (dto.getIdEstados() != null) {
			estados = buscar(dto.getIdEstados());
		} else {
			estados = new Estados();
		}
		Paises paises = PAISES_DAO.parseFrom(dto.getPaises());
		estados.setPais(paises);
		estados.setNome(dto.getNome());
		
		return estados;
	}
	
	@Override
	protected Class<Estados> getEntityClass() {
		return Estados.class;
	}
}
