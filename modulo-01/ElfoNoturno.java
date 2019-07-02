
public class ElfoNoturno extends Elfo
{
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public void aumentarXp(){
        this.experiencia += 3;
    }
    
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
    
    public void diminuirVida(){
        if(podePerderVida()){
           this.vida = (this.vida >=15.0) ? this.vida - 15.0 : 0.0;
        }
        if(this.vida == 0){
             this.status = Status.MORTO;
           } else {
             this.status = Status.SOFREU_DANO;
        }
    }
}

