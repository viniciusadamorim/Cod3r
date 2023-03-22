package COD3RFUNDAMENTOS.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {


        System.out.println("2" == "2"); // True porque o conteúdo é o mesmo.
        //
        String s = new String ("2");
        System.out.println("2" == s);
        System.out.println("-------------");
        // Nesse outro exemplo vai dar falso embora o conteudo delas sejam verdadeiros
        System.out.println("2".equals(s));
        //.equals(s.trim())) // o TRIM ignora os espaços
        // Agora vai dar TRUE pq equals vai comparar o conteúdo dessa variavel que é igual "2"

        Scanner entrada = new Scanner(System.in);


        String s2 = entrada.next();
        System.out.println("2" == s2);


        entrada.close();

    }
}
