package br.com.dbccompany.bancodigital.Dto;

public class EstadosDTO {
	
	private Integer idEstados;
	private String nome;
	
	private PaisesDTO paises;

	public Integer getIdEstados() {
		return idEstados;
	}

	public void setIdEstados(Integer idEstados) {
		this.idEstados = idEstados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PaisesDTO getPaises() {
		return paises;
	}

	public void setPaises(PaisesDTO paises) {
		this.paises = paises;
	}
	
	
}
