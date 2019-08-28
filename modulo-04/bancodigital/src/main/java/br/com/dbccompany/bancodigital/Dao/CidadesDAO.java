package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.CidadesDTO;
import br.com.dbccompany.bancodigital.Entity.Cidades;
import br.com.dbccompany.bancodigital.Entity.Estados;


public class CidadesDAO extends AbstractDAO<Cidades> {
	private static final EstadosDAO ESTADOS_DAO = new EstadosDAO();
	
	public Cidades parseFrom( CidadesDTO dto) {
		Cidades cidade= null;
		if( dto.getId() != null ) {
			cidade = buscar( dto.getId() );
		}
		else {
			cidade = new Cidades();
		}
		cidade.setNome(dto.getNome());
		Estados estado = ESTADOS_DAO.parseFrom(dto.getEstado());
		cidade.setEstado(estado);
		return cidade;
	}
	
	@Override
	protected Class<Cidades> getEntityClass() {
		return Cidades.class;
	}
}
