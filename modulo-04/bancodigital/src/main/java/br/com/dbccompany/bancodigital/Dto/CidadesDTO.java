package br.com.dbccompany.bancodigital.Dto;

public class CidadesDTO {

	private Integer idCidades;
	private String nome;
	private EstadosDTO estados;
	
	public Integer getIdCidades() {
		return idCidades;
	}
	public void setIdCidades(Integer idCidades) {
		this.idCidades = idCidades;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EstadosDTO getEstados() {
		return estados;
	}
	public void setEstados(EstadosDTO estados) {
		this.estados = estados;
	}

		
}
