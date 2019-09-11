package com.br.dbccompany.trabalhofinal.Repository;

import com.br.dbccompany.trabalhofinal.Controller.UsuarioController;
import com.br.dbccompany.trabalhofinal.TrabalhoFinalApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class UsuarioIntegrationTest extends TrabalhoFinalApplicationTests {

    private MockMvc mock;

    @Autowired
    private UsuarioController controller;
    @Before
    public void setUp(){
        this.mock = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testGetApiStatusOK() throws Exception{
        this.mock.perform(MockMvcRequestBuilders.get("/usuarios/")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    /* @Test
    public void testPostApiStatusOK() throws Exception{
        this.mock.perform(MockMvcRequestBuilders.post("/api/usuarios/")).andExpect(MockMvcResultMatchers.status().isOk());
    } */

}
