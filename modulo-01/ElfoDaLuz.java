
public class ElfoDaLuz extends Elfo
{

    private int qtdAtaques;
    
    {
        this.qtdExperienciaPorAtaque = 1;
        this.qtdAtaques = 1;
        this.qtdDano = 21.0;
    }

    public ElfoDaLuz(String nome){
        super(nome);
        this.getInventario().add(new Item(1, "Espada de Galvorn"));
    }
    
    public void ganharVida(){
        this.vida += 10.0; 
    }

    public void atacarComEspada(Dwarf dwarf){
        if(this.qtdAtaques % 2 == 0){
            this.ganharVida();
        } else{
            this.diminuirVida();
        }
        this.aumentarXp();
        dwarf.diminuirVida();
        this.qtdAtaques++;
    }
}
