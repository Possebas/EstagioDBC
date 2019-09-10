package com.br.dbccompany.trabalhofinal.Controller;

import com.br.dbccompany.trabalhofinal.Entity.Usuario;
import com.br.dbccompany.trabalhofinal.Repository.UsuarioRepository;
import com.br.dbccompany.trabalhofinal.Service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController extends AbstractController<Usuario, UsuarioRepository, UsuarioService>{
    
}
