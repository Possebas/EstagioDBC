import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void imprimeNomeItens(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(5,"Sabre"));
        assertEquals("Faca,Sabre",inventario.imprimeNomeItens());
    }
    
    @Test
    public void imprimeNenhumItem(){
        Inventario inventario = new Inventario();
        assertEquals("",inventario.imprimeNomeItens());
    }
    
    @Test
    public void buscaQuantidadePorDescricaoItem(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(1,"Adaga"));
        inventario.adicionar(new Item(5,"Sabre"));
        assertEquals(5,inventario.buscaQuantidadePorNomeItem("Sabre"));
    }
    
    @Test
    public void buscaDescricaoPorQuantidadeItem(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(1,"Adaga"));
        inventario.adicionar(new Item(5,"Sabre"));
        assertEquals("Adaga",inventario.buscaDescricaoPorQuantidadeItem(1));
    }
    
    @Test
    public void maiorItem(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(5,"Sabre"));
        inventario.adicionar(new Item(10,"Arma"));
        assertEquals(10,inventario.maiorQuantidade().getQuantidade());
    }
    
    @Test
    public void obtemItemPassandoPosicao(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(5,"Sabre"));
        inventario.adicionar(new Item(1,"Adaga"));
        inventario.adicionar(new Item(3,"Arma"));
        assertEquals(5,inventario.obter(1).getQuantidade());
    }
    
    @Test
    public void getItemMaiorQuantidadeComVarios(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(5,"Sabre"));
        inventario.adicionar(new Item(10,"Arma"));
        assertEquals("Arma",inventario.maiorQuantidade().getDescricao());
    }
    
    @Test
    public void getItemMaiorQuantidadeInventarioVazio(){
        Inventario inventario = new Inventario();
        assertNull(null,inventario.maiorQuantidade());
    }
    
    @Test
    public void getItemMaiorQuantidadeComItensComMesmaQuantidade(){
        Inventario inventario = new Inventario();
        inventario.adicionar(new Item(4,"Faca"));
        inventario.adicionar(new Item(5,"Sabre"));
        inventario.adicionar(new Item(5,"Adaga"));
        inventario.adicionar(new Item(8,"Bazuka"));
        inventario.adicionar(new Item(8,"Bazuka"));
        inventario.adicionar(new Item(5,"Cajado"));
        assertEquals("Bazuka",inventario.maiorQuantidade().getDescricao());
    }
}
