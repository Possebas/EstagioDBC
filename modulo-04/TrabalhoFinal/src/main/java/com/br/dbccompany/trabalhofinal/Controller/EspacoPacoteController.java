package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.EspacoPacote;
import com.br.dbccompany.trabalhofinal.Repository.EspacoPacoteRepository;
import com.br.dbccompany.trabalhofinal.Service.EspacoPacoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/espaco-pacote")
public class EspacoPacoteController extends AbstractController<EspacoPacote, EspacoPacoteRepository, EspacoPacoteService> {
    
}
