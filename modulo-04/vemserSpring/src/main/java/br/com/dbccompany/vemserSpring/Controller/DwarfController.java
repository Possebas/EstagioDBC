package br.com.dbccompany.vemserSpring.Controller;

import br.com.dbccompany.vemserSpring.Entity.Dwarf;
import br.com.dbccompany.vemserSpring.Service.DwarfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/dwarf")
public class DwarfController {

    @Autowired
    DwarfService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Dwarf> todosDwarfs(){
        return service.todosDwarfs();
    }

    @PostMapping(value = "/novo")
    @ResponseBody
    public Dwarf novoDwarf(@RequestBody Dwarf dwarf){
        return service.salvar(dwarf);
    }

    @DeleteMapping(value = "/remover/{id}")
    @ResponseBody
    public void removerElfoById(@PathVariable Integer id){
        service.removerById(id);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Dwarf editarDwarf(@PathVariable Integer id,@RequestBody Dwarf dwarf){
        return service.editar(id, dwarf);
    }
}
