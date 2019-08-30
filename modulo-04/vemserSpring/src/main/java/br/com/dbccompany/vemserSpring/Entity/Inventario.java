package br.com.dbccompany.vemserSpring.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@SequenceGenerator( allocationSize = 1, name = "INVENTARIO_SEQ", sequenceName = "INVENTARIO_SEQ" )
public class Inventario extends AbstractEntity{

    @Id
    @Column( name = "id_inventario" )
    @GeneratedValue( generator = "INVENTARIO_SEQ", strategy = GenerationType.SEQUENCE )
    private Integer id;

    @Column( name = "tamanho",  length = 100, nullable = false)
    private Integer tamanho;

    @JoinColumn( name="itens" )
    @OneToMany( mappedBy = "itens", cascade = CascadeType.ALL )
	private List<Item> itens = new ArrayList<>();

    public Inventario(Integer quantidade){
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



@OneToMany(mappedBy = "id_item", cascade = CascadeType.ALL, fetch = FetchType.EAGER)