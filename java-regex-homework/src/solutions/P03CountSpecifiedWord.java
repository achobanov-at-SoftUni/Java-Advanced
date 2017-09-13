// Problem 3 Count specified words.
//----------------------------------------------------------------------------------------------------------------------
// Same as previous. Only this time it counts only distinct words, using any non-letter for words separator.
//----------------------------------------------------------------------------------------------------------------------

package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String word = input.nextLine();

        String regex = "(\\b[" + word + "]{" + Integer.toString(word.length()) + "}\\b)";
        Pattern pattern = Pattern.compile(regex, 2); // '2' calls case-insensitive pattern.
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}
