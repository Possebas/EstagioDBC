import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void getItemAdicionado(){
        Inventario inventario = new Inventario(3);
        Item sabre = new Item(5,"Sabre");
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(sabre);
        inventario.getItens().add(new Item(10,"Arma"));
        assertEquals(sabre,inventario.getItens().get(1));
    }
    
    @Test
    public void buscarApenasUmItem(){
        Inventario inventario = new Inventario(0);
        assertNull(inventario.buscaItemPorDescricao("Capa"));
    }
    
    @Test
    public void buscarItemComInventarioVazio(){
        Inventario inventario = new Inventario(1);
        Item termica = new Item(4,"Termica");
        inventario.getItens().add(termica);
        assertNull(inventario.buscaItemPorDescricao("Capa"));
    }
    
    @Test
    public void inverterInventarioVazio(){
        Inventario inventario = new Inventario(0);
        assertTrue(inventario.inverter().isEmpty());
    }
    
    @Test
    public void buscarApenasUmItemComMesmaDescricao(){
        Inventario inventario = new Inventario(1);
        Item termica1= new Item(4,"Termica");
        Item termica2 = new Item(4,"Termica");
        inventario.getItens().add(termica1);
        inventario.getItens().add(termica2);
        assertEquals(termica1,inventario.buscaItemPorDescricao("Termica"));
    }
    
    @Test
    public void getItemMaiorQuantidade(){
        Inventario inventario = new Inventario(3);
        Item sabre = new Item(10,"Sabre");
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(sabre);
        inventario.getItens().add(new Item(5,"Arma"));
        assertEquals(sabre,inventario.itemComMaiorQuantidade());
    }
    
    @Test
    public void buscaItemPorDescricao(){
        Inventario inventario = new Inventario(3);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        assertEquals("Adaga",inventario.buscaItemPorDescricao("Adaga").getDescricao());
    }
    
    @Test
    public void inverteArrayComparaIgual(){
        Inventario inventario = new Inventario(4);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(1,"Adaga"));
        Item arma = new Item(3,"Arma");
        inventario.getItens().add(arma);
        ArrayList<Item> aux = inventario.inverter();
        assertEquals(arma, aux.get(0));
        assertEquals(4, aux.size());
    }
    
    @Test
    public void imprimeNomeDosItens(){
        Inventario inventario = new Inventario(3);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        assertEquals("Faca,Adaga,Sabre",inventario.imprimeNomeItens());
    }
    
    @Test
    public void imprimeNomeDosItensOrdenadoASC(){
        Inventario inventario = new Inventario(3);
        inventario.getItens().add(new Item(8, "Escudo de metal"));
        inventario.getItens().add(new Item(3, "Poção de HP"));
        inventario.getItens().add(new Item(5, "Bracelete"));
        inventario.ordenarItens();
        assertEquals("Poção de HP,Bracelete,Escudo de metal",inventario.imprimeNomeItens());
    }
    
    @Test
    public void imprimeNomeDosItensOrdenadoDESC(){
        Inventario inventario = new Inventario(3);
        inventario.getItens().add(new Item(6,"Sabre"));
        inventario.getItens().add(new Item(8, "Escudo de metal"));
        inventario.getItens().add(new Item(5, "Bracelete"));
        inventario.ordenarItens(TipoOrdenacao.ASC);
        assertEquals("Bracelete,Sabre,Escudo de metal",inventario.imprimeNomeItens());
    }
    
    
    @Test
    public void inventerComApenasUmItem(){
        Inventario inventario = new Inventario(1);
        Item termica = new Item(1, "Termica");
        inventario.getItens().add(termica);
        assertEquals(termica, inventario.inverter().get(0));
        assertEquals(1, inventario.inverter().size());
    }
    
    
    @Test
    public void inventerComDoisItens(){
        Inventario inventario = new Inventario(2);
        Item termica = new Item(1, "Termica");
        Item espada = new Item(5, "Espada");
        inventario.getItens().add(termica);
        inventario.getItens().add(espada);
        assertEquals(espada, inventario.inverter().get(0));
        assertEquals(2, inventario.inverter().size());
    }

}
