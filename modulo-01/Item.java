public class Item{
    protected int quantidade;
    protected String descricao;
    
    public Item(int quantidade, String descricao){
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = (quantidade >= 0) ? quantidade : this.quantidade;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(){
        this.descricao = descricao;
    }
    
    public int compareTo(Item item) 
    {
      int resultado = 0;
      if (this.quantidade > item.quantidade){resultado = 1;} 
      if (this.quantidade < item.quantidade) {resultado = -1;}
      return resultado;
    }
    
    public boolean equals(Object obj){
        Item outroItem = (Item)obj;
        return this.quantidade == outroItem.getQuantidade()  &&
        this.descricao == outroItem.getDescricao();
    }   
}