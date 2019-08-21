package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="BAIRROS_SEQ", sequenceName = "BAIRROS_SEQ" )

public class Bairros {
	@Id
	@GeneratedValue( generator = "BAIRROS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer idBairro;
	private String nome;
	
	@OneToMany( mappedBy = "bairro", cascade = CascadeType.ALL )
	private List<Enderecos> endereco = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cidade")
	private Cidades cidade;


	public Integer getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(Integer idBairro) {
		this.idBairro = idBairro;
	}

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
	
}
