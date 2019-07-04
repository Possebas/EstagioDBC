import java.util.*;
import java.lang.*;

public class AgendaContatos
{
    private Map<String,String> agenda;

    public AgendaContatos(){
        this.agenda = new HashMap<>();
    }

    public void adicionar(String nome,String telefone){
        this.agenda.put(nome,telefone);
    }

    public String obterPorNome(String nome){
        return this.agenda.get(nome);
    }

    public int getQuantidade(){
        return this.agenda.size();
    }

    public String pesquisarContatoPorTelefone(String telefone) {
        Set<Map.Entry<String, String>> chaves = this.agenda.entrySet();
        for (Map.Entry<String, String> it : chaves)
        {
            if(it.getValue().equals(telefone)){
                return it.getKey();
           }
       }
       return null;
   }

    public String csv() {
       StringBuilder ordenadoCsv = new StringBuilder();
       TreeMap<String, String> desk = new TreeMap<>(this.agenda);
       Set<Map.Entry<String, String>> chaves = desk.entrySet();
       for (Map.Entry<String, String> objeto : chaves)
       {    
           ordenadoCsv.append(objeto.getKey());
           ordenadoCsv.append(":");
           ordenadoCsv.append(objeto.getValue());
           ordenadoCsv.append("\t");
       }
       return ordenadoCsv.toString();
   }
}
