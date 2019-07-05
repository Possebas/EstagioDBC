import java.util.*;

public class EstrategiaPriorizandoElfosVerdes implements EstrategiasDeAtaque
{
    private ArrayList<Elfo> collections(ArrayList<Elfo> elfos){
            Collections.sort(elfos, new Comparator<Elfo>(){
                public int compare (Elfo elfoAtual, Elfo proximoElfo){
                    boolean mesmoTipo = elfoAtual.getClass() == proximoElfo.getClass();
                    if(mesmoTipo){
                        return 0;
                    }
                    return elfoAtual instanceof ElfoVerde && proximoElfo instanceof ElfoNoturno ? -1 : 1;
                }
            });
            return elfos;
    }

    public ArrayList<Elfo> getOrdemDeAtaque(ArrayList<Elfo> elfos){
        return collections(elfos);
    }
}
