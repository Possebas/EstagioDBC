public class Elfo{
    private String nome;
    private Inventario inventario = new Inventario (2);
    private int experiencia;
    
    public Elfo(String nome){
        this.nome = nome;
        this.experiencia = 0;
        this.inventario.adicionar(new Item(4, "Flecha"));
        this.inventario.adicionar(new Item(1, "Arco"));
    }
    
    public String getNome(){
        return this.nome;
    }
   
    public Inventario getInventario(){
        return this.inventario;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public int getExperiencia(){
        return this.experiencia;
    }
    
    public void aumentarXp(){
        this.experiencia++;
    }
    
    public void atirarFlecha(Dwarf dwarf){
        Item flecha = this.inventario.obter(0);
        int qtdAtual = this.inventario.buscaQuantidadePorNomeItem("Flecha");
        if(qtdAtual > 0){
            flecha.setQuantidade(qtdAtual - 1);
            this.aumentarXp();
            dwarf.diminuirVida();
        } 
    }
}