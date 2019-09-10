package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Contato;
import com.br.dbccompany.trabalhofinal.Repository.ContatoRepository;
import com.br.dbccompany.trabalhofinal.Service.ContatoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/contato")
public class ContatoController extends AbstractController<Contato, ContatoRepository, ContatoService> {
}
