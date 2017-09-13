// Problem 5 Extract words.
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input and prints all words ( sequences of two or more alphabetical characters )
//----------------------------------------------------------------------------------------------------------------------

package solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05ExtractWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String regex = "([a-z]{2,}[\b]?)";
        Pattern pattern = Pattern.compile(regex, 2);    //  '2' calls for 'case-insensitive' pattern
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("%s ", matcher.group(0));
        }
    }
}
