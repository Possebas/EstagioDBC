import java.util.*;

public class EstatisticasInventario
{   
    private Inventario inventario;
    
    public EstatisticasInventario(Inventario inventario){
        this.inventario = inventario;
    }
    
    public double calcularMedia(){
        int tam = inventario.getTamanho();
        int qtdItem = 0;
        int totalItens = 0;
        for(int i = 0; i<tam; i++){
            qtdItem = inventario.getItens().get(i).getQuantidade();
            totalItens += qtdItem;
        }
        return totalItens/tam;
    }
    
    public double calcularMediana(){
        double mediana = 0.0;
        int tam = inventario.getTamanho();
        int meio = tam/2;
        if(tam % 2 == 0){
            mediana = (meio + (meio+1))/2;
        } else{
            mediana = meio;
        }
        return mediana;
    }
    
    public int qtdItensAcimaDaMedia(){
        double media = calcularMedia();
        int qtdItemAcimaMedia = 0;
        int qtdItem = 0;
        int tam = inventario.getTamanho();
        
        for(int i = 0; i<tam; i++){
            qtdItem = inventario.getItens().get(i).getQuantidade();
            if(qtdItem > media){
                qtdItemAcimaMedia++;
            }
        }
        return qtdItemAcimaMedia;
    }
}
