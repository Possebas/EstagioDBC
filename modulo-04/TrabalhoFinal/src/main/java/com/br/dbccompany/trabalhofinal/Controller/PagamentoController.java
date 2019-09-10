package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Pagamento;
import com.br.dbccompany.trabalhofinal.Repository.PagamentoRepository;
import com.br.dbccompany.trabalhofinal.Service.PagamentoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/pagamento")
public class PagamentoController extends AbstractController<Pagamento, PagamentoRepository, PagamentoService> {
    
}
