package oo.heranca.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(70.00);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.180);
        Sorvete ingrediente3 = new Sorvete(0.350);

        System.out.println("O peso do convidado antes do jantar é: " + convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        System.out.println("O peso do convidado Após o jantar é " + convidado.getPeso());
    }
}
