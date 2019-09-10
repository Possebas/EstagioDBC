package com.br.dbccompany.trabalhofinal.Service;

import org.springframework.stereotype.Service;

import com.br.dbccompany.trabalhofinal.Entity.Usuario;
import com.br.dbccompany.trabalhofinal.Repository.UsuarioRepository;

@Service("detailsUserService")
public class UsuarioService extends AbstractService<UsuarioRepository, Usuario> {

    public Usuario buscarPorUsername(String username){
        return repository.findByUsername(username);
    }
}
