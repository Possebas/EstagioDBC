package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="BANCOS_SEQ", sequenceName = "BANCOS_SEQ" )
public class Bancos extends AbstractEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( generator = "BANCOS_SEQ", strategy = GenerationType.SEQUENCE )
	@Column(name = "ID_BANCOS")
	private Integer id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "codigo", length = 100, nullable = false)
	private Integer codigo;
	
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
	@Override
	public Integer getId() {
		return id;
	}
	

}
