public class TradutorParaBosnio implements Tradutor
{
    public String traduzir(String textoEmPortugues){
        if(textoEmPortugues.equals("Sim")){
            return "Da";
        }
        return null;
    }
}