import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoDaLuzTest
{
    private final double DELTA = 1e-9;

    @Test 
    public void elfoDaLuzNasceCom100DeVida(){
        ElfoDaLuz feanor = new ElfoDaLuz("Fëanor");
        assertEquals(100.0,feanor.vida,DELTA);
        assertEquals(Status.RECEM_CRIADO, feanor.getStatus());
    }

    @Test 
    public void elfoDaLuzNasceEspadaGalvorn(){
        ElfoDaLuz feanor = new ElfoDaLuz("Fëanor");
        assertEquals("Espada de Galvorn", feanor.getInventario().get(2).getDescricao());
    }

    @Test
    public void elfoDaLuzAtacaEspadaAumentarXpPerdeVida(){
        ElfoDaLuz feanor = new ElfoDaLuz("Fëanor");
        Dwarf novoDwarf = new Dwarf("Gimli");
        feanor.atacarComEspada(novoDwarf);
        assertEquals(1, feanor.getExperiencia());
        assertEquals(79.0,feanor.vida,DELTA);
    }

    @Test
    public void elfoDaLuzAtaca2VezesAumentarXp2VezesPerdeVida(){
        ElfoDaLuz feanor = new ElfoDaLuz("Fëanor");
        Dwarf novoDwarf = new Dwarf("Gimli");
        feanor.atacarComEspada(novoDwarf);
        feanor.atacarComEspada(novoDwarf);
        assertEquals(89.0,feanor.vida,DELTA);
        assertEquals(2, feanor.getExperiencia());
    }
}
