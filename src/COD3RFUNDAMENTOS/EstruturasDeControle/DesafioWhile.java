
package COD3RFUNDAMENTOS.EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        //CALCULAR MEDIA DA TURMA
        // Usuario digita nota válida >=0 <=10 e armazena variavel chamada total
        // sempre que digitar uma nota soma o total
        // Sinal para parar "-1"

        Scanner teclado = new Scanner(System.in);

    int quantidadeDeNotas = 0;
    double nota =0;
    double total = 0;

        while (nota != -1){
            System.out.println("Digite a nota: ");
            nota = teclado.nextDouble();

            if (nota <= 10 && nota >= 0){
                total += nota;
                quantidadeDeNotas++;
            } else {
                System.out.println("");
            }
        }
        //calculo media
        double media = total/quantidadeDeNotas;
        System.out.println("A média das notas é: " + media);

        teclado.close();
    }
}

// Já o += é um operador de atribuição.

//* '+=' : mg1 += mg2  */Operações equivalentes /*  mg1 = mg1 + mg2
//outrois exemplos...
//* '-='
//* '*='
//* '/='
//* '%=
