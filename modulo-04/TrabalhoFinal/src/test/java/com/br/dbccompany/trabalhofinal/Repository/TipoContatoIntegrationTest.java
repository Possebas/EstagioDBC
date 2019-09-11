package com.br.dbccompany.trabalhofinal.Repository;

import com.br.dbccompany.trabalhofinal.Controller.TipoContatoController;
import com.br.dbccompany.trabalhofinal.TrabalhoFinalApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class TipoContatoIntegrationTest extends TrabalhoFinalApplicationTests {

    private MockMvc mock;

    @Autowired
    private TipoContatoController controller;
    @Before
    public void setUp(){
        this.mock = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testGetApiStatusOK() throws Exception{
        this.mock.perform(MockMvcRequestBuilders.get("/api/tipocontato/")).andExpect(MockMvcResultMatchers.status().isOk());
    }
    
}