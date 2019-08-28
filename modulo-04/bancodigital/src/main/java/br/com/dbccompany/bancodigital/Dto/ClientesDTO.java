package br.com.dbccompany.bancodigital.Dto;

import br.com.dbccompany.bancodigital.Enum.EstadoCivil;

public class ClientesDTO {

    private Integer idCliente;
    private String conjuge;
    private String cpf;
    private String dataNascimento;
    private String nome;
    private EstadoCivil estadoCivil;
    private String rg;

    private EnderecosDTO enderecos;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public EnderecosDTO getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(EnderecosDTO enderecos) {
		this.enderecos = enderecos;
	}

}
