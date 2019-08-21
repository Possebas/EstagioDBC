package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="EMAILS_SEQ", sequenceName = "EMAILS_SEQ" )
public class Emails {
	@Id
	@GeneratedValue(generator = "EMAIS_SEQ", strategy = GenerationType.SEQUENCE)
	private Integer idEmail;
	private String valor;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente")
	private Clientes cliente;
	
	
	public Integer getIdEmail() {
		return idEmail;	
	}
	public void setIdEmail(Integer idEmail) {
		this.idEmail = idEmail;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
