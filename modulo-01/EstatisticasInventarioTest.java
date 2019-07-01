
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EstatisticasInventarioTest
{
    @Test
    public void calcularMediaInventarioVazio(){
        Inventario inventario = new Inventario(0);
        EstatisticasInventario estatistica = new EstatisticasInventario(inventario);
        assertTrue(Double.isNaN(estatistica.calcularMedia()));
    }
    
    @Test
    public void calcularMediaInventarioComDoisItens(){
        Inventario inventario = new Inventario(2);
        inventario.getItens().add(new Item(2,"Adaga"));
        inventario.getItens().add(new Item(2,"Sabre"));
        EstatisticasInventario estatistica = new EstatisticasInventario(inventario);
        assertEquals(2.0,estatistica.calcularMedia(),1e-9);
    }
    
    @Test
    public void calcularMediaCom4Itens25Quantidades(){
        Inventario inventario = new Inventario(4);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(10,"Cajado"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(5.0, objeto.calcularMedia(),1e-9);
    }
    
    @Test
    public void calcularMediana4Itens(){
        Inventario inventario = new Inventario(5);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(15,"Cajado"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(3.0, objeto.calcularMediana(),1e-9);
    }
    
    @Test
    public void calcularMediana5Itens(){
        Inventario inventario = new Inventario(5);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(15,"Cajado"));
        inventario.getItens().add(new Item(12,"Espada"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(5.0, objeto.calcularMediana(),1e-9);
    }
    
    @Test
    public void qtdItensAcimaDaMediaCom0(){
        Inventario inventario = new Inventario(0);
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(0, objeto.qtdItensAcimaDaMedia());
    }
    
    @Test
    public void qtdItensAcimaDaMediaCom6Itens(){
        Inventario inventario = new Inventario(6);
        inventario.getItens().add(new Item(4,"Faca"));
        inventario.getItens().add(new Item(1,"Adaga"));
        inventario.getItens().add(new Item(5,"Sabre"));
        inventario.getItens().add(new Item(10,"Cajado"));
        inventario.getItens().add(new Item(11,"Lança"));
        inventario.getItens().add(new Item(12,"Espada"));
        EstatisticasInventario objeto = new EstatisticasInventario(inventario);
        assertEquals(7.166666666666667,objeto.calcularMedia(),1e-9);
        assertEquals(3, objeto.qtdItensAcimaDaMedia());
    }
}
