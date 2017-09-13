package FunctionalInterfaceStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(elements)
                .filter(Practice::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int sumAnotherWay = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        int sumReduce = numbers.stream().reduce((x, y) -> x + y).get();

        System.out.printf("%d\n%d\n%d", sum, sumAnotherWay, sumReduce);
    }

    static boolean isNumber(String input) {
        for (char var : input.toCharArray()) {
            if (!Character.isDigit(var)) {
                return false;
            }
        }
        return true;
    }
}
