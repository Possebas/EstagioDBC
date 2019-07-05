import java.util.*;
public class Exercito
{
    private final ArrayList<Class> TIPOS_PERMITIDOS = new ArrayList<>(
            Arrays.asList(
                ElfoVerde.class,
                ElfoNoturno.class)
        );

    private ArrayList<Elfo> elfos = new ArrayList<>();
    private Map<Status,ArrayList<Elfo>> porStatus = new HashMap<>();
    private Map<Elfo,ArrayList<Elfo>> porTipo = new HashMap<>();

    public void alistar(Elfo elfo){
        boolean podeAlistar = TIPOS_PERMITIDOS.contains(elfo.getClass());
        if(podeAlistar){
            elfos.add(elfo);
            ArrayList<Elfo> elfoDoStatus = porStatus.get(elfo.getStatus());
            ArrayList<Elfo> elfoDoTipo = porTipo.get(elfo.getClass());
            if(elfoDoStatus == null || elfoDoTipo == null){
                elfoDoStatus = new ArrayList<>();
                elfoDoTipo = new ArrayList<>();
                porStatus.put(elfo.getStatus(),elfoDoStatus);
                porTipo.put(elfo, elfoDoTipo);
            }
            elfoDoStatus.add(elfo);
            elfoDoTipo.add(elfo);
        }
    }

    public ArrayList<Elfo> getElfos(){
        return this.elfos;
    }  
    
    public Map<Elfo,ArrayList<Elfo>> getElfosPorTipo(){
        return this.porTipo;
    } 
    
    public Map<Status,ArrayList<Elfo>> getElfosPorStatus(){
        return this.porStatus;
    }

    public ArrayList<Elfo> buscarPorStatus(Status status){
        return this.porStatus.get(status);
    }

    public ArrayList<Elfo> buscarPorElfo(Elfo elfo){
        return this.porTipo.get(elfo);
    }
}
