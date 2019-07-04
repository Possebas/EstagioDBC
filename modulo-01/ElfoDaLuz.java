import java.util.*;
public class ElfoDaLuz extends Elfo
{
    private final double QTD_VIDA_GANHA = 10.0;
    private final ArrayList<String> DESCRICOES_OBRIGATORIAS = new ArrayList<>(
        Arrays.asList(
            "Espada de Galvorn"
        )
    );
    
    {
        this.qtdExperienciaPorAtaque = 1;
        this.qtdAtaques = 0;
        this.qtdDano = 21.0;
    }

    public ElfoDaLuz(String nome){
        super(nome);
        super.ganharItem(new ItemSempreExistente(1, DESCRICOES_OBRIGATORIAS.get(0)));
    }
    
    
    private boolean devePerderVida(){
        return qtdAtaques % 2 == 1;
    }
    
    public void ganharVida(){
        this.vida += this.QTD_VIDA_GANHA; 
    }
    
    public Item getEspada(){
        return this.inventario.buscaItemPorDescricao(DESCRICOES_OBRIGATORIAS.get(0));
    }

    public void perderItem(Item item){
        boolean possoPerder = !(DESCRICOES_OBRIGATORIAS.contains(item.getDescricao()));
        if(possoPerder){
            super.perderItem(item);
        }
    }
    public void atacarComEspada(Dwarf dwarf){
        if(this.getEspada().getQuantidade() > 0){
            qtdAtaques++;
            dwarf.diminuirVida();
            this.aumentarXp();
            if(devePerderVida()){
                this.diminuirVida();
            }
            else {this.ganharVida();}
        }
    }
}
