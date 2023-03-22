package ClassesEObjetos;

import jdk.dynalink.beans.StaticClass;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }


    double precoComDesconto(){      // isso é um método
                return preco * (1-desconto);
        }

}

// classe criada sem MAIN. vamos criar uma classe e chamar ela