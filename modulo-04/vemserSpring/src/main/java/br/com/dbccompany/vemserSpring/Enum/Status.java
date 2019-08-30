package br.com.dbccompany.vemserSpring.Enum;

public enum Status {
    RECEM_CRIADO, SOFREU_DANO, MORTO;
}

package br.com.dbccompany.vemserSpring.Entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Personagem implements Serializable {

	@Id
	private Integer idPersonagem;