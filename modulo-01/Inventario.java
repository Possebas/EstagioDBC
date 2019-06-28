public class Inventario
{
    private Item itens[];
    private int count = 0;
    public Inventario(){
        this(99);
    }
    
    public Inventario(int quantidade){
        if(quantidade > 0){
            itens = new Item [quantidade];
        }
    }
    
    public void adicionar(Item item){
        for(int i = 0; i < itens.length; i++){
            if(itens[i] == null){
                itens [i] = item;
                count++;
                break;
            }
        }
    }
    
    public int buscaQuantidadePorNomeItem(String item){
        int valor = 0;
        for(int i = 0; i < itens.length; i++){
            if(itens[i].getDescricao()==item){
                valor = itens[i].getQuantidade();
                break;
            }
        }
        return valor;
    }
    
    public String buscaDescricaoPorQuantidadeItem(int item){
        String descricao = "";
        for(int i = 0; i < itens.length; i++){
            if(itens[i].getQuantidade()==item){
                descricao = itens[i].getDescricao();
                break;
            }
        }
        return descricao;
    }
    
    public Item obter(int posicao){
        if(posicao >= 0 && posicao < itens.length-1){
            return itens[posicao];
        } else return null;
    } 
    
    public void remover(int posicao){
        if(posicao >= 0 && posicao < itens.length-1){
            itens[posicao] = null;
            count--;
        }
    }
    
    public Item maiorQuantidade(){
        Item maior = itens[0];
        for(int i = 1; i < itens.length; i++){
            if(itens[i] != null){
                if(maior.getQuantidade() < itens[i].getQuantidade()){
                    maior = itens[i];
                }
            }
        }
        return maior;
    }
    
    public String imprimeNomeItens(){
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                resultado.append(itens[i].getDescricao());
                resultado.append(",");
            }
        }   
        //return resultado.toString();
        return (resultado.length()>0 ? 
        resultado.substring(0,(resultado.length()-1)) : 
        resultado.toString());
    }
    
}
    
   
