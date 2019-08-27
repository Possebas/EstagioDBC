package br.com.dbccompany.bancodigital.Dto;

public class EnderecosDTO {

	private Integer idEnderecos;
	private String logradouro;
	private String numero;
	private String complemento;	
	private BairrosDTO bairros;
	
	public Integer getIdEnderecos() {
		return idEnderecos;
	}
	public void setIdEnderecos(Integer idEnderecos) {
		this.idEnderecos = idEnderecos;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public BairrosDTO getBairros() {
		return bairros;
	}
	public void setBairros(BairrosDTO bairros) {
		this.bairros = bairros;
	}
}
