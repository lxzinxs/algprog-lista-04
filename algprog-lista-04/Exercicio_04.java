public class Exercicio_04 {
    public static void main(String[] args){
        //variaveis
        double populacaoA = 80000;
        double populacaoB = 200000;
        int anos = 0;
        
        //looping
        while(populacaoA < populacaoB){
            populacaoA = populacaoA * 1.03;
            populacaoB = populacaoB * 1.015;
            anos ++;
        }
        System.out.println("População A: " + (int)populacaoA);
        System.out.println("População B: " + (int)populacaoB);
        System.out.println("Levará " + anos + " anos para a cidade A ultrapassar a cidade B.");
    }
}