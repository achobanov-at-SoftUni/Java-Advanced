import java.util.Scanner;

public class OddOrEvenIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        String[] strNumbers = sequence.split(" ");

        if (strNumbers.length % 2 != 0) {
            System.out.println("Invalid input! Please enter even amount of numbers");
        } else {
            int[] numbers = toIntArray(strNumbers);
            for(int i = 0, y = numbers.length - 1; i < y; i += 2) {
                int firstNum = numbers[i];
                int secondNum = numbers [i + 1];
                if (!isOdd(firstNum) && !isOdd(secondNum)) {
                    System.out.printf("%d, %d -> even", firstNum, secondNum);
                } else if (isOdd(firstNum) && isOdd(secondNum)) {
                    System.out.printf("%d, %d -> odd", firstNum, secondNum);
                } else {
                    System.out.printf("%d, %d -> different", firstNum, secondNum);
                }
                System.out.println();
            }
        }
    }

    private static int[] toIntArray(String[] param) {

        int arrayLenght = param.length;
        int[] numbers = new int[arrayLenght];
        for(int i = 0; i < arrayLenght; i++) {
            numbers[i] = Integer.parseInt(param[i]);
        }
        return numbers;
    }

    private static boolean isOdd(int param) {

        boolean isOdd;
        if (param % 2 == 0) {
            isOdd = false;
        } else {
            isOdd = true;
        }
        return isOdd;
    }
}
