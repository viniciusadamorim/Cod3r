package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas notas você quer informar :");

        int qtdeNotas = input.nextInt();
        double[] notas = new double [qtdeNotas];

        for (int i = 0; i < notas.length ; i++) {
            System.out.print("Informe a nota " + (i+1) + ": ");
            notas[i]= input.nextInt();
        }

        double total = 0;

        for (double nota : notas) {
            total += nota;
        }
        System.out.println("A média é " + (total/notas.length));

        System.out.println(Arrays.toString(notas));

        input.close();

    }
}
