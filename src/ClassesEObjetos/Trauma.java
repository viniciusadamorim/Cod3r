package ClassesEObjetos;

import org.w3c.dom.ls.LSOutput;

public class Trauma {

    int a = 3; // Não pode mexer aqui

    public static void main(String[] args) {

        Trauma p = new Trauma ();
        System.out.println(p.a);

    }
}

/*
mesmo estando na mesma classe, você só cnosegue acessar o metodo estatico criando uma instancia
 */
