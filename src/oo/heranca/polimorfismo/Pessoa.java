package oo.heranca.polimorfismo;

import org.jetbrains.annotations.NotNull;

public class Pessoa {
    private double peso;

    public Pessoa  (double peso){
        setPeso(peso);
    }

    public void comer (Comida comida){
        this.peso += comida.getPeso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("PESO INVÁLIDO");
        }
    }
}
