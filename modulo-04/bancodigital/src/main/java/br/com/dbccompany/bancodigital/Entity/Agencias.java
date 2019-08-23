package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "AGENCIAS_SEQ", sequenceName = "AGENCIAS_SEQ" )
public class Agencias extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_agencia" )	
	@GeneratedValue( generator = "AGENCIAS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "codigo", nullable = false )		
	private Integer codigo;
	
	@Column( name = "nome", length = 100, nullable = false )		
	private String nome;
	
	@ManyToOne
	@JoinColumn( name = "fk_id_banco" )
	private Bancos banco;
	
	@ManyToOne
	@JoinColumn( name = "fk_id_endereco" )
	private Enderecos endereco;

	@ManyToMany( cascade = CascadeType.ALL )
	@JoinTable( name = "agencias_x_correntistas", 
					joinColumns = { @JoinColumn( name = "id_agencia" ) },
					inverseJoinColumns = { @JoinColumn( name = "id_correntista" ) } )
	private List<Correntistas> correntistas = new ArrayList<>();	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bancos getBanco() {
		return banco;
	}

	public void setBanco(Bancos banco) {
		this.banco = banco;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
