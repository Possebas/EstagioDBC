package br.com.dbccompany.bancodigital.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "BANCOS_SEQ", sequenceName = "BANCOS_SEQ" )
public class Bancos extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column( name = "id_banco" )		
	@GeneratedValue( generator = "BANCOS_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	
	@Column( name = "codigo", length = 20, nullable = false )		
	private Integer codigo;
	
	@Column( name = "nome", length = 100, nullable = false )		
	private String nome;

	@OneToMany( mappedBy = "banco", cascade = CascadeType.ALL )
	private List<Agencias> agencias = new ArrayList<>();

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

	public List<Agencias> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencias> agencias) {
		this.agencias = agencias;
	}

	@Override
	public Integer getId() {
		return id;
	}
}
