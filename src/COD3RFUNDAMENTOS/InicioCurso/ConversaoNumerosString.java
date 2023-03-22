package COD3RFUNDAMENTOS.InicioCurso;

public class ConversaoNumerosString {
    public static void main(String[] args) {

        Integer num1 = 10000;
        System.out.println(num1.toString());

        // Outra forma de passar com primitivos

        int num2 = 10000;
        System.out.println(Integer.toString(num2));

        //mesmo declarando INT voce pode chamar o integer.toString sem problemas.
    }
}

// Algumas funcionalidades estão presentes somente em algumas
// notações, exemplo da .toString que tem o .lenght