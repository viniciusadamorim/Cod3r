package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PIlha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        // VAI IMPRIMIR O ULTIMO QUE ENTROU
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll()); //remove o hobbit
        System.out.println(livros.poll()); //remove o don
        System.out.println(livros.poll()); // remove o pequeno
        System.out.println(livros.poll()); // retorna null
        System.out.println(livros.pop()); // joga uma exceçcao caso nao tenha elemento

//        livros.size();
//        livros.clear();
//        livros.contains();

    }
}
