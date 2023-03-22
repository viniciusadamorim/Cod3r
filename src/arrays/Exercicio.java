package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA [2] = 6.7;
        notasAlunoA [3] = 9.3;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0 ; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println("média: "+ total/ notasAlunoA.length);

        // Outra forma de escrever um array
        double totalAlunoB = 0;
        double[] notasAlunosB = {6.9, 8.9, 5.5, 10};
        for (int i = 0; i < notasAlunosB.length ; i++) {
             totalAlunoB = notasAlunosB[i];
        }
        System.out.println(totalAlunoB/notasAlunosB.length);
    }
}
