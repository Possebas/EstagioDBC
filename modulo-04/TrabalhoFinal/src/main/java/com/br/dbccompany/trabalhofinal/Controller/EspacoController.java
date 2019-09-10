package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Espaco;
import com.br.dbccompany.trabalhofinal.Repository.EspacoRepository;
import com.br.dbccompany.trabalhofinal.Service.EspacoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/espaco")
public class EspacoController extends AbstractController<Espaco, EspacoRepository, EspacoService> {

    @Override
    @GetMapping(value = "/{param}")
    public Espaco buscar(@PathVariable String param) {
        try{
            Integer id = Integer.parseInt(param);
            return entidadeService.buscarPorId(id);
        } catch (NumberFormatException erro){
            return entidadeService.buscarPorNome(param);
        }
    }
}
