package br.com.dbccompany.bancodigital.Dto;

import br.com.dbccompany.bancodigital.Enum.TiposCorrentistas;

public class CorrentistasDTO {
    
	private Integer id;
	private String razaoSocial;
	private String cnpj;
	private Double saldo = 0.0;
	private TiposCorrentistas tipo;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public TiposCorrentistas getTipo() {
		return tipo;
	}
	
	public void setTipo(TiposCorrentistas tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public boolean sacar( Double valor ) {
		if( valor <= this.saldo ) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar( Double valor ) {
		if ( valor > 0 ) {
			this.saldo += valor;			
			return true;
		}
		return false;
	}
	
	public boolean transferir( Double valor, CorrentistasDTO contaGanhar ) {
		if( valor > 0 && contaGanhar != null ) {
			boolean possivelSacar = this.sacar(valor);
			if( possivelSacar ) {
				contaGanhar.depositar(valor);
			}
			return true;
		}
		return false;
    }
}
