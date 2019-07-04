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
    
    /*
    private final ArrayList<Class> TIPOS_PERMITIDOS = new ArrayList<>(
    Arrays.asList(
    ElfoVerde.class,
    ElfoNoturno.class)
    );
    private ArrayList<Elfo> elfos = new ArrayList<>();
    private HashMap<Status,ArrayList<Elfo>> porStatus = new HashMap<>();

    public void alistar(Elfo elfo){
        boolean podeAlistar = TIPOS_PERMITIDOS.contains(elfo.getClass());
        if(podeAlistar){
            elfos.add(elfo);
            ArrayList<Elfo> elfoDoStatus = porStatus.get(elfo.getStatus());
            if(elfoDoStatus == null){
                elfoDoStatus = new ArrayList<>();
                porStatus.put(elfo.getStatus(),elfoDoStatus);
            }
            elfoDoStatus.add(elfo);
        }
    }
    
    public ArrayList<Elfo> getElfos(){
        return this.elfos;
    }    
    
    public ArrayList<Elfo> buscar(Status status){
        return this.porStatus.get(status);
    }
    */
}
