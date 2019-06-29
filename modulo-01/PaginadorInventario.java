import java.util.*;

public class PaginadorInventario
{
    private Inventario inventario;
    private int index = 0;
    
    public PaginadorInventario(Inventario inventario){
        this.inventario = inventario;
    }
    
    public void pular(int index){
        this.index = index;
    }
    
    public String limitar(int numElem){
        int qtdPagina = numElem;
        StringBuilder resultado = new StringBuilder();
        int total = this.index+qtdPagina;
        Item aux = null;
        for(int i = this.index; i < total; i++){
            aux = inventario.getItens().get(i);
            if(aux != null){
                resultado.append(aux.getDescricao());
                resultado.append(",");
            }
        }   
        return (resultado.length()>0 ? 
                resultado.substring(0,(resultado.length()-1)) : 
                resultado.toString());
    }
}
