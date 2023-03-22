package COD3RFUNDAMENTOS.EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma nota (1-10): ");
        double nota = teclado.nextDouble();

        switch ((int) nota){

            case 1:
                System.out.println("Horrivel");
                break;
            case 2:
                System.out.println("Péssimo");
                break;
            case 3:
                System.out.println("Tem que melhorar muito!");
                break;
            case 4:
                System.out.println("Ainda naõ está bom");
                break;
            case 5:
                System.out.println("Melhore!");
                break;
            case 6:
                System.out.println("Ta indo");
                break;
            case 7:
                System.out.println("Na media....");
                break;
            case 8:
                System.out.println("ótimo trabalho");
                break;
            case 9:
                System.out.println("Esplêndido!");
                break;
            case 10:
                System.out.println("PIKA DAS GALAXIAS");
                break;

            default:
                System.out.println("Nota INVÁLIDA! Digite notas entre 1 - 10.");

        }
    }
}
