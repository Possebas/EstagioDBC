public class TradutorParaEspanhol implements Tradutor
{
    public String traduzir(String textoEmPortugues){
        if(textoEmPortugues.equals("Sim")){
            return "Sí";
        }
        return null;
    }
}