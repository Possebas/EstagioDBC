package com.br.dbccompany.trabalhofinal.Service;

import org.springframework.stereotype.Service;

import com.br.dbccompany.trabalhofinal.Utils;
import com.br.dbccompany.trabalhofinal.Entity.Usuario;
import com.br.dbccompany.trabalhofinal.Repository.UsuarioRepository;

@Service("detailsUserService")
public class UsuarioService extends AbstractService<UsuarioRepository, Usuario> {

    public Usuario buscarPorNome(String username){
        return repository.findByUsername(username);
    }

    @Override
    public Usuario salvar(Usuario user) throws Exception {

        if(!Utils.emailValid(user.getEmail())){
            throw new Exception("Email inválido");
        }

        String senha = user.getPassword();

        if(senha.length() < 6){
            throw new Exception("Senha com menos de 6 caracteres");
        }

        user.setPassword(Utils.md5(user.getPassword()));
        return repository.save(user);
    }

}
