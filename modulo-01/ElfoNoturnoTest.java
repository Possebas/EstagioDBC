import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest
{
    private final double DELTA = 1e-9;
    
    @Test 
    public void elfoNoturnoNasceCom100DeVida(){
        ElfoNoturno elfoNoturno = new ElfoNoturno("Legolas Night");
        assertEquals(100.0,elfoNoturno.vida,DELTA);
    }
    
    @Test
    public void atirarFlechaDiminuirFlechaAumentarXp(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(3, novoElfo.getExperiencia());
        assertEquals(3, novoElfo.getInventario().get(0).getQuantidade());
    }
    
    @Test
    public void atirar1FlechaPerdaVida(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(85.0, novoElfo.vida,DELTA);
        assertEquals(3, novoElfo.getInventario().get(0).getQuantidade());
    }
    
    @Test
    public void atirar2FlechaDiminuirFlechaAumentarXp3Vezes(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(9, novoElfo.getExperiencia());
        assertEquals(1, novoElfo.getInventario().get(0).getQuantidade());
    }
    
    
}
