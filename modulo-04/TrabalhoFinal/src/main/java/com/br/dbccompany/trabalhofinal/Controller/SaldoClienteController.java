package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.SaldoCliente;
import com.br.dbccompany.trabalhofinal.Service.SaldoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/saldo-cliente")
public class SaldoClienteController {

    @Autowired
    SaldoClienteService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<SaldoCliente> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping(value = "/{idCliente}-{idEspaco}")
    @ResponseBody
    public SaldoCliente buscarPorId(@PathVariable Integer idCliente, @PathVariable Integer idEspaco){
        return service.buscarPorId(idCliente, idEspaco);
    }

    @PostMapping(value = "/adicionar")
    @ResponseBody
    public SaldoCliente adicionar(@RequestBody SaldoCliente sc){
        return service.salvar(sc);
    }

    @PutMapping(value = "/editar/{idCliente}-{idEspaco}")
    @ResponseBody
    public SaldoCliente editar(@PathVariable Integer idCliente, @PathVariable Integer idEspaco, @RequestBody SaldoCliente sc){
        return service.editarPorIds(idCliente,idEspaco,sc);
    }

    @DeleteMapping(value = "/deletar/{idCliente}-{idEspaco}")
    @ResponseBody
    public void deletar(@PathVariable Integer idCliente, @PathVariable Integer idEspaco){
        service.removerPorId(idCliente, idEspaco);
    }

}
