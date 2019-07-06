import java.util.*;
public class EstrategiaIntercalado implements EstrategiasDeAtaque
{
    public ArrayList<Elfo> getOrdemDeAtaque(ArrayList<Elfo> elfos){
        EstrategiaPriorizandoElfosVerdes separados = new EstrategiaPriorizandoElfosVerdes();
        ArrayList <Elfo> aux = separados.getOrdemDeAtaque(elfos);
        ArrayList <Elfo> desk = new ArrayList<>();
        int tam = aux.size() /2;
        for(int i = 0; i < tam;i++){
            desk.add(aux.get(aux.size()-1));
            desk.add(aux.get(i));
        }
        return desk;
    }
}