package ClassesEObjetos;

import java.awt.geom.Area;

public class AreaCircTest {
    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(10);
        // a.pi = 6

        AreaCirc a2 = new AreaCirc(5);
        //a2.pi = 5;

        // AreaCirc.pi = 3.1415;            // Agora sim acessamos o PI direto da classe
        System.out.println(a.area());

        //AreaCirc.pi = 0.1; // Aqui conseguimos alterar o valor do PI normalmente.
        System.out.println(a2.area());

        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI); // java ja me da esse método
    }
}

//Quando temos algo static geralmente  criamos tambem uma constante. Ai usamos o
/*
static final double PI = 3.14 ou seja, pi agora sera constante tb(COLOCAR EM MAIUSCULO)
 */