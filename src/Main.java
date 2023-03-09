import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.minus.apply(b,a);
        calc.println.accept(calc.abs.apply(c));
    }
}


