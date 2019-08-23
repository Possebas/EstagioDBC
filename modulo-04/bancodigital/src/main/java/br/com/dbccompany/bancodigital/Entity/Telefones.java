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

import br.com.dbccompany.bancodigital.Enum.TiposTelefones;

@Entity
@SequenceGenerator( allocationSize = 1, name = "TELEFONES_SEQ", sequenceName = "TELEFONES_SEQ" )
public class Telefones extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "id_telefone" )
	@GeneratedValue( generator = "TELEFONES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;

	@Column( name = "numero", length = 10, nullable = false )
	private String numero;
	
	@Enumerated( EnumType.STRING )
	private TiposTelefones tipo;
	
	@ManyToMany( cascade = CascadeType.ALL )
	@JoinTable( name = "telefones_x_clientes", 
					joinColumns = { @JoinColumn( name = "id_telefone" ) },
					inverseJoinColumns = { @JoinColumn( name = "id_cliente" ) } )
	private List<Clientes> telefones_clientes = new ArrayList<>();
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public TiposTelefones getTipo() {
		return tipo;
	}
	
	public void setTipo(TiposTelefones tipo) {
		this.tipo = tipo;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
