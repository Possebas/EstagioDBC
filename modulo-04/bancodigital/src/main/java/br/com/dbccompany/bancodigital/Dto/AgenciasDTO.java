package br.com.dbccompany.bancodigital.Dto;

public class AgenciasDTO {

	private Integer idBancos;
	private String nome;
	private Integer codigo;
	
	private BancosDTO bancos;
	
	private EnderecosDTO enderecos;
	
	private TelefonesDTO telefones;

	public Integer getIdBancos() {
		return idBancos;
	}

	public void setIdBancos(Integer idBancos) {
		this.idBancos = idBancos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public BancosDTO getBancos() {
		return bancos;
	}

	public void setBancos(BancosDTO bancos) {
		this.bancos = bancos;
	}

	public EnderecosDTO getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(EnderecosDTO enderecos) {
		this.enderecos = enderecos;
	}

	public TelefonesDTO getTelefones() {
		return telefones;
	}

	public void setTelefones(TelefonesDTO telefones) {
		this.telefones = telefones;
	}
}
