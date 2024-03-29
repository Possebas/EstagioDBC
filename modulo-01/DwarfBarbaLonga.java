public class DwarfBarbaLonga extends Dwarf
{
    private Sorteador sorteador;

    public DwarfBarbaLonga(String nome){
        super(nome);
        sorteador = new DadoD6();
    }

    public DwarfBarbaLonga(String nome,Sorteador sorteador){
        this(nome);
        this.sorteador = sorteador;
    }
    
    @Override
    public void diminuirVida(){
        boolean devePerderVida = sorteador.sortear() <= 4; 
        if(devePerderVida){
            super.diminuirVida();
        }
    }
}