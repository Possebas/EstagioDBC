package br.com.dbccompany.vemserSpring.Entity;

import br.com.dbccompany.vemserSpring.Enum.RacaType;

import javax.persistence.Entity;

@Entity
public class Dwarf extends Personagem {

	public Dwarf(String nome) {
		super(nome);
		super.setTipoPersonagem(RacaType.DWARF);
	}
}
