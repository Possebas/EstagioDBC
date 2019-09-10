package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Cliente;
import com.br.dbccompany.trabalhofinal.Repository.ClienteRepository;
import com.br.dbccompany.trabalhofinal.Service.ClienteService;
import com.br.dbccompany.trabalhofinal.Service.ContatoService;
import com.br.dbccompany.trabalhofinal.Service.TipoContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/cliente")
public class ClienteController extends AbstractController<Cliente, ClienteRepository, ClienteService> {

    @Autowired
    ContatoService contatoService;

    @Autowired
    TipoContatoService tipoContatoService;
}
