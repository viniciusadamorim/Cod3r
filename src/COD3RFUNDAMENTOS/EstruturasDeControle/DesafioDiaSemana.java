package COD3RFUNDAMENTOS.EstruturasDeControle;

import java.util.Scanner;
import java.lang.String;
public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Desafio dia da semana!");
        System.out.println("Escolha um dia da semana: ");
        String dia = teclado.next();

        if (dia.equalsIgnoreCase("domingo")){
            System.out.println("Domingo (1)");
        } else if (dia.equalsIgnoreCase("segunda")){
            System.out.println("segunda (2)");
        } else if (dia.equalsIgnoreCase( "terça") || dia.equalsIgnoreCase("terca")){
            System.out.println("Terça (3)");
        } else if (dia.equalsIgnoreCase( "quarta")){
            System.out.println("Quarta (4)");
        } else if (dia.equalsIgnoreCase( "quinta")) {
            System.out.println("Quinta (5)");
        } else if (dia.equalsIgnoreCase( "sexta")){
            System.out.println("Sexta(6)");
        } else if (dia.equalsIgnoreCase( "sabado") || dia.equalsIgnoreCase("sábado")){
            System.out.println("Sabado (7)");
        } else {
            System.out.println("Dia Inválido");
        }

        System.out.println("fim!");
        teclado.close();

    }
}
