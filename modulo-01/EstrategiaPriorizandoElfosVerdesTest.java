import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstrategiaPriorizandoElfosVerdesTest
{
    @Test
    public void exercitoEmbaralhadoPriozaAtaqueComElfosVerdes(){
        EstrategiaPriorizandoElfosVerdes estrategia = new EstrategiaPriorizandoElfosVerdes();
        Elfo noturno1 = new ElfoNoturno("Noite 1");
        Elfo noturno2 = new ElfoNoturno("Noite 2");
        Elfo verde1 = new ElfoVerde("Verde 1");
        Elfo noturno3 = new ElfoNoturno("Noite 3");
        Elfo verde2 = new ElfoVerde("Verde 2");
        Elfo noturno4 = new ElfoNoturno("Noite 4");
        Elfo verde3 = new ElfoVerde("Verde 3");
        ArrayList<Elfo> elfosEsperados = new ArrayList<>();
        ArrayList<Elfo> elfosEnviados = new ArrayList<>();
        elfosEnviados.add(noturno1);
        elfosEnviados.add(noturno2);
        elfosEnviados.add(verde1);
        elfosEnviados.add(noturno3);
        elfosEnviados.add(verde2);
        elfosEnviados.add(noturno4);
        elfosEnviados.add(verde3);
        
        elfosEsperados.add(verde1);
        elfosEsperados.add(verde2);
        elfosEsperados.add(verde3);
        elfosEsperados.add(noturno1);
        elfosEsperados.add(noturno2);
        elfosEsperados.add(noturno3);
        elfosEsperados.add(noturno4);
        ArrayList<Elfo> elfosTest = estrategia.getOrdemDeAtaque(elfosEnviados);
        assertEquals(elfosEsperados, elfosTest);
    }
}
