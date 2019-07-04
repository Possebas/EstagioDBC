import java.util.*;
public class Dwarf extends Personagem
{    
    
    {
        this.vida = 110.0;
        this.qtdDano = 10.0;
    }
    
    public Dwarf(String nome){
        super(nome);
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
    
    @Override
    public double calcularDano(){
        return this.temEscudo() ? 5.0 : this.qtdDano; 
    }
    
}
