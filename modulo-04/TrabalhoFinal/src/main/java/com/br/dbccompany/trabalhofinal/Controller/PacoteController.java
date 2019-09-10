package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Pacote;
import com.br.dbccompany.trabalhofinal.Repository.PacoteRepository;
import com.br.dbccompany.trabalhofinal.Service.PacoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/pacote")
public class PacoteController extends AbstractController<Pacote, PacoteRepository, PacoteService> {
}
