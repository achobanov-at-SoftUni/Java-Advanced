// Problem 12 Calculate Factorial recursively
//----------------------------------------------------------------------------------------------------------------------
// Takes number as input and pints its !factorial, using basic recursion
//----------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class P12CalculateN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        System.out.println(facturiel(number));    // Calling recusion.
    }

    static long facturiel(long number) {
        if (number == 1) {
            return 1;
        }
        return number * facturiel(number - 1);     // Calls itself on return, until 'number' becomes 1.
    }
}
