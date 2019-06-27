public class Dwarf
{
    private String nome;
    private double vida;
    
    public Dwarf(String nome){
        this.nome = nome;
        this.vida = 110.0;
    }
    
    public double getVida(){
        return this.vida;
    }
    
    public boolean podePerderVida(){
        return this.vida > 0.0;
    }
    
    public void diminuirVida(){
        if(podePerderVida()){
            this.vida = this.vida >=10.0 ? this.vida - 10.0 : 0.0;
        }
    }
}
