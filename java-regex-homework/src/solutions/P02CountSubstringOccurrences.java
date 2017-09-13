// Problem 2 Count substring occurrences.
//----------------------------------------------------------------------------------------------------------------------
// Takes text on the first line and substring to count on the second line. Prints the amount of occurrences in the text.
//----------------------------------------------------------------------------------------------------------------------

package solutions;

import java.util.Scanner;

public class P02CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();    // Neat trick when you need to ignore case. Learned it on SoftUni forums :)
        String word = scan.nextLine();

        int lengthWord = word.length();
        int counter = 0;

        for (int i = 0; i <= text.length() - lengthWord; i++) {
            if (word.equals(text.substring(i, i + lengthWord))) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
