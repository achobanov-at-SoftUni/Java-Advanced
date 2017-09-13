// Problem 8 Extract all unique words
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input. Then puts all unique words in a list and prints them in alphabetical order.
//----------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class P08ExtractAllUniqueWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        char[] symbols = text.toCharArray();

        String word = "";   // Storing each word.
        List<String> uniqueWords = new ArrayList<>();
        for (char symbol : symbols) {   // Iterating over each char/
            if (Character.isAlphabetic(symbol)) {
                word += symbol;
            } else if (symbol != symbols[0]) {
                String lowercase = word.toLowerCase();  // Adding lowercase letter to ignore the case sensitivity.
                if (!uniqueWords.contains(lowercase) && !word.equals(" ")) {
                    uniqueWords.add(lowercase);
                }
                word = "";
            }
        }
        Collections.sort(uniqueWords);  // Sorting

        for (String var : uniqueWords) { // Printing
            System.out.printf("%s ", var);
        }
    }
}
