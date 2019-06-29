import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest{
    
    @Test
    public void atirarFlechaDiminuirFlechaAumentarXp(){
        Elfo novoElfo = new Elfo("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(4, novoElfo.getExperiencia());
        assertEquals(0, novoElfo.getInventario().get(0).getQuantidade());
    }
    
    @Test
    public void atirarFlechaDiminuirFlechaAumentarXpDwarf(){
        Elfo novoElfo = new Elfo("Legolas");
        Dwarf novoDwarf = new Dwarf("Gimli");
        novoElfo.atirarFlecha(novoDwarf);
        assertEquals(1, novoElfo.getExperiencia());
        assertEquals(3, novoElfo.getInventario().get(0).getQuantidade());
    }
    
    
    @Test
    public void criarNovoElfoCom4Flechas(){
        Elfo novoElfo = new Elfo("Legolas");
        assertEquals(4, novoElfo.getInventario().get(0).getQuantidade());
    }
        
    @Test
    public void criarNovoElfoCom1Arco(){
        Elfo novoElfo = new Elfo("Legolas");
        assertEquals(1, novoElfo.getInventario().get(1).getQuantidade());
    }
    
    @Test
    public void elfoNasceComStatusRecemCriado(){
        Elfo novoElfo = new Elfo("Legolas");
        assertEquals(Status.RECEM_CRIADO, novoElfo.getStatus());
    }
}
