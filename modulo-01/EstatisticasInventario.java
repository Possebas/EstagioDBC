import java.util.*;

public class EstatisticasInventario
{   
    private Inventario inventario;
    
    public EstatisticasInventario(Inventario inventario){
        this.inventario = inventario;
    }
    
    public double calcularMedia(){
        if(this.inventario.getItens().isEmpty()){
            return Double.NaN;
        } 
        double somaQtds = 0;
        for(Item item : this.inventario.getItens()){
            somaQtds += item.getQuantidade(); 
        }
        return somaQtds / this.inventario.getItens().size();
    }
    
    public double calcularMediana(){
        int qtdItens = this.inventario.getItens().size();
        int meio = qtdItens / 2;
        int qtdMeio = this.inventario.getItens().get(meio).getQuantidade();
        if(qtdItens % 2 == 1){
             return qtdMeio;
        }
        int qtdMeioMenosUm = this.inventario.getItens().get(meio-1).getQuantidade();
        return (qtdMeio + qtdMeioMenosUm)/2.0;
    }
    
    public int qtdItensAcimaDaMedia(){
        double media = this.calcularMedia();
        int qtdAcima = 0;
        
        for(Item item : this.inventario.getItens()){
            if( item.getQuantidade() > media ){
                qtdAcima++;
            }
        }
        return qtdAcima++;
    }
}
