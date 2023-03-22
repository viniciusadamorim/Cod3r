package lambdasEmJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args)  {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional");
        for (String nome: aprovados) {
            System.out.println(nome);
        }
        System.out.println();
        System.out.println("Versão Lambda #01");
        aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);
        // Percorre cada um dos elemetos e passa cada um deles como parametro para o sout.
        // que mostra no console do sistema.
        // method reference ::

        System.out.println("\nVersão Lambda #02");
        aprovados.forEach((nome) -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02");
        aprovados.forEach(ForEach::meuImprimir);


    }

    private static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é "+ nome);
    }
}
