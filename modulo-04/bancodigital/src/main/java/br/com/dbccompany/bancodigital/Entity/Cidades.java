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
@SequenceGenerator( allocationSize = 1, name ="CIDADES_SEQ", sequenceName = "CIDADES_SEQ" )

public class Cidades extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( generator = "CIDADES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id;
	private String nome;
	
	@OneToMany( mappedBy = "cidade", cascade = CascadeType.ALL )
	private List<Bairros> bairro = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn( name = "fk_id_estado" )
	private Estados estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estados getEstados() {
		return estado;
	}

	public void setEstados(Estados estado) {
		this.estado = estado;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
}
