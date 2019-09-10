package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Acesso;
import com.br.dbccompany.trabalhofinal.Service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/acesso")
public class AcessoController {//extends AbstractController<Acesso, AcessoRepository, AcessoService> {

    @Autowired
    AcessoService acessoService;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Acesso> listarTodos(){
        return acessoService.listarTodos();
    }

    @GetMapping(value = "/{param}")
    @ResponseBody
    public Acesso buscar(@PathVariable String param){
        try {
            Integer id = Integer.parseInt(param);
            return acessoService.buscarPorId(id);
        } catch (NumberFormatException e){
            System.err.println("Erro!");
            System.err.println("Ao formatar o numero");
        }
        return null;
    }

    @PostMapping(value = "/adicionar")
    @ResponseBody
    public String adicionar(@RequestBody Acesso acesso) throws Exception{
        return acessoService.acessar(acesso);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Acesso editar(@PathVariable Integer id, @RequestBody Acesso entidade) throws Exception{
        return acessoService.editarPorId(id, entidade);
    }

    @DeleteMapping(value = "/deletar/{id}")
    @ResponseBody
    public void remover(@PathVariable Integer id) {
        acessoService.deletarPorId(id);
    }


}
