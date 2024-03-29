import java.util.*;

public class PaginadorInventario
{
    private Inventario inventario;
    private int marcador = 0;
    
    public PaginadorInventario(Inventario inventario){
        this.inventario = inventario;
    }
    
    public void pular(int index){
        this.marcador = marcador > 0 ? marcador : 0;
    }
    
    public ArrayList<Item> limitar(int qtd){
        ArrayList<Item> subConjunto = new ArrayList<>();
        int fim = this.marcador +qtd;
        for (int i = this.marcador; i < fim && i < this.inventario.getItens().size(); i++){
            subConjunto.add(this.inventario.getItens().get(i));
        }
        return subConjunto;
    }
}
