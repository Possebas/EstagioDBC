import java.util.*;
public class Personagem
{
    protected String nome;
    protected Status status;
    protected Inventario inventario;
    protected double vida;
    protected int experiencia;
    protected int qtdExperienciaPorAtaque;
    protected double qtdDano;
    protected static int qtdInstancia;
    protected int qtdAtaques;

    {
        status = Status.RECEM_CRIADO;
        qtdExperienciaPorAtaque = 0;
        inventario = new Inventario(0);
        qtdDano = 0.0;
        experiencia = 0;
        qtdInstancia = 0;
        qtdAtaques  = 0;
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
    
    public String getNome(){
        return this.nome;
    }

    public int getExperiencia(){
        return this.experiencia;
    }

    public double getVida(){
        return this.vida;
    }

    public void aumentarXp(){
        this.experiencia = this.experiencia + this.qtdExperienciaPorAtaque;
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
    
    public double calcularDano(){
        return this.qtdDano;
    }

    public void diminuirVida(){
        this.vida -= (this.vida >=this.qtdDano) ? this.calcularDano() : this.vida;
        if(this.vida == 0){
            this.status = Status.MORTO;
        } else {
            this.status = Status.SOFREU_DANO;
        }
    }
}
