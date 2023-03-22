package COD3RFUNDAMENTOS.InicioCurso;

public class ConversaoTposPrimitivos{
    public static void main(String[] args) {
// conversão implicita o java faz por tras dos panos
        double a = 1.123456788888;
        System.out.println(a);

        //conversão explicita(cast)
        float b =(float) 1.123456788888; //F no final evita escrever mais
        System.out.println(b);

        int c =340;
        byte d = (byte) c; //Cast
        System.out.println(d);

        // Ou seja, transformamos int em byte.

        // Algumas outras conversões:
        // https://www.devmedia.com.br/conversoes-em-java/2695
    }
}
