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

import br.com.dbccompany.bancodigital.Enum.TiposCorrentistas;

@Entity
@SequenceGenerator( allocationSize = 1, name = "CORRENTISTAS_SEQ", sequenceName = "CORRENTISTAS_SEQ" )
public class Correntistas extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_correntista" )		
	@GeneratedValue( generator = "CORRENTISTAS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "razaoSocial", length = 100, nullable = true )		
	private String razaoSocial;
	
	@Column( name = "cnpj", length = 100, nullable = true )	
	private String cnpj;
	
	@Enumerated( EnumType.STRING )
	private TiposCorrentistas tipo;
	
	@ManyToMany( cascade = CascadeType.ALL )
	@JoinTable( name = "correntistas_x_clientes", 
					joinColumns = { @JoinColumn( name = "id_correntista" ) },
					inverseJoinColumns = { @JoinColumn( name = "id_cliente" ) } )
	private List<Clientes> correntistas_clientes = new ArrayList<>();	
	
	@ManyToMany( mappedBy = "correntistas" )
	private List<Agencias> agencias = new ArrayList<>();
	
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

	@Override
	public Integer getId() {
		return id;
	}
}
