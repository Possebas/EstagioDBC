package br.com.dbccompany.bancodigital.Dao;


import br.com.dbccompany.bancodigital.Dto.ClientesDTO;
import br.com.dbccompany.bancodigital.Entity.Clientes;
import br.com.dbccompany.bancodigital.Entity.Enderecos;


public class ClientesDAO extends AbstractDAO<Clientes> {
	
private static final EnderecosDAO ENDERECOS_DAO = new EnderecosDAO();
	
	public Clientes parseFrom( ClientesDTO dto) {
		Clientes cliente = null;
		if( dto.getIdCliente() != null ) {
			cliente = buscar( dto.getIdCliente() );
		}else {
			cliente = new Clientes();
		}
		cliente.setNome(dto.getNome());
		cliente.setCpf(dto.getCpf());
		cliente.setRg(dto.getRg());
		cliente.setConjuge(dto.getConjuge());
		cliente.setDataNascimento(dto.getDataNascimento());
		cliente.setEstadoCivil(dto.getEstadoCivil());
		Enderecos endereco = ENDERECOS_DAO.parseFrom(dto.getEnderecos());
		cliente.setEndereco(endereco);
		return cliente;
	}
	
	@Override
	protected Class<Clientes> getEntityClass() {
		return Clientes.class;
	}
}
