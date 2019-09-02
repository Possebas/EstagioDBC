package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Dwarf;
import br.com.dbccompany.vemserSpring.Repository.DwarfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DwarfService {

    @Autowired
    private DwarfRepository dwarfRepository;

    @Transactional( rollbackFor = Exception.class )
    public Dwarf salvar( Dwarf dwarf ) {
        return dwarfRepository.save( dwarf );
    }

    public List<Dwarf> todosDwarfs() {
        return (List<Dwarf>) dwarfRepository.findAll();
    }
    
}