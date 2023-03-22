package COD3RFUNDAMENTOS.InicioCurso;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        // 3 string usando nextline recebendo os ultimos 3 salários e calculando a média

        System.out.println("Desafio Java");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeiro salário: ");
        String salario1 = teclado.nextLine().replace(",", ".");
        System.out.println("Segundo salário: ");
        String salario2 = teclado.nextLine().replace(",", ".");
        System.out.println("Terceiro salário: ");
        String salario3 = teclado.nextLine().replace(",", ".");

        double s1= Double.parseDouble(salario1);
        double s2= Double.parseDouble(salario2);
        double s3= Double.parseDouble(salario3);
        double mediaSalario = (s1+s2+s3) / 3;

        System.out.println("---------------------------");
        System.out.println("Primeiro Salário: " + s1);
        System.out.println("Segundo Salário: " + s2);
        System.out.println("Terceiro Salário: " + s3);
        System.out.println("Média do salário é: " + mediaSalario);

        teclado.close();
    }
}
