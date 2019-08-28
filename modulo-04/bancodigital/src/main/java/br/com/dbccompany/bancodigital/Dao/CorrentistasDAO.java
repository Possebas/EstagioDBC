package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.CorrentistasDTO;
import br.com.dbccompany.bancodigital.Entity.Correntistas;

public class CorrentistasDAO extends AbstractDAO<Correntistas> {
	
	@SuppressWarnings("unused")
	private static final ClientesDAO CLIENTES_DAO = new ClientesDAO();
	
	public Correntistas parseFrom( CorrentistasDTO dto) {
		Correntistas correntistas = null;
		if( dto.getId() != null ) {
			correntistas = buscar( dto.getId() );
		}else {
			correntistas = new Correntistas();
		}
		//correntistas.setNome(dto.getNome());
		correntistas.setRazaoSocial(dto.getRazaoSocial());
		correntistas.setCnpj(dto.getCnpj());
		correntistas.setSaldo(dto.getSaldo());
		correntistas.setTipo(dto.getTipo());
		
		return correntistas;
	}
	
	@Override
	protected Class<Correntistas> getEntityClass() {
		return Correntistas.class;
	}
}