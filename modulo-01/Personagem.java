import java.util.*;
public class Personagem
{
    protected String nome;
    protected Status status;
    protected Inventario inventario;
    protected double vida;
    protected int experiencia;
    
    {
        status = Status.RECEM_CRIADO;
        inventario = new Inventario(0);
        experiencia = 0;
    }
    
    public Personagem(String nome){
        this.nome = nome;
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
    
    public double getVida(){
        return this.vida;
    }
    
    public void aumentarXp(){
        this.experiencia++;
    }
    
    public void ganharItem(Item item){
        this.getInventario().add(item);
    }
    
    public void perderItem(Item item){
        this.inventario.getItens().remove(item);
    }
    
    public boolean podePerderVida(){
        return this.vida > 0.0;
    }

}
