package br.com.dbccompany.bancodigital.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator( allocationSize = 1, name = "PAISES_SEQ", sequenceName = "PAISES_SEQ")
public class Paises {

	@Id
	@GeneratedValue(generator = "PAISES_SEQ", strategy = GenerationType.SEQUENCE )
	private Integer id_pais;
	private String nome;
}
