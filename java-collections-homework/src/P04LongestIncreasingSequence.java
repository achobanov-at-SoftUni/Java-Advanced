// Problem 4 Longest Increasing Sequence
//----------------------------------------------------------------------------------------------------------------------
// Takes sequence of numbers on one line, separated by spaces and prints all increasing subsequences and points to
// the longest one.
//----------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        int[] numbers = stringToIntArray(data);   // Creating integer array to store the numeric values of 'data'. This allows us to perform arithmetic operations.

        List<String> sequences = new ArrayList<>();   // List of strings will hold our sequences.
        String tempSequence = String.valueOf(numbers[0]);   // Temporary variable to store previous sequences as a base line, to help determine longest sequence.
        for (int i = 1, n = numbers.length; i < n; i++) {
            String numberString = String.valueOf(numbers[i]); // From Int to String. This is then appended to the 'tempSequence'
            if (numbers[i] > numbers[i - 1]) {
                tempSequence += " " + numberString;
                if (numberString.equals(String.valueOf(numbers[numbers.length - 1]))) {   // Evaluate if current 'numbers' (numberString) element is last to avoid ArrayOutOfBounds EXCEPTION.
                    sequences.add(tempSequence);
                }
            } else {
                sequences.add(tempSequence);
                tempSequence = numberString;
            }
        }

        int tempLength = 1;  // Same as 'tempSequence', just a holder variable.
        int sequenceIndex = 0;  // Helps find the index of the longest sequence.
        for (String var : sequences) {
            System.out.println(var);
            String[] length = var.split(" ");
            if (length.length > tempLength) {
                tempLength = var.length();
                sequenceIndex = sequences.indexOf(var);
            }
        }
        System.out.printf("Longest: %s", sequences.get(sequenceIndex));
    }

    private static int[] stringToIntArray(String input) {
        String[] data = input.split(" ");
        int[] numbers = new int[data.length];
        for (int i = 0, n = data.length; i < n; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }
        return numbers;
    }
}
