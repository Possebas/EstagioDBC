import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstatisticasInventarioTest
{
    @Test
    public void calcularMedia4Itens25Quantidades(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(10,"Cajado"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(5.0, objeto.calcularMedia(),0.1);
    }
    
    @Test
    public void calcularMediana(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(15,"Cajado"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(2.0, objeto.calcularMediana(),0.1);
    }
    
    
    @Test
    public void qtdItensAcimaDaMediaCom3(){
        Inventario inventario = new Inventario();
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(15,"Cajado"));
        inventario.getItens().add(new Item(12,"Lança"));
        inventario.getItens().add(new Item(25,"Espada"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(3, objeto.qtdItensAcimaDaMedia());
    }
}
