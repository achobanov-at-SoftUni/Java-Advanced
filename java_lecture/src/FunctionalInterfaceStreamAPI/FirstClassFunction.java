package FunctionalInterfaceStreamAPI;

import java.util.Arrays;
import java.util.function.Function;

public class FirstClassFunction {

    public static void main(String[] args) {

        firstClassFunction();
    }

    private static void firstClassFunction() {

        int a = 2;
        int b = 3;
        Function<Integer, Boolean> x = arg -> arg % 2 == 0;

        System.out.println(x.apply(6));
        System.out.println(x.apply(12));
        System.out.println(x.apply(13));
    }
}
