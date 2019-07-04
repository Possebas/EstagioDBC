import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercitoTest
{
    @Test
    public void alistarVariosDoTipoElfoNoturno(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas1");
        ElfoNoturno novoElfo2 = new ElfoNoturno("Legolas2");
        ElfoNoturno novoElfo3 = new ElfoNoturno("Legolas3");
        ElfoNoturno novoElfo4 = new ElfoNoturno("Legolas4");
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        assertEquals(4,exercito.getExercito().size());
    }

    @Test
    public void alistarVariosDoTipoElfoVerde(){
        ElfoVerde novoElfo = new ElfoVerde("Legolas1");
        ElfoVerde novoElfo2 = new ElfoVerde("Legolas2");
        ElfoVerde novoElfo3 = new ElfoVerde("Legolas3");
        ElfoVerde novoElfo4 = new ElfoVerde("Legolas4");
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        assertEquals(4,exercito.getExercito().size());
    }
    
    @Test
    public void alistarVariosDoTipoElfoDaLuz(){
        ElfoDaLuz novoElfo = new ElfoDaLuz("Legolas1");
        ElfoDaLuz novoElfo2 = new ElfoDaLuz("Legolas2");
        ElfoDaLuz novoElfo3 = new ElfoDaLuz("Legolas3");
        ElfoDaLuz novoElfo4 = new ElfoDaLuz("Legolas4");
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        assertEquals(0,exercito.getExercito().size());
    }
    
    @Test
    public void alistarVariosElfoVerdeElfoNoturno(){
        ElfoVerde novoElfo = new ElfoVerde("Legolas1");
        ElfoVerde novoElfo2 = new ElfoVerde("Legolas2");
        ElfoVerde novoElfo3 = new ElfoVerde("Legolas3");
        ElfoVerde novoElfo4 = new ElfoVerde("Legolas4");
        ElfoNoturno novoElfo5 = new ElfoNoturno("Legolas5");
        ElfoNoturno novoElfo6 = new ElfoNoturno("Legolas6");
        ElfoNoturno novoElfo7 = new ElfoNoturno("Legolas7");
        ElfoNoturno novoElfo8 = new ElfoNoturno("Legolas8");
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        exercito.alistar("Legolas5", novoElfo5);
        exercito.alistar("Legolas6", novoElfo6);
        exercito.alistar("Legolas7", novoElfo7);
        exercito.alistar("Legolas8", novoElfo8);
        assertEquals(8,exercito.getExercito().size());
    }
    
    @Test
    public void buscarTodosPorStatusRecemCriado(){
        ElfoVerde novoElfo = new ElfoVerde("Legolas1");
        ElfoVerde novoElfo2 = new ElfoVerde("Legolas2");
        ElfoVerde novoElfo3 = new ElfoVerde("Legolas3");
        ElfoVerde novoElfo4 = new ElfoVerde("Legolas4");
        ElfoNoturno novoElfo5 = new ElfoNoturno("Legolas5");
        ElfoNoturno novoElfo6 = new ElfoNoturno("Legolas6");
        ElfoNoturno novoElfo7 = new ElfoNoturno("Legolas7");
        ElfoNoturno novoElfo8 = new ElfoNoturno("Legolas8");
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        exercito.alistar("Legolas5", novoElfo5);
        exercito.alistar("Legolas6", novoElfo6);
        exercito.alistar("Legolas7", novoElfo7);
        exercito.alistar("Legolas8", novoElfo8);
        assertEquals(8,exercito.buscarPorStatus(Status.RECEM_CRIADO).size());
    }
    
    @Test
    public void buscarTodosPorStatusSofreuDano(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas1");
        ElfoVerde novoElfo2 = new ElfoVerde("Legolas2");
        ElfoVerde novoElfo3 = new ElfoVerde("Legolas3");
        ElfoVerde novoElfo4 = new ElfoVerde("Legolas4");
        ElfoVerde novoElfo5 = new ElfoVerde("Legolas5");
        ElfoNoturno novoElfo6 = new ElfoNoturno("Legolas6");
        ElfoNoturno novoElfo7 = new ElfoNoturno("Legolas7");
        ElfoNoturno novoElfo8 = new ElfoNoturno("Legolas8");
        Dwarf anao = new Dwarf("Gimli");
        novoElfo.atirarFlecha(anao);
        novoElfo.atirarFlecha(anao);
        novoElfo.atirarFlecha(anao);
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        exercito.alistar("Legolas3", novoElfo3);
        exercito.alistar("Legolas4", novoElfo4);
        exercito.alistar("Legolas5", novoElfo5);
        exercito.alistar("Legolas6", novoElfo6);
        exercito.alistar("Legolas7", novoElfo7);
        exercito.alistar("Legolas8", novoElfo8);
        assertEquals(1,exercito.buscarPorStatus(Status.SOFREU_DANO).size());
    }
    
    @Test
    public void buscarTodosPorStatusMorto(){
        ElfoNoturno novoElfo = new ElfoNoturno("Legolas1");
        ElfoNoturno novoElfo2 = new ElfoNoturno("Legolas2");
        novoElfo.getInventario().set(0,new Item(100,"Arco"));
        novoElfo2.getInventario().set(0,new Item(100,"Arco"));
        Dwarf anao1 = new Dwarf("Gimli1");
        Dwarf anao2 = new Dwarf("Gimli2");
        for(int i = 0; i <10;i++){
            novoElfo.atirarFlecha(anao1);
            novoElfo2.atirarFlecha(anao2);
        }
        Exercito exercito = new Exercito();
        exercito.alistar("Legolas1", novoElfo);
        exercito.alistar("Legolas2", novoElfo2);
        assertEquals(2,exercito.buscarPorStatus(Status.MORTO).size());
        assertEquals(novoElfo.getNome(),exercito.getExercito().get("Legolas1").getNome());
    }
    
    
}
