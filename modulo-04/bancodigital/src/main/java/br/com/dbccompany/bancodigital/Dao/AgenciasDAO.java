package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.AgenciasDTO;
import br.com.dbccompany.bancodigital.Entity.Agencias;
import br.com.dbccompany.bancodigital.Entity.Bancos;

public class AgenciasDAO extends AbstractDAO<Agencias> {
	
	private static final BancosDAO BANCOS_DAO = new BancosDAO();
	
	public Agencias parseFrom( AgenciasDTO dto) {
		Agencias agencia = null;
		if( dto.getIdBancos() != null ) {
			agencia = buscar( dto.getIdBancos() );
		}else {
			agencia = new Agencias();
		}
		agencia.setNome(dto.getNome());
		agencia.setCodigo(dto.getCodigo());
		Bancos banco = BANCOS_DAO.parseFrom(dto.getBancos());
		agencia.setBanco(banco);
		return agencia;
	}
	
	@Override
	protected Class<Agencias> getEntityClass() {
		return Agencias.class;
	}
}
