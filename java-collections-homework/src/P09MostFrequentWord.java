// Problem 9 Most frequent word
//----------------------------------------------------------------------------------------------------------------------
// Takes text as input and prints the most used word, followed by the amount of occurrences.
//----------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class P09MostFrequentWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String word ="";
        HashMap<String, Integer> wordsCount = new HashMap<>();  // Map to store each word as key and occurrences as values.
        char[] textArray = text.toCharArray();
        for (int i = 0, n = textArray.length; i < n; i++) {
            if (Character.isAlphabetic(textArray[i]) || isComplicatedWord(textArray, i)) {  // Checks if char is letter and takes care of the case when a complicated word is joined by dash ('-').
                word += Character.toLowerCase(textArray[i]);    // Appends the 'char' if it is a letter of dash.
            }
            if (textArray[i] == ' ' && i != 0 || i == textArray.length - 1) {   // Flush 'word' to 'wordsCount' on each 'space' or end of text.
                if (wordsCount.get(word) != null) {
                    int value = wordsCount.get(word);   // Counts the occurrences of 'word' in 'wordsCount'.
                    wordsCount.put(word, value + 1);
                } else {
                    wordsCount.put(word, 1);    // Puts 'word' in 'wordsCout'.
                }
                word = "";
            }
        }
        // Getting the max occurrences value.
        int maxValue = 0;
        for (int value : wordsCount.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        // Prints to console
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.printf("%s -> %d times%n", entry.getKey(), entry.getValue());
            }
        }
    }
    // Checks if '-' is used to join a Complicated word. Example "cross-fire". Makes sure to print '-' in the word. Check line 18. Works by checking the previous and following symbols for letters.
    private static boolean isComplicatedWord(char[] text, int index) {
        try {

            boolean isWord = Character.isAlphabetic(text[index - 1]) && Character.isAlphabetic(text[index + 1]) && text[index] == '-';
            return isWord;

        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}
