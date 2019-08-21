package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="TELEFONES_SEQ", sequenceName = "TELEFONES_SEQ" )
public class Telefones {
	@Id
	@GeneratedValue( generator = "TELEFONES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer IdTelefone;
	private String numero;
	private TipoTelefone tipo;
	
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	public Integer getIdTelefone() {
		return IdTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		IdTelefone = idTelefone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
