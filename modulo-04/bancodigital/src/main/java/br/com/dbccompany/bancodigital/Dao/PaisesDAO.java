package br.com.dbccompany.bancodigital.Dao;

import br.com.dbccompany.bancodigital.Dto.PaisesDTO;
import br.com.dbccompany.bancodigital.Entity.Paises;

public class PaisesDAO extends AbstractDAO<Paises>{
 
	public Paises parseFrom(PaisesDTO dto) {
		Paises paises = null;
		if (dto.getIdPaises() != null) {
			paises = buscar(dto.getIdPaises());
		}
		paises.setNome(dto.getNome());
		
		return paises;
	}
	
	@Override
	protected Class<Paises> getEntityClass() {
		return Paises.class;
	}
}
