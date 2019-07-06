import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaPersonalizadaTest
{
    @Test
    public void getPersonalizado() {
        EstrategiaPersonalizada estrategiaPersonalizada = new EstrategiaPersonalizada();
        Elfo noturno1 = new ElfoNoturno("Noturno 1");
        Elfo noturno2 = new ElfoNoturno("Noturno 2");
        Elfo noturno3 = new ElfoNoturno("Noturno 3");
        Elfo noturno4 = new ElfoNoturno("Noturno 4");
        Elfo verde1 = new ElfoVerde("Verde 1");
        Elfo verde2 = new ElfoVerde("Verde 2");
        Elfo verde3 = new ElfoVerde("Verde 3");
        Elfo verde4 = new ElfoVerde("Verde 4");
        Elfo verde5 = new ElfoVerde("Verde 5");

        noturno1.getFlecha().setQuantidade(3);
        noturno2.getFlecha().setQuantidade(12);
        verde1.getFlecha().setQuantidade(0);
        verde2.getFlecha().setQuantidade(40);
        verde3.getFlecha().setQuantidade(50);

        ArrayList<Elfo> antes = new ArrayList<>();

        antes.add(noturno1);
        antes.add(noturno2);
        antes.add(noturno3);
        antes.add(noturno4);
        antes.add(verde1);
        antes.add(verde2);
        antes.add(verde3);
        antes.add(verde4);
        antes.add(verde5);

        ArrayList<Elfo> depois = estrategiaPersonalizada.getOrdemDeAtaque(antes);

        assertEquals(noturno1, depois.get(0));
        assertEquals(noturno2, depois.get(1));
        assertEquals(verde2, depois.get(2));
        assertEquals(verde3, depois.get(3));
        assertEquals(6, depois.size());
    }
}
