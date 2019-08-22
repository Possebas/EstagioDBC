package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table ( name = "TELEFONES_BANCO")
public class Telefones {
	
	@Id
	@Column( name = "ID_TELEFONE" )
	@GeneratedValue( generator = "TELEFONES_SEQ", strategy = GenerationType.SEQUENCE )
	@SequenceGenerator( allocationSize = 1, name ="TELEFONES_SEQ", sequenceName = "TELEFONES_SEQ" )
	private Integer idTelefone;
	
	@Column( name = "numero", length = 100, nullable = false)
	private String numero;
	
	@Enumerated (EnumType.STRING)
	private TipoTelefone tipo;
	
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable( name = "telefones_x_clientes",
					joinColumns = { @JoinColumn( name = "id_telefones" ) },
					inverseJoinColumns = { @JoinColumn( name = "id_clientes" ) })
	private List<Clientes> clientes = new ArrayList<>();
	
	
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
