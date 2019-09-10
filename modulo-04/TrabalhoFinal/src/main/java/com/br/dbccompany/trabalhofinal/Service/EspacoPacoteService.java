package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.EspacoPacote;
import com.br.dbccompany.trabalhofinal.Entity.Pacote;
import com.br.dbccompany.trabalhofinal.Repository.EspacoPacoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacoPacoteService extends AbstractService<EspacoPacoteRepository, EspacoPacote> {

    public List<EspacoPacote> buscarTodosPorPacote(Pacote pacote){
        return (List<EspacoPacote>) repository.findAllByPacote(pacote);
    }
}
