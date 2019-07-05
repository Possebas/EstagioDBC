import java.util.*;
public class EstrategiasDeExercito implements Estrategias
{
    public ArrayList<Elfo> getNoturnoPorUltimo(ArrayList<Elfo> atacantes){
        Exercito exercito = new Exercito();
        ArrayList<Elfo> aux = new ArrayList<>();
        for(Elfo elfo : atacantes){
            if(elfo.getStatus().equals(Status.RECEM_CRIADO) ||
                elfo.getStatus().equals(Status.SOFREU_DANO)){
                exercito.alistar(elfo);
            }
        } 

        return aux;
    }
    
    
    public ArrayList<Elfo> getAtaqueIntercalado(ArrayList<Elfo> atacantes){
        return atacantes;
    }
    
}
