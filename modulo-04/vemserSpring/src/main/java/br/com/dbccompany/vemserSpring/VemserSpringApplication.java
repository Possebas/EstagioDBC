package br.com.dbccompany.vemserSpring;

import br.com.dbccompany.vemserSpring.Entity.Elfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VemserSpringApplication {

	@Autowired
	ElfoService service;
	
	public static void main(String[] args) {
		SpringApplication.run(VemserSpringApplication.class, args);
	}

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            Elfo elfo = new Elfo();
            elfo.setNome("Legolas");
            service.salvar(elfo);
        };
    } 
}
