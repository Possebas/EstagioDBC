import java.util.*;
public class EstrategiasDeExercito implements Estrategias
{

    public ArrayList<Elfo> getNoturnoPorUltimo(ArrayList<Elfo> atacantes){
        ArrayList<Elfo> aux1 = new ArrayList<>();
        ArrayList<Elfo> aux2 = new ArrayList<>();
        //Exercito exercito = new Exercito();
        for(Elfo elfo : atacantes){
            if(!(elfo.getStatus().equals(Status.MORTO))){
                if(elfo instanceof ElfoVerde){
                    aux1.add(elfo);
                }
                if(elfo instanceof ElfoNoturno){
                    aux2.add(elfo);
                }
                //exercito.alistar(elfo);
            }
        }

        aux1.addAll(aux2);

        return aux1;
    }

    public ArrayList<Elfo> getAtaqueIntercalado(ArrayList<Elfo> atacantes){
        ArrayList <Elfo> aux = getNoturnoPorUltimo(atacantes);
        ArrayList <Elfo> desk = new ArrayList<>();
        int tam = aux.size() /2;
        for(int i = 0; i < tam;i++){
            desk.add(aux.get(aux.size()-1));
            desk.add(aux.get(i));
        }
        return desk;
    }

}
