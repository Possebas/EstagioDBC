

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    @Test
    public void diminuirVidaEmMenos10(){
        Dwarf anao = new Dwarf("Gimli");
        anao.diminuirVida();
        assertEquals(100.0, anao.getVida(),0.1);
    }
    
    @Test
    public void diminuirVidaAte0(){
        Dwarf anao = new Dwarf("Gimli");
        for(int i =0; i<12;i++){
            anao.diminuirVida();
        }
        assertEquals(0, anao.getVida(),0.1);
    }

}
