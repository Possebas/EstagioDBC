public class Elfo{
    private String nome;
    private Item flecha = new Item(4, "Flecha");
    private Item arco = new Item(1, "Arco");
    private int experiencia = 0;
    
    public Elfo(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public int getExperiencia(){
        return this.experiencia;
    }
    
    public Item getFlecha(){
        return this.flecha;
    }
    
    public int getQtdFelcha(){
        return this.flecha.getQuantidade();
    }
    
    public void aumentarXp(){
        this.experiencia++;
    }
    
    public void atirarFlechar(){
        int qtdAtual = this.flecha.getQuantidade();
        if(qtdAtual > 0){
            flecha.setQuantidade(qtdAtual - 1);
        } 
        this.aumentarXp();
    }
}