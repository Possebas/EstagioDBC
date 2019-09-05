package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Dwarf;
import br.com.dbccompany.vemserSpring.Entity.Inventario;
import br.com.dbccompany.vemserSpring.Entity.Personagem;
import br.com.dbccompany.vemserSpring.Repository.InventarioRepository;
import br.com.dbccompany.vemserSpring.Repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Autowired
    private PersonagemRepository personagemRepository;

    @Transactional( rollbackFor = Exception.class )
    public Inventario salvar( Inventario inventario ) {
        Personagem personagem = inventario.getIdPersonagem();
        if ( personagem.getId() == null ) {
            personagem = personagemRepository.save( personagem );
        }
        inventario.setPersonagem(personagem);
        return inventarioRepository.save( inventario );
    }

    public List<Inventario> todosInventarios() {
        return (List<Inventario>) inventarioRepository.findAll();
    }

    public void removerById(Integer id) {
        inventarioRepository.deleteById(id);
    }
    @Transactional( rollbackFor = Exception.class )
    public Inventario editar(Integer id, Inventario inventario ) {
        inventario.setId( id );
        return inventarioRepository.save( inventario );
    }
}
