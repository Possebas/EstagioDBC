public class Filmes
{
    
    public void indicar(){
        String[] filmesFavoritos = new String[18];
        filmesFavoritos[0] = "Velozes e Furiosos";
        filmesFavoritos[1] = "Vingadores";
        filmesFavoritos[2] = "Interestelar";
        filmesFavoritos[3] = "Creed";
        filmesFavoritos[4] = "Madrugada dos Mortos";
        filmesFavoritos[5] = "12 anos de escravidão";
        filmesFavoritos[6] = "Jogo da imitação";
        filmesFavoritos[7] = "Scott Pilgrim";
        filmesFavoritos[8] = "Matrix";
        filmesFavoritos[9] = "Her";
        filmesFavoritos[10] = "V de vingança";
        filmesFavoritos[11] = "Ted";
        filmesFavoritos[12] = "Forest Gump";
        filmesFavoritos[13] = "O contador";
        filmesFavoritos[14] = "Baby driver";
        filmesFavoritos[15] = "Projeto X";
        filmesFavoritos[16] = "Lobo de Wall Street";
        filmesFavoritos[17] = "Golpe Duplo";
        
        System.out.println("\f");
        
        for(int i = 0; i < filmesFavoritos.length; i++){
            System.out.println(filmesFavoritos[i]);
        }
        
        
    }
}
