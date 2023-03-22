package ClassesEObjetos.Desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Vinicius", 70.0);

        Comida c1 = new Comida("Feijão", 0.250);
        Comida c2 = new Comida("Arroz", 0.325);


        System.out.println(p1.apresentacao());
        p1.comer(c1);

        System.out.println(p1.apresentacao());
        p1.comer(c1);

    }
}
