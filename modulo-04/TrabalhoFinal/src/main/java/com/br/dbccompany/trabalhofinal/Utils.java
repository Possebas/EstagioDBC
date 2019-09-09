package com.br.dbccompany.trabalhofinal;

import java.text.NumberFormat;
import java.util.Locale;

import com.br.dbccompany.trabalhofinal.Entity.Contato;

public class Utils {

    public static String parseToString(double valor){
        NumberFormat transformado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return transformado.format(valor);
    }

    public static double parseToDouble(String reais){

        String retirarSimbolo = reais.replaceFirst("(R\\$)\\s*", "");

        String retirarPontucoes = retirarSimbolo.replaceAll("\\.", "");

        String valorSomenteNum = retirarPontucoes.replaceAll(",", ".");

        Double valorFinal = 0.0;
        try{
            valorFinal = Double.parseDouble(valorSomenteNum);
        } catch (NumberFormatException e){
            System.err.println("ParseToDouble ERROR!");
        }
        return valorFinal;
    }

    public static boolean requiredContact(Contato contato){
        switch (contato.getTipoContato().getNome().toUpperCase()){
            case "EMAIL": return emailValid(contato.getValor());
            case "TELEFONE": return phoneValid(contato.getValor());
            default: return true;
        }
    }

    public static boolean phoneValid( String telefone){
        return telefone.matches("((\\d){8,12}|(\\+(\\d{13})))");
    }

    public static boolean emailValid(String email){
        return email.matches("(\\w)+((\\.|(_)|(-))(\\w)+)*(@)(\\w)+((\\.)(\\w)+)+");
    }

    public static boolean cpfValid(String cpf){
        return cpf.matches("(\\d){11}");
    }
    
}