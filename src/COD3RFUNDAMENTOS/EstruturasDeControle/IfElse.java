package COD3RFUNDAMENTOS.EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe um número: ");
        // Mudando de string para inteiro(numero);
        int numero = Integer.parseInt(valor);

        if (numero%2 == 0) {
            System.out.println("Número é par!");
        }
        if (numero%2 ==1) {
            System.out.println("Numero Impar!");
        }

        // Simplificando o código com if e else:

        if (numero%2 == 0) {
            System.out.println("Número é par!");
        } else {
            System.out.println("Número Impar!");
        }

    }
}
