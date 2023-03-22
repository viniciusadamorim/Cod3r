package oo.heranca.polimorfismo;

public class Comida {

    public double getPeso;
    private double peso;

    public Comida(double peso) {
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("PESO INVÁLIDO");
        }
    }

}
