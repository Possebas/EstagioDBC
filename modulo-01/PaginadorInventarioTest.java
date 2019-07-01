import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PaginadorInventarioTest
{
    @Test
    public void pular0Limitar2(){
        Inventario inventario = new Inventario(4);
	inventario.getItens().add(new Item(1, "Espada"));
	inventario.getItens().add(new Item(2, "Escudo de metal"));
	inventario.getItens().add(new Item(3, "Poção de HP"));
	inventario.getItens().add(new Item(4, "Bracelete"));
	PaginadorInventario paginador = new PaginadorInventario(inventario);
	paginador.pular(0);
	String didie = paginador.limitar(2); // retorna os itens “Espada” e “Escudo de metal”
	//paginador.pular(2);
	//String test = paginador.limitar(2); // retorna os itens “Poção de HP” e “Bracelete”
	assertEquals("Espada,Escudo de metal", didie);
    }
    
    @Test
    public void pularTotal2LimitarTotal4(){
        Inventario inventario = new Inventario(4);
	inventario.getItens().add(new Item(1, "Espada"));
	inventario.getItens().add(new Item(2, "Escudo de metal"));
	inventario.getItens().add(new Item(3, "Poção de HP"));
	inventario.getItens().add(new Item(4, "Bracelete"));
	PaginadorInventario paginador = new PaginadorInventario(inventario);
	paginador.pular(0);
	String didie = paginador.limitar(2); // retorna os itens “Espada” e “Escudo de metal”
	paginador.pular(2);
	String test = paginador.limitar(2); // retorna os itens “Poção de HP” e “Bracelete”
	assertEquals("Espada,Escudo de metal", didie);
	assertEquals("Poção de HP,Bracelete", test);
    }
}
