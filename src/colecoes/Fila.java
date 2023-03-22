package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // pegando ume lemento da fila
        System.out.println(fila.peek()); // retorna null caso vazia
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
        // fila.clear();
        // fila.size();
        // fila.isEmpty();


        //Poll e remove -> obter o prox. elemeneto da fila e remove.

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}

/*
peek e elemenet obtem o proximo elemento da fila sem remover.

.add() lançará uma exceção caso a fila esteja cheia.

.offer() retorna falso CASO a fila esteja cheia.
 */

/*
Enqueue: recebe como parâmetro um objeto a ser inserido na lista, nesse caso, no final da fila.

Dequeue: este método não recebe parâmetros, mas retorna o primeiro objeto da fila, aquele que, pela ordem, é o próximo a ser removido.
Após a chamada desse método, o objeto retornado é também removido da fila.

Peek: semelhante ao Dequeue, retorna o primeiro objeto da lista, mas não o remove.
Pode ser usado quando se deseja apenas conhecer o valor do primeiro elemento.

TrimToSize: altera a capacidade da lista para a quantidade atual de elementos.
Com isso, memória é poupada, pois a classe Queue reserva memória para armazenar uma quantidade de elementos, se nem todos forem usados, parte da memória reservada fica sem uso.
Usando o TrimToSize essa memória é liberada.

Construtor: a classe Queue possui três sobrecargas do construtor original, que não recebe nenhum parâmetro.
A primeira delas recebe um valor inteiro que define capacidade inicial da lista. A segunda recebe uma coleção (ICollection) da qual os itens são copiados para a lista.
A terceira recebe um valor inteiro para a capacidade inicial e um fator de expansão do tipo float.
Esse fator de expansão é utilizado para aumentar a capacidade da fila quando for necessário.
Originalmente esse valor é pequeno para que não seja utilizada memória desnecessariamente
 */