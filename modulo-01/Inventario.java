import java.util.*;

public class Inventario
{
    private ArrayList<Item> itens;
    
    public Inventario(){
        itens = new ArrayList<>();
    }
   
    public ArrayList<Item> getItens(){
        return this.itens;
    }
   
    public int getTamanho(){
        return this.itens.size();
    }
    
    public Item buscaItemPorDescricao(String descricao){
        Item aux = null;
        for(int i = 0; i < itens.size(); i++){
            aux = itens.get(i);
            if(aux.getDescricao() == descricao){
               return aux;
            }        
        }      
        return (aux != null) ? aux : null;
    }
    
    public ArrayList<Item> inverter() { 
        ArrayList<Item> aux = new ArrayList<Item>(); 
        int tam = getTamanho() - 1;
        for (int i = tam; i >= 0; i--){
            aux.add(getItens().get(i)); 
        }
        return aux; 
    } 
    
    public void ordenarItens(){ //Classico bubbleSort como otimização de n ao quadrado, considerando n como numero de elementos.
       Item aux = null;
       if (itens.size()>1){ // nem entra senão houver mais de um item
            for (int j=0; j<itens.size(); j++){ //laço mais externo onde
                for (int i=0; i < itens.size()-i; i++){
                    if (itens.get(i).compareTo(itens.get(i+1)) > 0){ //comparo o que to, é maior que o proximo e então realizo a troca
                        aux = itens.get(i); //atual fica em aux
                        itens.set(i,itens.get(i+1) ); //proxima posição na atual
                        itens.set(i+1, aux); //proxima posição com o aux (atual)
                    }
                }
            }
       } 
    }
    
    public void ordenarItens(TipoOrdenacao ordem){ 
       //Classico bubbleSort como otimização de n ao quadrado, considerando n como numero de elementos.
       Item aux = null;
       if(ordem == TipoOrdenacao.ASC){
           if (itens.size()>1){ // nem entra senão houver mais de um item
               for (int j=0; j<itens.size(); j++){ //laço mais externo onde
                   for (int i=0; i < itens.size()-i; i++){
                       if (itens.get(i).compareTo(itens.get(i+1)) < 0){ //comparo o que to, é menor que o proximo e então realizo a troca
                           aux = itens.get(i); //atual fica em aux
                           itens.set(i,itens.get(i+1) ); //proxima posição na atual
                           itens.set(i+1, aux); //proxima posição com o aux (atual)
                    }
                }
               }
           }     
        } //else{ordenarItens();}       
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
}   
    
   
