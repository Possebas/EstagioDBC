

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
    
    @Test 
    public void dwarfNasceComStatus(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals(Status.RECEM_CRIADO, dwarf.getStatus());
    }
    
    @Test 
    public void dwarfPerdeVidaEContinuaVivo(){
        Dwarf dwarf = new Dwarf("Gimli");
        dwarf.diminuirVida();
        
        assertEquals(Status.SOFREU_DANO, dwarf.getStatus());
    }
    
    @Test 
    public void dwarfPerdeVidaEDeveMorrer(){
       Dwarf dwarf = new Dwarf("Gimli");
       for(int i =0; i<12;i++){
           dwarf.diminuirVida();
       }
       assertEquals(Status.MORTO, dwarf.getStatus());
       assertEquals(0.0, dwarf.getVida(),1e-9);
    }
    
}
