import java.util.*;

public class Inventario
{
    private ArrayList<Item> itens;
    
    public Inventario(int quantidade){
        itens = new ArrayList<>(quantidade);
    }
   
    public ArrayList<Item> getItens(){
        return this.itens;
    }
   
    public int getTamanho(){
        return this.itens.size();
    }
    
    public Item buscaItemPorDescricao(String descricao){
        for(Item itemAtual : this.itens){
            boolean encontrei = itemAtual.getDescricao().equals(descricao);
            if(encontrei){
                return itemAtual;
            }
        }
        return null;
    }
    
    public ArrayList<Item> inverter() { 
        ArrayList<Item> aux = new ArrayList<Item>(this.itens.size()); 
        int tam = getTamanho() - 1;
        for (int i = tam; i >= 0; i--){
            aux.add(this.getItens().get(i)); 
        }
        return aux; 
    }
    
    public void ordenarItens(){ 
        this.ordenarItens(TipoOrdenacao.ASC);
     }
    
    public void ordenarItens(TipoOrdenacao ordenacao){ 
       if (itens.size()>1){ 
            for (int i=0; i<itens.size(); i++){ 
                for (int j=0; j < itens.size()-1; j++){
                    Item atual = this.itens.get(j);
                    Item proximo = this.itens.get(j+1);
                    boolean deveTrocar = ordenacao == TipoOrdenacao.ASC ? 
                    atual.getQuantidade() > proximo.getQuantidade() : 
                    atual.getQuantidade() < proximo.getQuantidade();
                    if(deveTrocar){
                        Item itemTrocado = atual;
                        this.itens.set(j, proximo);
                        this.itens.set(j+1, atual);
                    }
                }
            }
       } 
    }
    
    
    public String imprimeNomeItens(){
        StringBuilder resultado = new StringBuilder();
        Item aux = null;
        for(int i = 0; i < itens.size(); i++){
            aux = itens.get(i);
            if(aux != null){
                resultado.append(aux.getDescricao());
                resultado.append(",");
            }
        }   
        return (resultado.length()>0 ? 
                resultado.substring(0,(resultado.length()-1)) : 
                resultado.toString());
    }
    
    public Item itemComMaiorQuantidade(){
        int indice = 0;
        int valor = 0;
        for(int i = 0; i < itens.size();i++){
            if(valor < itens.get(i).getQuantidade()){
                valor = itens.get(i).getQuantidade();
                indice = i;
            }
        }
        return this.itens.size() > 0 ? this.itens.get(indice) : null;
    }  
} 
    
   
