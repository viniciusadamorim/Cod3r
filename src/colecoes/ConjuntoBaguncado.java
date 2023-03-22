package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawTypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');

        System.out.println("Tamanho " + conjunto.size()); // Saberemos o tamanho

        conjunto.add("Teste");
        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.size());

        //////////////////////////////////////////////////////////////////////////////////////////////////

        Set nums = new HashSet();
        nums.add(1);
        nums.add(3);
        nums.add(2);

        System.out.println(nums);
        System.out.println(conjunto);

        //Uniao entre os conjuntos (addAll)
        // nao mantem a ordem de inclusao
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // Intercessao vai fazer com que apareça apenas os objetos em comum entre os dois.
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}




/*
    Trabalharemos com hashset que e um dos tipos possiveis de ter conjntos dentro do java. Existem varias
    SET, mas vamos usar o hashset.

    Como ele nao aceita tipos primitivos, ao colocarmos ele automaticamente trasnforma
    em wrappers ( ex: int -> interger ; double -> Double)

    Se adicioar um igual, ele ignora e nao conta.

    USAMOS O .remove para remover um objeto da nossa lista

    .contanis usamos para saber se CONTEM tal valor no conjunto
 */