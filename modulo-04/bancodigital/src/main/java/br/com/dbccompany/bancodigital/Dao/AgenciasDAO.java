package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.AgenciasDTO;
import br.com.dbccompany.bancodigital.Entity.Agencias;
import br.com.dbccompany.bancodigital.Entity.Bancos;

public class AgenciasDAO extends AbstractDAO<Agencias>{
	
	private static final BancosDAO BANCOS_DAO = new BancosDAO();
	
	public Agencias parseFrom(AgenciasDTO dto) {

		Agencias agencias = null;

		if (dto.getIdBancos() != null) {
			agencias = buscar(dto.getIdBancos());
		} else {
			agencias = new Agencias();
		}

		Bancos bancos = BANCOS_DAO.parseFrom(dto.getBancos());
		
		agencias.setBanco(bancos);
		agencias.setNome(dto.getNome());

		return agencias;
	}
	
	@Override
	protected Class<Agencias> getEntityClass() {
		return Agencias.class;
	}
}
