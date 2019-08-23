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

@Entity
@SequenceGenerator( allocationSize = 1, name ="CORRENTISTAS_SEQ", sequenceName = "CORRENTISTAS_SEQ" )
public class Correntistas extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (generator = "CORRENTISTAS.SEQ", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_CORRENTISTAS")
	private Integer id;
	
	@Column(name = "razao_social", length = 100, nullable = false)
	private String razaoSocial;
	
	@Enumerated(EnumType.STRING)
	private TipoConta tipo;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "correntistas_x_clientes",
					joinColumns = { @JoinColumn( name = "id_correntistas")},
					inverseJoinColumns = { @JoinColumn( name = "id_clientes" ) })
	private List<Clientes> clientes = new ArrayList<>();
	
	
	@ManyToMany (mappedBy = "correntistas")
	private List<Agencias> agencias = new ArrayList<>();
	
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	@Override
	public Integer getId() {
		return id;
	}
	
}	
