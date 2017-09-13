// Problem 5 - Count All Words
//----------------------------------------------------------------------------------------------------------------------
// Takes string input and counts the number of separate words. It is a bit of a "cheating" algorithm, its not
// actually counting words. It works by splitting the string by spaces and then taking care of punctuation. I think
// it works well enough for the task at hand.
//----------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05CountAllWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");   // Split into words

        int counter = 0;
        List<Character> punctuation = Arrays.asList('.', ',', '?', '!', '@', '#', '%', '^', '&', '*', '(', ')', '_',
                '=', '+', '/');     // Crates list of all the punctuation signs to exclude
        for (String word : words) {
            for (char symbol : word.toCharArray()) {
                if (!Character.isAlphabetic(symbol) && !punctuation.contains(symbol)) {
                    counter++; // counting things like 'cross-platform' for 2 words ( dashes ), while excluding
                    // punctuaion signs like ',', '.' and so on.
                }
            }
        }

        int numWords = words.length + counter;
        System.out.println(numWords);
    }
}