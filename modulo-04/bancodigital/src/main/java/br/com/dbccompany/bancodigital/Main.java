package br.com.dbccompany.bancodigital;

import br.com.dbccompany.bancodigital.Dto.EstadosDTO;
import br.com.dbccompany.bancodigital.Dto.PaisesDTO;
import br.com.dbccompany.bancodigital.Service.EstadosService;
import br.com.dbccompany.bancodigital.Service.PaisesService;

public class Main {
	
	public static void main(String[] args) {
		PaisesService paisService = new PaisesService();
		PaisesDTO paises1 = new PaisesDTO();
		PaisesDTO paises2 = new PaisesDTO();
		PaisesDTO paises3 = new PaisesDTO();
		PaisesDTO paises4 = new PaisesDTO();
		
		paises1.setNome("Argentina");
		paisService.salvarPaises(paises1);
		System.out.println("Pais 1 salvo => "+ paises1.getNome());
		paises2.setNome("Brasil");
		paisService.salvarPaises(paises2);
		System.out.println("Pais 2 salvo => "+ paises2.getNome());
		paises3.setNome("Uruguai");
		paisService.salvarPaises(paises3);
		System.out.println("Pais 3 salvo => "+ paises3.getNome());
		paises4.setNome("Polonia");
		paisService.salvarPaises(paises4);
		System.out.println("Pais 4 salvo => "+ paises4.getNome());
		
		EstadosService estadoService = new EstadosService();
		EstadosDTO estados1 = new EstadosDTO();
		EstadosDTO estados2 = new EstadosDTO();
		EstadosDTO estados3 = new EstadosDTO();
		EstadosDTO estados4 = new EstadosDTO();
		
		estados1.setNome("Tocantins");
		estados1.setPaises(paises1);
		estadoService.salvar(estados1);
		System.out.println("Estado 1 salvo => "+ estados1.getNome() +"\n Pais 1 salvo => "+estados1.getPaises().getNome());
		estados2.setNome("Acre");
		estados2.setPaises(paises2);
		estadoService.salvar(estados2);
		System.out.println("Estado 2 salvo => "+ estados2.getNome() +"\n Pais 2 salvo => "+estados2.getPaises().getNome());
		estados3.setNome("Parana");
		estados3.setPaises(paises3);
		estadoService.salvar(estados3);
		System.out.println("Estado 3 salvo => "+ estados3.getNome() +"\n Pais 3 salvo => "+estados3.getPaises().getNome());
		estados4.setNome("Bahia");
		estados4.setPaises(paises4);
		estadoService.salvar(estados4);
		System.out.println("Estado 4 salvo => "+ estados4.getNome() +"\n Pais 4 salvo => "+estados4.getPaises().getNome());
		
//		System.out.println("Pais 1 buscado => "+paisService.buscar(1).getNome());
//		System.out.println("Estado 2 buscado => "+estadoService.buscar(2).getNome());

	}
}
	

