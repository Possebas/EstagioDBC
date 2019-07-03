
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest
{
    private final double DELTA = 1e-9;
    
    @Test 
    public void elfoVerdeNasceCom100DeVida(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        assertEquals(100.0,elfoVerde.vida,DELTA);
    }
    
    @Test
    public void elfoVerdeAdicionaItemArcoDeVidro(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item arcoDeVidro = new Item(1, "Arco de Vidro");
        elfoVerde.ganharItem(arcoDeVidro);
        assertEquals("Arco de Vidro",elfoVerde.getInventario().get(2).getDescricao());
    }
    
    @Test
    public void elfoVerdeRemoveItemArcoDeVidro(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item arcoDeVidro = new Item(1, "Arco de vidro");
        elfoVerde.ganharItem(arcoDeVidro);
        elfoVerde.perderItem(arcoDeVidro);
        assertEquals("Arco",elfoVerde.getInventario().get(1).getDescricao());
    }
    
    @Test
    public void elfoVerdeAdicionaItemEspadaValeriano(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item espadaValiriana = new Item(1, "Espada de aço valiriano");
        elfoVerde.ganharItem(espadaValiriana);
        assertEquals("Espada de aço valiriano",elfoVerde.getInventario().get(2).getDescricao());
    }
    
    @Test
    public void elfoVerdeRemoveItemEspadaValeriano(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item espadaValiriana = new Item(1, "Espada de aço valiriano");
        elfoVerde.ganharItem(espadaValiriana);
        assertEquals("Arco",elfoVerde.getInventario().get(1).getDescricao());
    }
    
    @Test
    public void elfoVerdeAdicionaItemFlechaDeVidro(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item flechaDeVidro = new Item(1, "Flecha de Vidro");
        elfoVerde.ganharItem(flechaDeVidro);
        assertEquals("Flecha de Vidro",elfoVerde.getInventario().get(2).getDescricao());
    }
    
    @Test
    public void elfoVerdeRemoveItemFlechaDeVidro(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item flechaDeVidro = new Item(1, "Flecha de Vidro");
        elfoVerde.ganharItem(flechaDeVidro);
        elfoVerde.perderItem(flechaDeVidro);
        assertEquals("Arco",elfoVerde.getInventario().get(1).getDescricao());
    }
    
    @Test
    public void elfoVerdeAdicionaItemInvalido(){
        ElfoVerde elfoVerde = new ElfoVerde("Legolas Green");
        Item pocaoDeHp = new Item(1, "Pocao de HP");
        elfoVerde.ganharItem(pocaoDeHp);
        assertNull(elfoVerde.inventario.buscaItemPorDescricao("Pocao de HP"));
    }
    
    @Test
    public void atirarFlechaDiminuirFlechaAumentarDobroXpElfo(){
        ElfoVerde novoElfo = new ElfoVerde("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(2, novoElfo.getExperiencia());
        assertEquals(3, novoElfo.getInventario().get(0).getQuantidade());
    }
}
