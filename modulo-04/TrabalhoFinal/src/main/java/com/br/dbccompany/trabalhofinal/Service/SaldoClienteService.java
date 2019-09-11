package com.br.dbccompany.trabalhofinal.Service;

import com.br.dbccompany.trabalhofinal.Entity.SaldoCliente;
import com.br.dbccompany.trabalhofinal.Entity.SaldoClienteID;
import com.br.dbccompany.trabalhofinal.Repository.ClienteRepository;
import com.br.dbccompany.trabalhofinal.Repository.EspacoRepository;
import com.br.dbccompany.trabalhofinal.Repository.SaldoClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaldoClienteService {

    @Autowired
    SaldoClienteRepository selfRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    EspacoRepository espacoRepository;

    @Transactional(rollbackFor = Exception.class)
    public SaldoCliente salvar(SaldoCliente saldoCliente){
        return selfRepository.save(saldoCliente);
    }

    @Transactional(rollbackFor = Exception.class)
    public void removerPorId(Integer idCliente, Integer idEspaco){
        SaldoClienteID id = new SaldoClienteID();
        id.setCliente(clienteRepository.findById(idCliente).get());
        id.setEspaco(espacoRepository.findById(idEspaco).get());
        selfRepository.deleteById(id);
    }

    public SaldoCliente buscarPorId(Integer idCliente, Integer idEspaco){
        SaldoClienteID id = new SaldoClienteID();
        id.setCliente(clienteRepository.findById(idCliente).get());
        id.setEspaco(espacoRepository.findById(idEspaco).get());
        return selfRepository.findById(id).get();
    }

    public List<SaldoCliente> listarTodos(){
        return (List<SaldoCliente>) selfRepository.findAll();
    }

    public List<SaldoCliente> listarTodosDoEspaco(Integer idEspaco){
        return selfRepository.findAllById_Espaco(idEspaco);
    }

    public List<SaldoCliente> listarTodosDoCliente(Integer idCliente){
        return selfRepository.findAllById_Cliente(idCliente);
    }

    @Transactional(rollbackFor = Exception.class)
    public SaldoCliente editarPorIds(Integer idCliente, Integer idEspaco, SaldoCliente saldoCliente){
        SaldoClienteID saldoID = new SaldoClienteID();
        saldoID.setCliente(clienteRepository.findById(idCliente).get());
        saldoID.setEspaco(espacoRepository.findById(idEspaco).get());
        saldoCliente.setId(saldoID);
        return selfRepository.save(saldoCliente);
    }
}
