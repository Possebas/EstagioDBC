package br.com.dbccompany.vemserSpring.Controller;

import br.com.dbccompany.vemserSpring.Entity.Elfo;
import br.com.dbccompany.vemserSpring.Service.ElfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/elfo")
public class ElfoController {

    @Autowired
    ElfoService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Elfo> todosElfos(){
        return service.todosElfos();
    }

    @PostMapping(value = "/novo")
    @ResponseBody
    public Elfo novoElfo(@RequestBody Elfo elfo){
        return service.salvar(elfo);
    }

    @DeleteMapping(value = "/remover/")
    @ResponseBody
    public void removerElfo(@RequestBody Elfo elfo){
        service.removerElfo(elfo);
    }

    @DeleteMapping(value = "/remover/{id}")
    @ResponseBody
    public void removerElfoById(@PathVariable Integer id){
        service.removerById(id);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Elfo editarElfo(@PathVariable Integer id,@RequestBody Elfo elfo){
        return service.editar(id, elfo);
    }


}
