package br.com.dbccompany.vemserSpring;

import br.com.dbccompany.vemserSpring.Entity.Elfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VemserSpringApplication {

	public static void main(String[] args) {
		Elfo elfo = new Elfo();
		SpringApplication.run(VemserSpringApplication.class, args);
	}

}
