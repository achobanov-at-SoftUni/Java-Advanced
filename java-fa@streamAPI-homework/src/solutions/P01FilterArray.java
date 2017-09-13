// Problem 1 Filter Array
//----------------------------------------------------------------------------------------------------------------------
// Takes text on single line as input. Filters a stream of data and writes it to a List for printing
//----------------------------------------------------------------------------------------------------------------------
package solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01FilterArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] textArr = input.nextLine().split(" ");
        List<String> filteredText = Arrays.stream(textArr)
                .filter(P01FilterArray::isLongerThenThree)
                .collect(Collectors.toList());

        for (String word : filteredText) {
            System.out.printf("%s ", word);
        }
    }

    static boolean isLongerThenThree (String input) {    // filter
        return input.length() > 3;
    }
}
