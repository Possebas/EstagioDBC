import java.util.*;
public abstract class Personagem
{
    protected String nome;
    protected Status status;
    protected Inventario inventario;
    protected double vida;
    protected int experiencia;
    protected int qtdExperienciaPorAtaque;
    protected double qtdDano;

    protected int qtdAtaques;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        inventario = new Inventario(0);
        qtdDano = 0.0;
        experiencia = 0;
        qtdAtaques  = 0;
    }

    protected Personagem(String nome){
        this.nome = nome;
    }
    
    
    protected Status getStatus(){
        return this.status;
    }

    protected ArrayList<Item> getInventario(){
        return this.inventario.getItens();
    }

    protected void setNome(String nome){
        this.nome = nome;
    }
    
    protected String getNome(){
        return this.nome;
    }

    protected int getExperiencia(){
        return this.experiencia;
    }

    protected double getVida(){
        return this.vida;
    }

    protected void aumentarXp(){
        this.experiencia = this.experiencia + this.qtdExperienciaPorAtaque;
    }

    protected void ganharItem(Item item){
        this.getInventario().add(item);
    }

    protected void perderItem(Item item){
        this.inventario.getItens().remove(item);
    }

    protected boolean podePerderVida(){
        return this.vida > 0.0;
    }
    
    protected double calcularDano(){
        return this.qtdDano;
    }

    protected void diminuirVida(){
        this.vida -= (this.vida >=this.qtdDano) ? this.calcularDano() : this.vida;
        if(this.vida == 0){
            this.status = Status.MORTO;
        } else {
            this.status = Status.SOFREU_DANO;
        }
    }
    
    protected abstract String imprimirResultado();
}
