package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="BANCOS_SEQ", sequenceName = "BANCOS_SEQ" )
public class Bancos {
	@Id
	@GeneratedValue( generator = "BANCOS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer idBanco;
	private String nome;
	private Integer codigo;
	
	public Integer getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
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
	

}
