
public class ElfoVerde extends Elfo
{
    private final String espadaValiriana = "Espada de aço valiriano";
    private final String arcoValiriano = "Arco de Vidro";
    private final String flechaVidro = "Flecha de Vidro";

    
    public ElfoVerde(String nome){
        super(nome);
    }
    
    public void aumentarXp(){
        this.experiencia += 2;
    }
    
    public boolean itensPermitidos(String item){
        if(item.equalsIgnoreCase(espadaValiriana) ||
           item.equalsIgnoreCase(arcoValiriano)   ||
           item.equalsIgnoreCase(flechaVidro)){
               return true;
        }
        return false;
    }
    
    public void ganharItem(Item item){
        if(itensPermitidos(item.getDescricao())){
            this.getInventario().add(item);
        }
    }
    
    
    public void perderItem(Item item){
        if(itensPermitidos(item.getDescricao())){
            this.inventario.getItens().remove(item);
        }
    }
    
    
    
}
