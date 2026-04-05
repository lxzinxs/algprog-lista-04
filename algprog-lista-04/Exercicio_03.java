//scanner
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        //teclado
        Scanner teclado = new Scanner(System.in);

        //looping
        while (true) {
            //nome
            System.out.print("Escreva seu nome: ");
            String nome = teclado.next().trim();

            //idade
            System.out.print("Digite sua idade: ");
            int idade = teclado.nextInt();

            //salario
            System.out.print("Digite seu salário: ");
            double salario = teclado.nextDouble();

            //sexo
            System.out.print("Escreva seu sexo 'masculino' ou 'feminino': ");
            String sexo = teclado.next().toLowerCase().trim();

            //estado civil
            System.out.print("Escreva seu estado civil: solteiro('s'), casado('c'), viuvo('v'), divorciado('d'): ");
            char estadoCivil = teclado.next().toLowerCase().charAt(0);

            if(nome.length() < 3){
                System.out.println("Escreva um nome maior que 3 caracteres");
            } else if(idade < 0 || idade > 150){
                System.out.println("Escreva uma idade válida!");
            } else if(salario <= 0){
                System.err.println("Escreva um salário válido!");
            } else if(!sexo.equals("masculino") && !sexo.equals("feminino")){
                System.out.println("Escreva um sexo válido!");
            } else if(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
                System.out.println("Escreva uma letra correta");
            } else {
                System.out.println("Suas informacoes:\nnome " + nome + "\nidade: " + idade + "\nsalario: " + salario + "\nsexo: " + sexo + "\nestado civil: " + estadoCivil);
                break;
            }
        }
        //fechar teclado
        teclado.close();
    }
}