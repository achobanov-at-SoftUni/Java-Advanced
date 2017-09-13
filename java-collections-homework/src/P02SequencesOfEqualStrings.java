// Problem 2 Sequence of equal strings
//----------------------------------------------------------------------------------------------------------------------
// Prints different strings on separate lines and equal sttrings on the same line.
//----------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.Scanner;

public class P02SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");

        Arrays.sort(words);
        String prevWord = words[0];
        for (String word: words) {
            if (word.equals(prevWord)) {        // Makes sure that only equal strings are printed on same line
                System.out.printf("%s ", word);
            } else {
                System.out.printf("%n%s ", word);
            }
            prevWord = word;
        }
    }
}
