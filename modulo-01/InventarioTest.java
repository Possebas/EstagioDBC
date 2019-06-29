import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest
{
    @Test
    public void getItemAdicionado(){
        Inventario inventario = new Inventario();
        Item sabre = new Item(5,"Sabre");
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(sabre);
        inventario.getItens().add(new Item(10,"Arma"));
        assertEquals(sabre,inventario.getItens().get(1));
    }
    
    @Test
    public void buscaItemPorDescricao(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        assertEquals("Adaga",inventario.buscaItemPorDescricao("Adaga").getDescricao());
    }
    
    @Test
    public void inverteArrayComparaIgual(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(3,"Arma"));
        ArrayList<Item> aux = inventario.inverter();
        ArrayList<Item> desk = new ArrayList<>();
        desk.add(new Item(3,"Arma"));
        desk.add(new Item(1,"Adaga"));
        desk.add(new Item(5,"Sabre"));
        desk.add(new Item(4,"Faca"));
        assertFalse(desk.equals(aux));
    }
    
    @Test
    public void imprimeNomeDosItens(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        assertEquals("Faca,Adaga,Sabre",inventario.imprimeNomeItens());
    }
    
    @Test
    public void imprimeNomeDosItensOrdenadoASC(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(8, "Escudo de metal"));
	inventario.getItens().add(new Item(3, "Poção de HP"));
	inventario.getItens().add(new Item(5, "Bracelete"));
	inventario.ordenarItens();
        assertEquals("Poção de HP,Bracelete,Escudo de metal",inventario.imprimeNomeItens());
    }
    
    @Test
    public void imprimeNomeDosItensOrdenadoDESC(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(6,"Sabre"));
        inventario.getItens().add(new Item(8, "Escudo de metal"));
	inventario.getItens().add(new Item(5, "Bracelete"));
	inventario.ordenarItens(TipoOrdenacao.ASC);
        assertEquals("Escudo de metal,Sabre,Bracelete",inventario.imprimeNomeItens());
    }
}
