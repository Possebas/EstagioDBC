package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.BairrosDTO;
import br.com.dbccompany.bancodigital.Entity.Bairros;
import br.com.dbccompany.bancodigital.Entity.Cidades;

public class BairrosDAO extends AbstractDAO<Bairros>{

	private static final CidadesDAO CIDADES_DAO = new CidadesDAO();
	
	public Bairros parseFrom(BairrosDTO dto) {

		Bairros bairros = null;

		if (dto.getIdBairros() != null) {
			bairros = buscar(dto.getIdBairros());
		} else {
			bairros = new Bairros();
		}

		Cidades cidades = CIDADES_DAO.parseFrom(dto.getCidades());
		
		bairros.setCidade(cidades);
		bairros.setNome(dto.getNome());

		return bairros;
	}

	@Override
	protected Class<Bairros> getEntityClass() {
		return Bairros.class;
	}
}
