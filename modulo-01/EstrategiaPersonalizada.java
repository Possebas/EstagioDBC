import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
public class EstrategiaPersonalizada implements EstrategiasDeAtaque
{   
    public ArrayList<Elfo> getOrdemDeAtaque(ArrayList<Elfo> elfos){
        ArrayList<Elfo> possiveisElfos = elfos.stream().filter((elfo)->(elfo.getVida()>0) && (elfo.podeAtirarFlecha()))
            .collect(Collectors.toCollection(ArrayList::new));
        
        double porcentagem = 0.3;
        int quantidadeAptos = possiveisElfos.size();
        int maximoNightElf = (int)(quantidadeAptos * porcentagem);
        int count = 0;
        
        ArrayList<Elfo> atacantesPersonalizados = new ArrayList<>();
        
        for (int i =0; i < quantidadeAptos; i++){
            Elfo elfo = possiveisElfos.get(i);
            if(elfo instanceof ElfoVerde){
                atacantesPersonalizados.add(elfo);
            } else if(elfo instanceof ElfoNoturno){
                if(count < maximoNightElf) {
                    atacantesPersonalizados.add(elfo);
                    count++;
                }
            }
        }
        return atacantesPersonalizados;
    }

    public ArrayList<Elfo> getAtaquePersonalizado(ArrayList<Elfo> elfos){
        return getOrdemDeAtaque(elfos);
    }
}
