import java.util.Scanner;

public class GetFirstOddOrEvenElements {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String[] strSequence = input.nextLine().split(" ");
        String[] commands = input.nextLine().split(" ");

        int[] sequence = toIntArray(strSequence);
        String getType = commands[2];
        int getAmount = Integer.parseInt(commands[1]);

        for(int i = 0, counter = 0; i < strSequence.length && counter < getAmount; i++) {
            if (isEvenOdd(sequence[i], getType)) {
                System.out.printf("%d ", sequence[i]);
                counter++;
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

    private static boolean isEvenOdd(int param, String type) {

        boolean numberType = false;
        if ((type.equals("even") && param % 2 == 0) || (type.equals("odd") && param % 2 != 0)) {
            numberType = true;
        }
        return numberType;
    }
}
