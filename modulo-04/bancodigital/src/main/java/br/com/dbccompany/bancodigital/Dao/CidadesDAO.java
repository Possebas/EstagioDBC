package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.CidadesDTO;
import br.com.dbccompany.bancodigital.Entity.Cidades;
import br.com.dbccompany.bancodigital.Entity.Estados;

public class CidadesDAO extends AbstractDAO<Cidades>{

	private static final EstadosDAO ESTADOS_DAO = new EstadosDAO();
	
	public Cidades parseFrom(CidadesDTO dto) {

		Cidades cidades = null;

		if (dto.getIdCidades() != null) {
			cidades = buscar(dto.getIdCidades());
		} else {
			cidades = new Cidades();
		}

		Estados estados = ESTADOS_DAO.parseFrom(dto.getEstados());
		
		cidades.setEstado(estados);
		cidades.setNome(dto.getNome());

		return cidades;
	}

	@Override
	protected Class<Cidades> getEntityClass() {
		return Cidades.class;
	}
}
