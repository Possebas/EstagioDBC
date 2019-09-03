package br.com.dbccompany.vemserSpring.Controller;

import br.com.dbccompany.vemserSpring.Entity.Item;
import br.com.dbccompany.vemserSpring.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping(value = "/")
    @ResponseBody
    public List<Item> todosItens(){
        return service.todosItens();
    }

    @PostMapping(value = "/novo")
    @ResponseBody
    public Item novoItem(@RequestBody Item item){
        return service.salvar(item);
    }

    @DeleteMapping(value = "/remover/{id}")
    @ResponseBody
    public void removerItemById(@PathVariable Integer id){
        service.removerById(id);
    }

    @PutMapping(value = "/editar/{id}")
    @ResponseBody
    public Item editarItem(@PathVariable Integer id,@RequestBody Item item){
        return service.editar(id, item);
    }
}
