package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
     //   Set<String> listaAprovados = new HashSet<>();
       SortedSet<String>listaAprovados = new TreeSet<>();
       listaAprovados.add("Ana");
       listaAprovados.add("Carlos");
       listaAprovados.add("Luca");
       listaAprovados.add("Pedro");

        for (String candidato: listaAprovados
             ) {
            System.out.println(candidato);
        }
    }
}

/*
<> isso aqui vai delimitar o tipo especifico do nosso set
que nesse caso seria o STRING

ele por padrao nao mantem a ordem, precisamos alterar para TreeSet

SortedSet e um tipo de set conjunto que permite armazenar em ordem especifica

 */