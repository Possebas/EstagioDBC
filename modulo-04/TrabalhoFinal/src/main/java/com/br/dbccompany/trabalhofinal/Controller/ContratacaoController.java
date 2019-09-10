package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Contratacao;
import com.br.dbccompany.trabalhofinal.Service.ContratacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/contratacao")
public class ContratacaoController {

    @Autowired
    ContratacaoService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Contratacao> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping(value = "/{param}")
    @ResponseBody
    public Contratacao buscar(@PathVariable String param) {
        try {
            Integer id = Integer.parseInt(param);
            return service.buscarPorId(id);
        } catch (NumberFormatException e) {
            System.err.println("Erro formatando o numero");
        }
        return null;
    }

    @PostMapping(value = "/adicionar")
    @ResponseBody
    public String adicionar(@RequestBody Contratacao contratacao) {
        return service.salvarRetornarValor(contratacao);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Contratacao editar(@PathVariable Integer id, @RequestBody Contratacao entidade) throws Exception {
        return service.editarPorId(id, entidade);
    }

    @DeleteMapping(value = "/deletar/{id}")
    @ResponseBody
    public void remover(@PathVariable Integer id) {
        service.deletarPorId(id);
    }

}
