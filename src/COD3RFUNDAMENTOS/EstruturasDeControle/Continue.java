package COD3RFUNDAMENTOS.EstruturasDeControle;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
// i =5 então continue ou seja, é como se fosse uma falsa. Enquanto o BRAKE interrompe, o continue ele ignora apenas
// aquele laço e cotinua normalmente o resto.
        }
    }
}
