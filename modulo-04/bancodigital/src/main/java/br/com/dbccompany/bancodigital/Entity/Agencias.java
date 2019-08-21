package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name ="AGENCIAS_SEQ", sequenceName = "AGENCIAS_SEQ" )
public class Agencias {
	@Id
	@GeneratedValue( generator = "AGENCIAS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer idAgencia;
	private Integer codigo;
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "fk_id_banco")
	private Bancos banco;
	
	@OneToOne
	@JoinColumn(name = "fk_id_endereco")
	private Enderecos endereco;
	
	@OneToOne
	@JoinColumn(name = "fk_id_telefone")
	private Telefones telefone;

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}

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

	public Telefones getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefones telefone) {
		this.telefone = telefone;
	}
}
