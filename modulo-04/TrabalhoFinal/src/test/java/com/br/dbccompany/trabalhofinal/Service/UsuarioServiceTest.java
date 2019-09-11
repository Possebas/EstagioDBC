package com.br.dbccompany.trabalhofinal.Service;


import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioServiceTest {

    // @Autowired
    // UsuarioService usuarioService;
    
    // @Test
    // public void emaiInvalid(){
    //     Usuario usuario = new Usuario();
    //     usuario.setNome("Joao");
    //     usuario.setPassword("123456");
    //     usuario.setUsername("Joao");
    //     usuario.setEmail("teste");
    //     try {
    //         usuarioService.salvar(usuario);
    //     } catch (Exception e) {
    //         Assert.assertEquals("Email inválido", e.getMessage());
    //     }
    // }

}