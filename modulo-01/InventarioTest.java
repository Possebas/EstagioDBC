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
}
