
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
        Item arcoDeVidro = new Item(1, "Arco de vidro");
        elfoVerde.ganharItem(arcoDeVidro);
        assertEquals("Arco de vidro",elfoVerde.getInventario().get(2).getDescricao());
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
