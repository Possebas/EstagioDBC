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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "BAIRROS_SEQ", sequenceName = "BAIRROS_SEQ" )
public class Bairros extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_bairro" )		
	@GeneratedValue( generator = "BAIRROS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "nome", length = 100, nullable = false )	
	private String nome;
	
	@ManyToOne
	@JoinColumn( name = "fk_id_cidade" )
	private Cidades cidade;

	@OneToMany( mappedBy = "bairro", cascade = CascadeType.ALL )
	private List<Enderecos> endereco = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidades getCidade() {
		return cidade;
	}

	public void setCidade(Cidades cidade) {
		this.cidade = cidade;
	}

	public List<Enderecos> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Enderecos> endereco) {
		this.endereco = endereco;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
