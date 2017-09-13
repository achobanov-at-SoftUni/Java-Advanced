// Problem 4 Count all words.
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input on a single line and counts all words using simple regex.
//----------------------------------------------------------------------------------------------------------------------

package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04CountAllWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String regex = "(\\b[a-z]+\\b)";
        Pattern pattern = Pattern.compile(regex, 2);
        Matcher matcher = pattern.matcher(text);
        int wordsCounter = 0;
        while (matcher.find()) {
            wordsCounter++;
        }

        System.out.println(wordsCounter);
    }
}
