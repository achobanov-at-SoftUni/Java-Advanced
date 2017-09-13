package solutions;// Problem 1 Extract emails
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input and using regex pattern extracts all emails and prints them.
//----------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01ExtractEmails {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String regex = "(([\"]?[a-zA-Z0-9]+[-|+|.|_]?[a-zA-Z0-9]+[\"]?)[@]([a-zA-Z0-9]+([-|.][a-z0-9]+)+))";

        Pattern emails = Pattern.compile(regex);
        Matcher match = emails.matcher(text);
        boolean matchesFound = false;     // No matches feedback.
        while (match.find()) {
            System.out.println(match.group(0));
            matchesFound = true;
        }
        if (!matchesFound) {
            System.out.println("No matches found!");
        }
    }
}
