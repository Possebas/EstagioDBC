import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstrategiaIntercaladoTest
{
    @Test
    public void ataqueIntercalado(){
        ElfoVerde novoElfo = new ElfoVerde("Legolas1");
        ElfoVerde novoElfo2 = new ElfoVerde("Legolas2");
        ElfoVerde novoElfo3 = new ElfoVerde("Legolas3");
        ElfoNoturno novoElfo4 = new ElfoNoturno("Legolas4");
        ElfoNoturno novoElfo5 = new ElfoNoturno("Legolas5");
        ElfoNoturno novoElfo6 = new ElfoNoturno("Legolas6");

        ArrayList<Elfo> antes = new ArrayList<>();
        antes.add(novoElfo);
        antes.add(novoElfo2);
        antes.add(novoElfo3);
        antes.add(novoElfo4);
        antes.add(novoElfo5);
        antes.add(novoElfo6);

        EstrategiaIntercalado estrategia = new EstrategiaIntercalado();
        ArrayList<Elfo> depois = estrategia.getOrdemDeAtaque(antes);
        assertEquals(ElfoNoturno.class , depois.get(0).getClass());
        assertEquals(ElfoVerde.class , depois.get(1).getClass());
        assertEquals(ElfoNoturno.class , depois.get(2).getClass());
    }
}
