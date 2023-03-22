package lambdasEmJava;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
    public static void main(String[] args) {
        BinaryOperator<Integer> calc = (x, y) -> {return x + y; };
        System.out.println(calc.apply(2,3));

        calc = (x,y) -> x * y;
        System.out.println(calc.apply(2,3));


    }
}
