package COD3RFUNDAMENTOS.operadores;

public class Ternario {
    public static void main(String[] args) {

        // ? significa se    : significa senao
        // ternario 1) =>   2) ?   3) :

        double media = 7.6;
        String resultado = media >= 7.0 ? "aprovado" : "Em recuperação";
        System.out.println("O aluno está " + resultado);

    }
}
