package br.com.dbccompany.bancodigital.Dto;

public class CorrentistasDTO {

	private Integer idCorrentista;
	private String razaoSocial;
	private String tipo;
	private String cnpj;
	
	public Integer getIdCorrentista() {
		return idCorrentista;
	}
	public void setIdCorrentista(Integer idCorrentista) {
		this.idCorrentista = idCorrentista;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
