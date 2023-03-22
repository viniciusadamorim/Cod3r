package lambdasEmJava;

public class CalculoTeste1{
    public static void main(String[] args){

        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2,3));
/*Aqui, calculo pode agora utilizar o método executar da classe Calculo
e com isso o java entende que no método ele vai receber dois parametros*/



        Calculo multiplicacao = new Multiplicar();
    }
}