// Problem 1 Sort Array of Numbers
//----------------------------------------------------------------------------------------------------------------------
// Takes sequence of numbers as input, sorts them and prints them.
//----------------------------------------------------------------------------------------------------------------------

import java.util.Arrays;
import java.util.Scanner;

public class P01SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        int[] numbers = new int[amount]; // Creating int array to store the input and perform arithmetic operations.
        for (int i = 0; i < amount; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers); // Sorting.

        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
    }
}
