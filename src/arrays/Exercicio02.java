package arrays;

import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        double[] notasAlunoA = {7.9,8.0,6.7,9.3};
        for (double notaAlunoA :
                notasAlunoA) {
            System.out.print("Nota " +notaAlunoA);
        }
        // Outra forma de escrever um array
        double totalAlunoB = 0;
        double[] notasAlunosB = {6.9, 8.9, 5.5, 10};
        for (int i = 0; i < notasAlunosB.length ; i++) {
            totalAlunoB = notasAlunosB[i];
        }
        System.out.println(totalAlunoB/notasAlunosB.length);
    }
}
    /*Melhorando o código do exercicio anterior

     */

