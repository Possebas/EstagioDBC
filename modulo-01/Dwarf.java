import java.util.*;
public class Dwarf extends Personagem
{    
    
    {
        this.inventario = new Inventario(1);
        this.vida = 110.0;
    }
    
    public Dwarf(String nome){
        super(nome);
        this.equiparEscudo();
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
