import java.util.*;
public class Elfo extends Personagem{
 
    {
        this.inventario = new Inventario (2);
        this.vida = 100.0;
    }
    
    public Elfo(String nome){
        super(nome);
        getInventario().add(new Item(4, "Flecha"));
        getInventario().add(new Item(1, "Arco"));
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