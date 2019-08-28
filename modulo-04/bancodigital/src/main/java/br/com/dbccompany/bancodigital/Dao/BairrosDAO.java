package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.BairrosDTO;
import br.com.dbccompany.bancodigital.Entity.Bairros;
import br.com.dbccompany.bancodigital.Entity.Cidades;

public class BairrosDAO extends AbstractDAO<Bairros> {
	
	private static final CidadesDAO CIDADES_DAO = new CidadesDAO();
	
	public Bairros parseFrom( BairrosDTO dto) {
		Bairros bairro = null;
		if( dto.getId() != null ) {
			bairro = buscar( dto.getId() );
		} else {
			bairro = new Bairros();
		}
		bairro.setNome(dto.getNome());
		Cidades cidade = CIDADES_DAO.parseFrom(dto.getCidade());
		bairro.setCidade(cidade);
		return bairro;
	}
	
	@Override
	protected Class<Bairros> getEntityClass() {
		return Bairros.class;
	}
}
