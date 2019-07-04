import java.util.*;
public class Exercito
{
    private HashMap<String, Elfo> exercitoElfos;

    public Exercito(){
        exercitoElfos = new HashMap<>();
    }
    
    public HashMap<String,Elfo> getExercito(){
        return this.exercitoElfos;
    }

    public void alistar(String nome, Elfo elfo){
        if(elfo instanceof ElfoVerde){
            this.exercitoElfos.put(nome, elfo);
        } 
        if(elfo instanceof ElfoNoturno){
            this.exercitoElfos.put(nome, elfo);
        }
    }

    public HashMap<String,Elfo> buscarPorStatus(Status status){
        HashMap<String,Elfo> aux = new HashMap<>();
        for (Elfo elfo : exercitoElfos.values()) {
            if(elfo.getStatus().equals(status)){
                aux.put(elfo.getNome(), elfo);
            }
        }
        return aux;
    }
}
