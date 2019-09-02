package br.com.dbccompany.vemserSpring.Service;

import br.com.dbccompany.vemserSpring.Entity.Inventario;
import br.com.dbccompany.vemserSpring.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ElfoService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Transactional( rollbackFor = Exception.class )
    public Inventario salvar( Inventario inventario ) {
        return inventarioRepository.save( inventario );
    }

    public List<Inventario> todosInventarios() {
        return (List<Inventario>) inventarioRepository.findAll();
    }
    
}
