package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.EnderecosDTO;
import br.com.dbccompany.bancodigital.Entity.Bairros;
import br.com.dbccompany.bancodigital.Entity.Enderecos;


public class EnderecosDAO extends AbstractDAO<Enderecos> {
	
	private static final BairrosDAO BAIRROS_DAO = new BairrosDAO();
	
	public Enderecos parseFrom( EnderecosDTO dto) {
		Enderecos endereco = null;
		if( dto.getId() != null ) {
			endereco = buscar( dto.getId() );
		}else {
			endereco = new Enderecos();
		}
		endereco.setLogradouro(dto.getLogradouro());
		endereco.setNumero(dto.getNumero());
		endereco.setComplemento(dto.getComplemento());	
		Bairros bairro = BAIRROS_DAO.parseFrom(dto.getBairro());
		endereco.setBairro(bairro);
		return endereco;
	}
	
	@Override
	protected Class<Enderecos> getEntityClass() {
		return Enderecos.class;
	}
}
