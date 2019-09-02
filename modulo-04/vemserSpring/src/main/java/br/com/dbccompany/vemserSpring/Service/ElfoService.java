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
        return (List<Elfo>) elfoRepository.findAll();
    }
}
