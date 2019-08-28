package br.com.dbccompany.bancodigital;

import br.com.dbccompany.bancodigital.Dto.BairrosDTO;
import br.com.dbccompany.bancodigital.Dto.CidadesDTO;
import br.com.dbccompany.bancodigital.Dto.EstadosDTO;
import br.com.dbccompany.bancodigital.Dto.PaisesDTO;
import br.com.dbccompany.bancodigital.Service.BairrosService;
import br.com.dbccompany.bancodigital.Service.CidadesService;
import br.com.dbccompany.bancodigital.Service.EstadosService;
import br.com.dbccompany.bancodigital.Service.PaisesService;

public class Main {
	
	public static void main(String[] args) {

		PaisesService paisesService = new PaisesService();
		PaisesDTO paises1 = new PaisesDTO();
		paises1.setNome("Brasil");
		paisesService.salvarPaises(paises1);
	
		EstadosService estadosService = new EstadosService();
		EstadosDTO toca = new EstadosDTO();
		toca.setNome("Tocantins");
		toca.setPaises(paises1);
		estadosService.salvar(toca);
		
		CidadesService cidadesService = new CidadesService();
		CidadesDTO gurupi = new CidadesDTO();
		gurupi.setNome("Gurupi");
		gurupi.setEstados(toca);
		cidadesService.salvar(gurupi);
		
		 BairrosService bairrosService = new BairrosService();
		 BairrosDTO centro = new BairrosDTO(); 
		 centro.setNome("Centro"); 
		 centro.setCidades(gurupi); 
		 BairrosDTO saoJose = new BairrosDTO(); 
		 saoJose.setNome("Sao Jose");
		 saoJose.setCidades(gurupi); 
		 bairrosService.salvar(centro);
		 bairrosService.salvar(saoJose);
		 
		 /* EnderecosService enderecosService = new EnderecosService(); EnderecosDTO
		 * endereco1 = new EnderecosDTO(); EnderecosDTO endereco2 = new EnderecosDTO();
		 * EnderecosDTO endereco3 = new EnderecosDTO(); EnderecosDTO endereco4 = new
		 * EnderecosDTO(); endereco1.setLogradouro("Avenida Maranhao");
		 * endereco1.setNumero("88"); endereco1.setBairros(saoJose);
		 * endereco2.setLogradouro("Rua Albion"); endereco2.setNumero("198");
		 * endereco2.setBairros(centro); endereco3.setLogradouro("Rua 30");
		 * endereco3.setNumero("31"); endereco3.setBairros(centro);
		 * endereco4.setLogradouro("Avenida hogwarts"); endereco4.setNumero("10");
		 * endereco4.setBairros(saoJose); enderecosService.salvar(endereco1);
		 * enderecosService.salvar(endereco2); enderecosService.salvar(endereco3);
		 * enderecosService.salvar(endereco4);
		 * 
		 * BancosService bancosService = new BancosService(); BancosDTO banco1 = new
		 * BancosDTO(); BancosDTO banco2 = new BancosDTO();
		 * banco1.setNome("Banco 1 - Hogwarts"); banco2.setNome("Banco 2 - Pokstista");
		 * bancosService.salvar(banco1); bancosService.salvar(banco2);
		 * 
		 * AgenciasService agenciasService = new AgenciasService(); AgenciasDTO agencia1
		 * = new AgenciasDTO(); AgenciasDTO agencia2 = new AgenciasDTO();
		 * agencia1.setNome("Agencia JK"); agencia1.setBancos(banco1);
		 * agencia1.setCodigo(159); agencia1.setEnderecos(endereco1);
		 * agencia2.setNome("Agencia Belem"); agencia2.setBancos(banco2);
		 * agencia2.setCodigo(001); agencia2.setEnderecos(endereco2);
		 * agenciasService.salvar(agencia1); agenciasService.salvar(agencia2);
		 */
		
		/*
		 * ClientesService clienteService = new ClientesService(); ClientesDTO cliente1
		 * = new ClientesDTO(); ClientesDTO cliente2 = new ClientesDTO();
		 * cliente1.setNome("Jerardy Barros"); cliente1.setCpf("15842144578");
		 * cliente1.setRg("132121"); cliente1.setDataNascimento("01/01/1885");
		 * cliente1.setEstadoCivil(EstadoCivil.DIVORCIADO);
		 * cliente1.setEnderecos(endereco1); cliente2.setNome("Valdiscleia Nunes");
		 * cliente2.setCpf("56487494972"); cliente2.setRg("789456345");
		 * cliente2.setDataNascimento("15/12/2000");
		 * cliente2.setEstadoCivil(EstadoCivil.SOLTEIRO);
		 * cliente2.setEnderecos(endereco2); clienteService.salvar(cliente1);
		 * clienteService.salvar(cliente2);
		 */
		
		/*
		 * CorrentistasService correntistasService = new CorrentistasService();
		 * CorrentistasDTO conta1 = new CorrentistasDTO(); CorrentistasDTO conta2 = new
		 * CorrentistasDTO(); conta1.setTipo(TiposCorrentistas.PF);
		 * conta1.depositar(100.0); conta2.setTipo(TiposCorrentistas.PF);
		 * conta2.depositar(100.0); correntistasService.salvar(conta1);
		 * correntistasService.salvar(conta2);
		 */
		
		/*
		 * System.out.println("Conta 01 => " + conta1.getSaldo());
		 * System.out.println("Conta 02 => " + conta2.getSaldo());
		 * System.out.println("Realizando transferencia !!"); conta1.transferir(100.0,
		 * conta2); correntistasService.salvar(conta1);
		 * correntistasService.salvar(conta2);
		 * System.out.println("Transferencia realizada !!");
		 * System.out.println("Conta 01 => " + conta1.getSaldo());
		 * System.out.println("Conta 02 => " + conta2.getSaldo());
		 */
		
		System.exit(0);
	}
}
