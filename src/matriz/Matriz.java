package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos Alunos?");
        int qtdAlunos = input.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNotas = input.nextInt();

        double [] [] notasDaTurma = new double[qtdAlunos][qtdNotas];
        double total =0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int j = 0; j < notasDaTurma[a].length; j++) {

                System.out.printf("Informe a nota %d do aluno %d: ", j +1 , a+1);
                notasDaTurma [a][j] = input.nextDouble();
                total += notasDaTurma[a][j];
            }
        }
        double media = total / (qtdAlunos + qtdNotas);
        System.out.println("Media da turma e " + media);
        input.close();
    }
}
