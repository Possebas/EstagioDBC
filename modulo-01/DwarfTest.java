

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    
    private final double DELTA = 1e-9;
    
    @Test 
    public void dwarfNasceCom110DeVida(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals(110.0,dwarf.getVida(),DELTA);
    }
    
    @Test
    public void diminuirVidaEmMenos10(){
        Dwarf anao = new Dwarf("Gimli");
        anao.diminuirVida();
        assertEquals(105.0, anao.getVida(),DELTA);
    }
    
    @Test
    public void dwarfPodePerderVida(){
        Dwarf anao = new Dwarf("Gimli");
        assertEquals(true, anao.podePerderVida());
    }
    
    
    @Test
    public void dwarfDiminuiVidaAte0(){
        Dwarf anao = new Dwarf("Gimli");
        for(int i =0; i<22;i++){
            anao.diminuirVida();
        }
        assertEquals(0, anao.getVida(),1e-9);
        assertEquals(false, anao.podePerderVida());
    }
    
    @Test
    public void dwarfNaoPodeSerAtacadoMorto(){
        Dwarf anao = new Dwarf("Gimli");
        for(int i =0; i<22;i++){
            anao.diminuirVida();
        }
        assertEquals(0, anao.getVida(),1e-9);
        assertEquals(Status.MORTO, anao.getStatus());
        assertEquals(false, anao.podePerderVida());
    }
    
    @Test 
    public void dwarfNasceComStatus(){
        Dwarf dwarf = new Dwarf("Gimli");
        assertEquals(Status.RECEM_CRIADO, dwarf.getStatus());
    }
    
     @Test 
    public void dwarfAdicionaItem(){
        Dwarf dwarf = new Dwarf("Gimli");
        Item flecha = new Item(3, "Flechas");
        dwarf.ganharItem(flecha);
        assertEquals(flecha,dwarf.getInventario().get(1));
    }
    
    @Test 
    public void dwarfPerdeItem(){
        Dwarf dwarf = new Dwarf("Gimli");
        Item flecha = new Item(3, "Flechas");
        dwarf.perderItem(flecha);
        assertEquals(1, dwarf.getInventario().size());
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
       for(int i =0; i<22;i++){
           dwarf.diminuirVida();
       }
       assertEquals(Status.MORTO, dwarf.getStatus());
       assertEquals(0.0, dwarf.getVida(),DELTA);
    }
    
    
    @Test 
    public void dwarfTemEscudo(){
       Dwarf dwarf = new Dwarf("Gimli");
       assertTrue(dwarf.temEscudo());
    }
    
    @Test 
    public void dwarfTemEscudoEPerdeMetade(){
       Dwarf dwarf = new Dwarf("Gimli");
       dwarf.diminuirVida();
       assertEquals(Status.SOFREU_DANO, dwarf.getStatus());
       assertEquals(105.0, dwarf.getVida(),DELTA);
    }
    
    @Test 
    public void dwarfNaoTemEscudoPerdeVida(){
       Dwarf dwarf = new Dwarf("Gimli");
       dwarf.getInventario().remove(0);
       dwarf.diminuirVida();
       assertEquals(Status.SOFREU_DANO, dwarf.getStatus());
       assertEquals(100.0, dwarf.getVida(),DELTA);
    }
    
    @Test 
    public void dwarfTemEscudoEPerdeMetadeDaVida(){
       Dwarf dwarf = new Dwarf("Gimli");
       for(int i =0; i<11;i++){
           dwarf.diminuirVida();
       }
       assertEquals(Status.SOFREU_DANO, dwarf.getStatus());
       assertEquals(55.0, dwarf.getVida(),DELTA);
    }
    
}
