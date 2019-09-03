package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Elfo;
import br.com.dbccompany.vemserSpring.Repository.ElfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ElfoService {

    @Autowired
    private ElfoRepository elfoRepository;

    @Transactional( rollbackFor = Exception.class )
    public Elfo salvar( Elfo elfo ) {
        return elfoRepository.save( elfo );
    }

    public List<Elfo> todosElfos() {
        return elfoRepository.findAll();
    }

    public void removerById(Integer id) {
        elfoRepository.deleteById(id);
    }

    public void removerElfo(Elfo elfo) {
        elfoRepository.delete(elfo);
    }

    @Transactional( rollbackFor = Exception.class )
    public Elfo editar( Integer id, Elfo elfo ) {
        elfo.setId( id );
        return elfoRepository.save( elfo );
    }
}
