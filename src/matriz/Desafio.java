package matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas Notas?");
        int qtdNotas = input.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informa e nota " + (i+1));
            notas[i] = input.nextDouble();
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A media e " + media + "!");

        input.close();
    }


}
