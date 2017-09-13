// Problem 6 Count specified word
//----------------------------------------------------------------------------------------------------------------------
// Takes text as first input and word as second. Then counts all appearances of the word in the text.
//----------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class P06CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split(" ");
        String wordToCount = input.nextLine();

        int counter = 0;
        for (String word : text) {
            if (wordToCount.equalsIgnoreCase(word)) {   // This does the case trick and takes care of punctuation.
                counter++;
            }
        }

        System.out.println(counter);
    }
}
