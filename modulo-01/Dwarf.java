public class Dwarf
{
    private String nome;
    private double vida;
    private Status status;
    
    {
        status = Status.RECEM_CRIADO;
        vida = 110.0;
    }
    public Dwarf(String nome){
        this.nome = nome;
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    public boolean estaMorto(){
        return this.status == Status.MORTO;
    } 
    
    public double getVida(){
        return this.vida;
    }
    
    public boolean podePerderVida(){
        return this.vida > 0.0;
    }
    
    public void diminuirVida(){
        if(podePerderVida() && !(this.estaMorto())){
            this.vida = this.vida >=10.0 ? this.vida - 10.0 : 0.0;
            if(this.vida == 0){
                this.status = Status.MORTO;
            }
        }
    }
}
