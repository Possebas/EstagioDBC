import java.util.*;

public class Elfo{
    private String nome;
    private Inventario inventario;
    private int experiencia;
    private Status status;
    
    {
        inventario = new Inventario (2);
        status = Status.RECEM_CRIADO;
        experiencia = 0;
    }
    public Elfo(String nome){
        this.nome = nome;
        getInventario().add(new Item(4, "Flecha"));
        getInventario().add(new Item(1, "Arco"));
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    
    public ArrayList<Item> getInventario(){
        return this.inventario.getItens();
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public int getExperiencia(){
        return this.experiencia;
    }
    
    public void aumentarXp(){
        this.experiencia++;
    }
    
    public void atirarFlecha(Dwarf dwarf){
        Item flecha = inventario.getItens().get(0);
        int qtdAtual = flecha.getQuantidade();
        if(qtdAtual > 0){
            flecha.setQuantidade(qtdAtual - 1);
            this.aumentarXp();
            dwarf.diminuirVida();
        } 
    }
}