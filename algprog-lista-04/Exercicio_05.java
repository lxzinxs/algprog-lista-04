//scanner
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        while(true){
            //variaveis
            int anos = 0;
            
            //populacao A
            System.out.print("Digite a população da cidade A: ");
            double populacaoA = teclado.nextDouble();

            if(populacaoA <= 0) {
                System.out.print("Escreva um número válido!");
                break;
            }

            //crescimento A
            System.out.print("Digite a taxa de crescimento da cidade A (%): ");
            double taxaA = teclado.nextDouble();

            if(taxaA <= 0){
                System.out.println("Escreva um número válido!");
                break;
            }

            //populacao B
            System.out.print("Digite a população da cidade B: ");
            double populacaoB = teclado.nextDouble();

            if(populacaoB <= 0) {
                System.out.print("Escreva um número válido!");
                break;
            }

            //crescimento B
            System.out.print("Digite a taxa de crescimento da cidade B (%): ");
            double taxaB = teclado.nextDouble();

            if(taxaB <= 0){
                System.out.println("Escreva um número válido!");
                break;
            }

            //calculo
            double fatorA = 1 + (taxaA / 100);
            double fatorB = 1 + (taxaB / 100);

            if (taxaA <= taxaB && populacaoA < populacaoB) {
                System.out.println("A população da cidade A nunca chegará n B");
            } else {
                while (populacaoA < populacaoB) {
                    populacaoA *= fatorA;
                    populacaoB *= fatorB;
                    anos++;
                }
                System.out.println("\nResultado:");
                System.out.println("Levará " + anos + " anos.");
                System.out.println("População A: " + (int)populacaoA);
                System.out.println("População B: " + (int)populacaoB);
            }
        }
        System.out.println("Programa encerrado.");
        teclado.close();
    }
}