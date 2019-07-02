import java.util.*;
public class Dwarf
{
    private String nome;
    private double vida;
    private Status status;
    private Inventario inventario;
    
    {
        inventario = new Inventario(1);
        status = Status.RECEM_CRIADO;
        vida = 110.0;
    }
    
    public Dwarf(String nome){
        this.nome = nome;
        this.equiparEscudo();
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    public ArrayList<Item> getInventario(){
        return this.inventario.getItens();
    }
    
    public void equiparEscudo(){
        this.inventario.getItens().add(new Item(1,"Escudo"));
    }
    
    public boolean temEscudo(){
        Item escudo = this.inventario.buscaItemPorDescricao("Escudo");
        if(escudo != null){
           return true;
        }
        return false;
    }
    public double getVida(){
        return this.vida;
    }
    
    public boolean podePerderVida(){
        return this.vida > 0.0;
    }
    
    public void ganharItem(Item item){
        this.inventario.getItens().add(item);
    }
    
    public void perderItem(Item item){
        this.inventario.getItens().remove(item);
    }
    
    public void diminuirVida(){
        if(podePerderVida()){
            if(temEscudo()){
                this.vida = (this.vida >=5.0) ? this.vida - 5.0 : 0.0;
            } else{
                this.vida = (this.vida >=10.0) ? this.vida - 10.0 : 0.0;
            }
            if(this.vida == 0){
                this.status = Status.MORTO;
            } else {
                this.status = Status.SOFREU_DANO;
            }
        }
    }
}
