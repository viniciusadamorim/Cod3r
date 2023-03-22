package arrays;

public class ForEach {
    public static void main(String[] args) {
        double[] notas ={9.9,8.7,7.2,7.4};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        
        // percorrando um array um por um com foreach
        for (double nota: notas) {
            System.out.print("\nNota "+nota);
        }

        // o array notas a cada repetição vai colocando um balor
        // na variável nota a cada laço
    }
}
