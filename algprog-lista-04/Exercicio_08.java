//scanner
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);
        
        //variaves
        double[] numeros = new double[5];
        double soma = 0;

        //entrada
        System.out.println("Digite 5 números para calcular a soma e a média:");

        //looping
        for(int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + " número: ");
            numeros[i] = teclado.nextDouble();
            
            //+1 soma 
            soma += numeros[i];
        }

        //calculo
        double media = soma / numeros.length;

        //saida
        System.out.println("A soma total é: " + soma);
        System.out.println("A média dos números é: " + media);

        teclado.close();
    }
}