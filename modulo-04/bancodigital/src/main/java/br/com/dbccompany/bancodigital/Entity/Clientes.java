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
@SequenceGenerator( allocationSize = 1, name ="CLIENTES_SEQ", sequenceName = "CLIENTES_SEQ" )
public class Clientes {
	@Id
	@GeneratedValue(generator = "CLIENTES_SEQ", strategy = GenerationType.SEQUENCE)
	private Integer idCliente;
	private String cpf;
	private String nome;
	private String rg;
	private String dataNascimento;
	private String conjuge;
	private EstadoCivil tipo;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_endereco")
	private Enderecos endereco;

	@OneToMany( mappedBy = "cliente", cascade = CascadeType.ALL )
	private List<Emails> email = new ArrayList<>();

	public EstadoCivil getTipo() {
		return tipo;
	}

	public void setTipo(EstadoCivil tipo) {
		this.tipo = tipo;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}
	
}
