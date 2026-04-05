//scanner
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = teclado.nextInt();

        //maior - menor
        int comeco = Math.min(n1, n2);
        int fim = Math.max(n1, n2);

        //looping
        for(int i = comeco + 1; i < fim; i++) {
            System.out.println(i);
        }
        //fechar teclado
        teclado.close();
    }
}