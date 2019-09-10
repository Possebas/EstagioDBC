package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.ClientePacote;
import com.br.dbccompany.trabalhofinal.Repository.ClientePacoteRepository;
import com.br.dbccompany.trabalhofinal.Service.ClientePacoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/cliente-pacote")
public class ClientePacoteController extends AbstractController<ClientePacote, ClientePacoteRepository, ClientePacoteService> {
}
