package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="CORRENTISTAS_SEQ", sequenceName = "CORRENTISTAS_SEQ" )
public class Correntistas {
	@Id
	@GeneratedValue (generator = "CORRENTISTAS.SEQ", strategy = GenerationType.SEQUENCE)
	private Integer IdCorrentista;
	private String razaoSocial;
	private TipoConta tipo;
	
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	public Integer getIdCorrentista() {
		return IdCorrentista;
	}
	public void setIdCorrentista(Integer idCorrentista) {
		IdCorrentista = idCorrentista;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
}	
