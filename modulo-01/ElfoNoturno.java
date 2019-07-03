
public class ElfoNoturno extends Elfo
{
    
    public ElfoNoturno(String nome){
        super(nome);
        this.qtdExperienciaPorAtaque = 3;
        this.qtdDano = 15.0;
    }
    
    @Override 
    public void atirarFlecha(Dwarf dwarf){
        Item flecha = this.inventario.getItens().get(0);
        int qtdAtual = flecha.getQuantidade();
        if(qtdAtual > 0){
            flecha.setQuantidade(qtdAtual - 1);
            this.aumentarXp();
            dwarf.diminuirVida();
            this.diminuirVida();
        } 
    }
    
}

