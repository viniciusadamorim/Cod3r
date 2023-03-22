package COD3RFUNDAMENTOS.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a=1;
        int b = 2;

        a++; // a = a + 1 precedencia menor
        a--; // a = a - 1

        ++b; // b = b + 1 precedencia maior
        --b; // b = b - 1

        // ++ antes tem mais precedencia
        // -- depois tem uma precedencia menor
    }
}
