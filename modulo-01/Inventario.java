import java.util.*;

public class Inventario
{
    private ArrayList<Item> itens;
    private int count = 0;
    
    public Inventario(){
        itens = new ArrayList<>();
    }
   
    public ArrayList<Item> getItens(){
        return this.itens;
    }
}
    
   
