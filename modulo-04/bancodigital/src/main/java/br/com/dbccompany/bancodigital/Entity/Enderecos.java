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
@SequenceGenerator( allocationSize = 1, name ="ENDERECOS_SEQ", sequenceName = "ENDERECOS_SEQ" )
public class Enderecos extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "ENDERECOS_SEQ", strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String logradouro;
	private Integer numero;
	private String complemento;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_bairro")
	private Bairros bairro;

	@OneToMany( mappedBy = "endereco", cascade = CascadeType.ALL )
	private List<Clientes> cliente = new ArrayList<>();

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Bairros getBairro() {
		return bairro;
	}

	public void setBairro(Bairros bairro) {
		this.bairro = bairro;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
