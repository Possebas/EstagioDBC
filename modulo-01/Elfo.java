import java.util.*;
public class Elfo extends Personagem{
    protected static int qtdInstancia;
    {
        this.vida = 100.0;
    }

    public Elfo(String nome){
        super(nome);
        this.qtdExperienciaPorAtaque = 1;
        getInventario().add(new Item(4, "Flecha"));
        getInventario().add(new Item(1, "Arco"));
        Elfo.qtdInstancia++;
    }

    protected void finalize() throws Throwable{
        Elfo.qtdInstancia--;
    }

    protected static int getQtdElfos(){
        return Elfo.qtdInstancia;
    }

    public void atirarFlecha(Dwarf dwarf){
        Item flecha = this.inventario.getItens().get(0);
        int qtdAtual = flecha.getQuantidade();
        if(qtdAtual > 0){
            flecha.setQuantidade(qtdAtual - 1);
            this.aumentarXp();
            dwarf.diminuirVida();
        } 
    }

    public void atacar(){
        
    }
    
    
    public String imprimirResultado(){
        return "Elfo";
    }
}