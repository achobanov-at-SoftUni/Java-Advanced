// Problem 3 Largest Sequence of Equal Strings
//-----------------------------------------------------------------------------------------------------------------------
// Takes sequence of strings in a single line, separated by spaces and prints the largest subsequence of equal elements.
//-----------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class P03LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");

        int longestSequenceLength = 1;
        int tempLength = 1; // Temporary variable to help determine the largest subsequence.
        int index = 0;
        // Simple logic here.
        for (int i = 1, n = words.length; i <= n; i++) {
            if (words[i].equals(words[i - 1])) {
                tempLength++;
            } else if (tempLength > longestSequenceLength){
                longestSequenceLength = tempLength;
                tempLength = 1;
                index = i - longestSequenceLength;
            } else {
                tempLength = 1;
            }
        }

        for(int i = 0, y = index; i < longestSequenceLength; i++, index++) {
            System.out.printf("%s ", words[y]);
        }

    }
}
