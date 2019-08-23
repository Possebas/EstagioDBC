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
  //@Table(name = "TELEFONES_BANCO") EXEMPLO PARA RENOMEAR A TABELA
@SequenceGenerator( allocationSize = 1, name ="TELEFONES_SEQ", sequenceName = "TELEFONES_SEQ" )
public class Telefones extends AbstractEntity{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( generator = "TELEFONES_SEQ", strategy = GenerationType.SEQUENCE )
	@Column( name = "ID_TELEFONE" )
	private Integer id;
	
	@Column(name = "numero", length = 100, nullable = false)
	private String numero;
	
	@Enumerated(EnumType.STRING)
	private TipoTelefone tiposTelefone;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name = "telefones_x_clientes",
					joinColumns = { @JoinColumn( name = "id_telefones")},
					inverseJoinColumns = { @JoinColumn( name = "id_clientes" ) })
	
	private List<Clientes> clientes = new ArrayList<>();
	
	
	public TipoTelefone getTiposTelefone() {
		return tiposTelefone;
	}
	public void setTiposTelefone(TipoTelefone tiposTelefone) {
		this.tiposTelefone = tiposTelefone;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public Integer getId() {
		return id;
	}
	
}
