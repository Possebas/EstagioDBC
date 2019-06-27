import java.lang.Math;
import java.util.Scanner;
/**
 * Escreva a descrição da classe Calculadora aqui.
 * Realizar métodos como: soma, multiplicação, divisão e 
 * @author (Gustavo Possebon) 
 * @version (25/06)
 */
public class Calculadora
{
    /**
     * 
     * @param  x e y   valores inteiros positivos
     * @return     a soma de x com y 
     */
    public static int soma(int x, int y)
    {
        return x + y;
    }
    
    /**
     * 
     * @param  x e y   valores inteiros positivos
     * @return     a multiplicacao de x com y 
     */
    public static int multiplicacao(int x, int y)
    {
        return x * y;
    }
    
    /**
     * 
     * @param  x e y   valores inteiros positivos
     * @return     a divisao de x com y 
     */
    public static int divisao(int x, int y)
    {
        return x % y;
    }
    
    /**
     * 
     * @param  x e y   valores inteiros positivos
     * @return     a subtracao de x com y 
     */
    public static int subtracao(int x, int y)
    {
        return x + y;
    }
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    public static void main(String[] args){
        System.out.print("\f");
        int x = 0;
        int y = 0;
        int opcao = 0;
        int resultado = 0;
        Scanner input = new Scanner(System.in);
        
        while(opcao == 0){
            System.out.println("Bem vindo a calculadora simples");
            System.out.println("");
            System.out.println("Opções de operações");
            System.out.println("1) Somar");
            System.out.println("2) Subtração");
            System.out.println("3) Divisão");
            System.out.println("4) Multiplicação");
            System.out.println("");
            System.out.println("Digite a operação desejada");
            opcao = input.nextInt();
            System.out.println("Digite o primeiro número:");
            x = input.nextInt();
            System.out.println("Digite o segundo número");
            y = input.nextInt();
            switch(opcao){
                case 1:
                    resultado = soma(x,y);
                    break;
                case 2:
                    resultado = subtracao(x,y);
                    break;
                case 3:
                    resultado = divisao(x,y);
                    break;
                case 4:
                    resultado = multiplicacao(x,y);
                    break;
                default:
                    opcao = 0;
                    break;
            }
            
        }
        System.out.println("");
        System.out.println("Resultado da operação é: "+resultado);
    }
    
    
}
