package br.com.dbccompany.vemserSpring.Controller;


import br.com.dbccompany.vemserSpring.Entity.Inventario;
import br.com.dbccompany.vemserSpring.Service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    InventarioService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Inventario> todosInventarios(){
        return service.todosInventarios();
    }

    @PostMapping(value = "/novo")
    @ResponseBody
    public Inventario novoInventario(@RequestBody Inventario inventario){
        return service.salvar(inventario);
    }

    @DeleteMapping(value = "/remover/{id}")
    @ResponseBody
    public void removerInventarioById(@PathVariable Integer id){
        service.removerById(id);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Inventario editarInventario(@PathVariable Integer id,@RequestBody Inventario inventario){
        return service.editar(id, inventario);
    }
}
