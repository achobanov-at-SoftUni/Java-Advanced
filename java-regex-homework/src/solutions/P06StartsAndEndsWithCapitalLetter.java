// Problem 6 Stats and ends with capital letters.
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input and prints only the words, starting and ending with capital letters, using regex
//----------------------------------------------------------------------------------------------------------------------
package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String regex = "(\\b[A-Z]([a-z]*[A-Z])+\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.printf("%s ", matcher.group(0));
        }
    }
}
