package COD3RFUNDAMENTOS.EstruturasDeControle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double nota = teclado.nextDouble();

        if (nota >= 7){
            System.out.println("APROVADO");
        } else {
            System.out.println("Reprovado");
        }
        teclado.close();
    }
}

// Se as expressões do if ficaem muito grandes, quebrem em variáveis.
