package COD3RFUNDAMENTOS.EstruturasDeControle;

import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual faixa voce quer saber: ");
        String faixa = teclado.next();

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian godan");
            case "verde":
                System.out.println("Sei o heian Yodan");
            case "laranja":
                System.out.println("Só sei o Heian sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei PN!");
        }
    }
}
