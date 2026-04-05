//scanner
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //looping
        while (true) {
            System.out.println("Escreva um valor entre 0 e 10: ");
            int numero = teclado.nextInt();
            
            //numeros entre 0 e 10
            if(numero >= 0 && numero <= 10){
                System.out.println("Seu valor é válido!");
                break;
            } else if(numero < 0 || numero > 10){
                System.out.println("Escreva um valor válido!");
            }
        }
        //fechar teclado
        teclado.close();
    }
}
