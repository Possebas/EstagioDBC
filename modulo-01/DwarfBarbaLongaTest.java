import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfBarbaLongaTest
{
    
    private final double DELTA = 1e-9;
    /*
    @Test
    public void diminuirVidaEmMenos10(){
        DwarfBarbaLonga anao = new DwarfBarbaLonga("Gimli");
        anao.diminuirVida();
        assertEquals(100.0, anao.getVida(),DELTA);
    }
    
    @Test
    public void diminuirVidaAleatorio2(){
        DwarfBarbaLonga anao = new DwarfBarbaLonga("Gimli");
        anao.diminuirVida();
        anao.diminuirVida();
        assertEquals(100.0, anao.getVida(),DELTA);
    }
    
    @Test
    public void diminuirVidaAleatorio3(){
        DwarfBarbaLonga anao = new DwarfBarbaLonga("Gimli");
        anao.diminuirVida();
        anao.diminuirVida();
        anao.diminuirVida();
        assertEquals(90.0, anao.getVida(),DELTA);
    }
    */
    @Test
    public void diminuirVidaAleatorio4(){
        DwarfBarbaLonga anao = new DwarfBarbaLonga("Gimli");
        anao.diminuirVida();
        anao.diminuirVida();
        anao.diminuirVida();
        anao.diminuirVida();
        assertEquals(80.0, anao.getVida(),DELTA);
    }
    
}
