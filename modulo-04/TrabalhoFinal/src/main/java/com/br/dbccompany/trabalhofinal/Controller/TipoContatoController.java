package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.TipoContato;
import com.br.dbccompany.trabalhofinal.Repository.TipoContatoRepository;
import com.br.dbccompany.trabalhofinal.Service.TipoContatoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/tipo-contato")
public class TipoContatoController extends AbstractController<TipoContato, TipoContatoRepository, TipoContatoService> {
    
}
