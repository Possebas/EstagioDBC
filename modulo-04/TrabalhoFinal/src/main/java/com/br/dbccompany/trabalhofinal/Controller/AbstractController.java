package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.AbstractEntity;
import com.br.dbccompany.trabalhofinal.Service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController
        <
                Entidade extends AbstractEntity,
                EntidadeRepository extends CrudRepository<Entidade, Integer>,
                EntidadeService extends AbstractService<EntidadeRepository, Entidade>
                > {

    @Autowired
    EntidadeService entidadeService;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Entidade> listarTodos(){
        return entidadeService.listarTodos();
    }

    @GetMapping(value = "/{param}")
    @ResponseBody
    public Entidade buscar(@PathVariable String param){
        try {
            Integer id = Integer.parseInt(param);
            return entidadeService.buscarPorId(id);
        } catch (NumberFormatException e){
            System.err.println("Impossivel formatar o numero na requisicao");
        }
        return null;
    }

    @PostMapping(value = "/adicionar")
    @ResponseBody
    public Entidade adicionar(@RequestBody Entidade entidade) throws Exception{
        return entidadeService.salvar(entidade);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Entidade editar(@PathVariable Integer id, @RequestBody Entidade entidade) throws Exception{
        return entidadeService.editarPorId(id, entidade);
    }

    @DeleteMapping(value = "/deletar/{id}")
    @ResponseBody
    public void remover(@PathVariable Integer id) throws Exception{
        entidadeService.deletarPorId(id);
    }

}
