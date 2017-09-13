// Problem 7 Combine Lists of Letters
//----------------------------------------------------------------------------------------------------------------------
// Takes two sequences of chars, on separate lines, divided by spaces. Then appends to the first, characters of the
// second sequence, not present originally in the first.
//----------------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07CombineListOfLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] firstString = input.nextLine().split(" ");
        String[] secondString = input.nextLine().split(" ");

        List<Character> firstList = toCharList(firstString);    // Storing in List, because of '.contains()'
        List<Character> secondList = toCharList(secondString);

        List<Character> outputList = toCharList(firstString);
        for (char symbol : secondList) {
            if (!firstList.contains(symbol)) {  // Check if 'symbol' is present in the first sequence.
                outputList.add(symbol);
            }
        }

        for (char symbol : outputList) {
            System.out.printf("%c ", symbol);
        }

    }

    private static List<Character> toCharList(String[] input) {

        List<Character> list = new ArrayList<>();
        for (String symbol : input) {
            char holder = symbol.charAt(0);
            list.add(holder);
        }
        return list;
    }
}
