package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Personagem;
import br.com.dbccompany.vemserSpring.Repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    @Transactional( rollbackFor = Exception.class )
    public Personagem salvar( Personagem personagem ) {
        return personagemRepository.save( personagem );
    }

    public List<Personagem> todosPersonagens() {
        return (List<Personagem>) personagemRepository.findAll();
    }

    public void removerById(Integer id) {
        personagemRepository.deleteById(id);
    }

    @Transactional( rollbackFor = Exception.class )
    public Personagem editar(Integer id, Personagem personagem ) {
        personagem.setId( id );
        return personagemRepository.save( personagem );
    }
    
}
