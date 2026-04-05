//scanner
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //variaveis
        int[] numeros = new int[5];

        //entrada - looping
        System.out.print("Escreva 5 números para saber qual o maior: ");
        for(int i = 0; i < 5; i++){
            numeros[i] = teclado.nextInt();
        }

        int maior = numeros[0];
        for(int i = 1; i < 5; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        //saida
        System.out.println("O maior númeo é: " + maior);

        //fechar teclado
        teclado.close();
    }
}
