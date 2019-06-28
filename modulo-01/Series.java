import java.util.*;

public class Series
{
    public void indicar(){
        ArrayList <String> lista = new ArrayList<>();
        
       
        lista.add("Velozes e Furiosos");
        lista.add("Vingadores");
        lista.add("Interestelar");
        lista.add("Creed");
        lista.add("Madrugada dos Mortos");
        lista.add("12 anos de escravidão");
        lista.add("Jogo da imitação");
        lista.add("Scott Pilgrim");
        lista.add("Matrix");
        lista.add("Her");
        lista.add ("V de vingança");
        lista.add ("Ted");
        lista.add ("Forest Gump");
        lista.add ("O contador");
        lista.add ("Baby driver");
        lista.add ("Projeto X");
        lista.add ("Lobo de Wall Street");
        lista.add ("Golpe Duplo");
        Collections.sort(lista);
        System.out.println("\f");
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        
    }
}
