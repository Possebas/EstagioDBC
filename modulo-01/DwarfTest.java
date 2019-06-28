

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    
    @Test 
    public void dwarfNasceCom110DeVida(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals(110.0,dwarf.getVida(),0.1);
    }
    
    @Test
    public void diminuirVidaEmMenos10(){
        Dwarf anao = new Dwarf("Gimli");
        anao.diminuirVida();
        assertEquals(100.0, anao.getVida(),1e-9);
    }
    
    @Test
    public void dwarfPodePerderVida(){
        Dwarf anao = new Dwarf("Gimli");
        assertEquals(true, anao.podePerderVida());
    }
    
    @Test
    public void dwarfDiminuiVidaAte0(){
        Dwarf anao = new Dwarf("Gimli");
        for(int i =0; i<11;i++){
            anao.diminuirVida();
        }
        assertEquals(0, anao.getVida(),0.1);
        assertEquals(false, anao.podePerderVida());
    }
    
    @Test
    public void dwarfNaoPodeSerAtacadoMorto(){
        Dwarf anao = new Dwarf("Gimli");
        for(int i =0; i<11;i++){
            anao.diminuirVida();
        }
        assertEquals(0, anao.getVida(),0.1);
        assertEquals(Status.MORTO, anao.getStatus());
        assertEquals(false, anao.podePerderVida());
    }

}
