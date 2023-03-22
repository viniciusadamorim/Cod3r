package colecoes;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        // adicionando no map
        usuarios.put(1,"roberto");
        usuarios.put(2,"ricardo");
        usuarios.put(3,"rafaela");
        usuarios.put(4,"rebecca");
        System.out.println(usuarios.size()); // tamanho
        System.out.println(usuarios.isEmpty());// se tem algum vazio
        System.out.println(usuarios.keySet()); // mostra numeros de key
        System.out.println(usuarios.values()); //MOstra os valores dentro
        System.out.println(usuarios.entrySet()); //mostra os dois em ordem
        System.out.println(usuarios.containsKey(20)); //diz se existe key 20(T or F)
        System.out.println(usuarios.get(4)); //diz se existe key 20(T or F)

        for (int chave:usuarios.keySet()
             ) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()
             ) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

    }
}
