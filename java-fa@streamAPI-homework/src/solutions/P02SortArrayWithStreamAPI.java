// Problem 2 Sort Array with Stream API
//----------------------------------------------------------------------------------------------------------------------
// Takes sequence of numbers in a single line, stores them in array and sorts them with Stream API
//----------------------------------------------------------------------------------------------------------------------
package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class P02SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        String command = input.nextLine();

        if (command.equalsIgnoreCase("ascending")) {    // Ascending or descending order.
            Arrays.stream(sequence.split(" "))
                    .mapToInt(Integer::parseInt)     // Parsing to int.
                    .boxed()    // Returning stream of integers
                    .sorted(Integer::compareTo)     // Sorting
                    .forEach(a -> System.out.print(a + " "));    // Printing
        } else {
            Arrays.stream(sequence.split(" "))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .sorted((a, b) -> b.compareTo(a))
                    .forEach(a -> System.out.print(a + " "));
        }
    }
}