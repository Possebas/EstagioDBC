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
    public void diminuirVida(){
        if(this.vida >= 10){
            this.vida = this.vida - 10.0;
        }
    }
}
