package ClassesEObjetos;

public class ProdutoTest {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Caneta Azul";
        produto1.preco = 11.0;
        Produto.desconto = 0.25;

        System.out.printf( produto1.nome + " " +produto1.precoComDesconto());



    }

}

// se uma classe esta no mesmo pacote, nao precisa importar nada
