package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");

        // Podemos adicionar uma lista dessas duas formas, tanto criando
        // um obj, qnt jogando ele direto usando o contrutuor

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        for (Usuario u: lista
             ) {
            System.out.println(u);
        }

        System.out.println(lista.get(3).nome);

        lista.remove(2);

    }
}
