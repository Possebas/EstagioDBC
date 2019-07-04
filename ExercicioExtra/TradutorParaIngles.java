public class TradutorParaIngles implements Tradutor
{
    public String traduzir(String textoEmPortugues){
        switch(textoEmPortugues){
            case "Sim": 
                return "Yes";
            case "Obrigado":
                return "Thank you";
            default:
                return null;
        }
    }
}