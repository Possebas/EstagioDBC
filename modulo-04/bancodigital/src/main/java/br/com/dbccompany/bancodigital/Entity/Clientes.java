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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import br.com.dbccompany.bancodigital.Enum.EstadoCivil;

@Entity
@SequenceGenerator( allocationSize = 1, name = "CLIENTES_SEQ", sequenceName = "CLIENTES_SEQ" )
public class Clientes extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_cliente" )	
	@GeneratedValue( generator = "CLIENTES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "cpf", length = 11, nullable = false )		
	private String cpf;
	
	@Column( name = "nome", length = 100, nullable = false )		
	private String nome;
	
	@Column( name = "rg", length = 100, nullable = false )		
	private String rg;
	
	@Column( name = "conjuge", length = 100, nullable = true )			
	private String conjuge;
	
	@Column( name = "data_nascimento", length = 10, nullable = false )			
	private String dataNascimento;
	
	@Enumerated( EnumType.STRING )
	private EstadoCivil estadoCivil;
	
	@ManyToMany( mappedBy = "correntistas_clientes" )
	private List<Correntistas> correntistas = new ArrayList<>();
	
	@ManyToMany( mappedBy = "telefones_clientes" )
	private List<Telefones> telefones = new ArrayList<>();
		
	@ManyToOne
	@JoinColumn( name = "fk_id_endereco" )
	private Enderecos endereco;

	@OneToMany( mappedBy = "cliente", cascade = CascadeType.ALL )
	private List<Emails> email = new ArrayList<>();	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}

	public List<Emails> getEmail() {
		return email;
	}

	public void setEmail(List<Emails> email) {
		this.email = email;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
