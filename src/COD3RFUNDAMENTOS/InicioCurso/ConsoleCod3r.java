package COD3RFUNDAMENTOS.InicioCurso;

import java.util.Scanner;

// s = string    d = inteiro  e f = double
// \n = pula linha

public class ConsoleCod3r {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sem Sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("Digite sua Idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome = " + nome + " "+sobrenome);
        System.out.println("Sua idade é: " + idade);

        System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
        entrada.close();
    }
}