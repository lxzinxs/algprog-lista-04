//scanner
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //looping
        while (true) {
            //nome usuario
            System.out.print("Escreva seu nome: ");
            String nome = teclado.next().toLowerCase();

            //senha
            System.out.print("Digite sua senha: ");
            String senha = teclado.next().toLowerCase();

            //nome diferente de senha
            if(nome.equals(senha)){
                System.out.println("Não pode usar senha e nome iguais, escreva uma senha ou nome válido!");
            } else {
                System.out.println("Acesso concedido!");
                break;
            }
        }
        //fechar teclado
        teclado.close();
    }
}
