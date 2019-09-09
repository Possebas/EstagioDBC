package com.br.dbccompany.trabalhofinal.Entity;

import javax.persistence.*;

import com.br.dbccompany.trabalhofinal.Entity.Contato;

import java.util.*;

@Entity
public class TipoContato extends AbstractEntity{

    @Id
    @SequenceGenerator(allocationSize = 1, name = "TIPO_CONTATO_SEQ", sequenceName = "TIPO_CONTATO_SEQ")
    @GeneratedValue(generator = "TIPO_CONTATO_SEQ", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @OneToMany(mappedBy = "tipoContato")
    private List<Contato> contatos = new ArrayList<>();
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void pushContatos(Contato... contatos) {
        this.contatos.addAll(Arrays.asList(contatos));
    }
}
