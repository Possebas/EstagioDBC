package br.com.dbccompany.vemserSpring.Entity;

import br.com.dbccompany.vemserSpring.Enum.RacaType;

import javax.persistence.Entity;

@Entity
public class Elfo extends Personagem {

	public Elfo(){
		super.setTipoPersonagem(RacaType.ELFO);
	}
}
