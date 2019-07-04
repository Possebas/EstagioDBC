import java.util.*;
import java.lang.*;

public class AgendaContatos
{
    private HashMap<String,String> agenda;

    public AgendaContatos(){
        this.agenda = new LinkedHashMap<>();
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
        for (Map.Entry<String, String> par : agenda.entrySet())
        {
            if(par.getValue().equals(telefone)){
                return par.getKey();
            }
        }
        return null;
    }

    public String csv() {
        StringBuilder ordenadoCsv = new StringBuilder();
        String separador = System.lineSeparator();
        for (HashMap.Entry<String, String> par : agenda.entrySet())
        {
            String chave = par.getKey();
            String valor = par.getValue();
            String contato = String.format("%s,%s%s",chave,valor,separador);
            ordenadoCsv.append(contato);
        }
        return ordenadoCsv.toString();
    }
}
