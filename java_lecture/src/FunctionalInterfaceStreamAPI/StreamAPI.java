package FunctionalInterfaceStreamAPI;

import java.util.Arrays;

public class StreamAPI {

    public static void main(String[] args) {

        int[] nums = {6, 3, 1, 6, 7, 1, 12, 133, 14, 12};

        boolean match = Arrays.stream(nums)
                .distinct()
                .filter(a -> a % 2 == 0)
                .map(a -> a * 2)
                .boxed()
                .sorted((a1, a2) -> a2.compareTo(a1))
                .anyMatch(a -> a > 3);

        System.out.println(match);
    }
}
