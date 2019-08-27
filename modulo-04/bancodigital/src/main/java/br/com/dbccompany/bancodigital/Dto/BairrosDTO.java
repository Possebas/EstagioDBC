package br.com.dbccompany.bancodigital.Dto;

public class BairrosDTO {

	private Integer idBairros;
	private String nome;
	private CidadesDTO cidades;
	
	public Integer getIdBairros() {
		return idBairros;
	}
	public void setIdBairros(Integer idBairros) {
		this.idBairros = idBairros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CidadesDTO getCidades() {
		return cidades;
	}
	public void setCidades(CidadesDTO cidades) {
		this.cidades = cidades;
	}
}