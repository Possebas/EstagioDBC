import java.util.*;
public class ComparadorDePerformance
{
    public void comparar(){
        ArrayList<Elfo> arrayElfos = new ArrayList<>();
        HashMap<String, Elfo> hashMapElfos = new HashMap<>();
        int qtdElfos = 1000000;
        for(int i = 0; i <qtdElfos; i++){
            String nome = "Elfo "+i;
            Elfo elfo = new Elfo(nome);
            arrayElfos.add(elfo);
            hashMapElfos.put("Qualquer", elfo);
        }
        
        String nomeBusca = "Elfo 900000";
        
        long mSeqInicio = System.currentTimeMillis();
        Elfo elfoSequencial = buscaSequencial(arrayElfos, nomeBusca);
        long mSeqFim = System.currentTimeMillis();
        
        long mMapInicio = System.currentTimeMillis();
        Elfo elfoMap = buscaMap(hashMapElfos, nomeBusca);
        long mMapFim = System.currentTimeMillis();
        
        String tempoSeq = String.format("%.10f", (mSeqFim - mSeqInicio) / 1000.0);
        String tempoHash = String.format("%.10f", (mMapFim - mMapInicio) / 1000.0);
        System.out.println("ArrayList: "+tempoSeq+" HashMap:"+tempoHash);
    }
    
    private Elfo buscaSequencial(ArrayList<Elfo> lista,String nome){
        for(Elfo elfo: lista){
            if(elfo.getNome().equals(nome)){
                return elfo;
            }
        }
        return null;
    }
    
    private Elfo buscaMap(HashMap<String, Elfo> lista,String nome){
        return lista.get(nome);
    }
    
    
}
