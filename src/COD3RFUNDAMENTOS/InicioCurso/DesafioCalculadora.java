package COD3RFUNDAMENTOS.InicioCurso;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Solicitar a operação que ele quer realizar + - * % /
        // Realiza a operação

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo! Digite dois numeros para realizamosr a operação");

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número: " );
        double num2 = input.nextDouble();

        System.out.println("Informe a operação desejada: ");
        String op = input.next();

        double resultado = "+".equals(op) ? num1 + num2 :0;
        resultado = "-".equals(op) ? num1 - num2 :resultado;
        resultado = "*".equals(op) ? num1 * num2 :resultado;
        resultado = "/".equals(op) ? num1 / num2 :resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        input.close();
    }
}
