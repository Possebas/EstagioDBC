package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "EMAILS_SEQ", sequenceName = "EMAILS_SEQ" )
public class Emails extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_email" )		
	@GeneratedValue( generator = "EMAILS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "valor", length = 100, nullable = false )		
	private String valor;
	
	@ManyToOne
	@JoinColumn( name = "fk_id_cliente" )
	private Clientes cliente;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
