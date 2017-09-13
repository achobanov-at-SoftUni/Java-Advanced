//
//import java.util.Scanner;
//
//public class GetFirstOddOrEvenElements {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        String[] strSequence = input.nextLine().split(" ");
//        String[] commands = input.nextLine().split(" ");
//
//        int[] sequence = toIntArray(strSequence);
//        String getType = commands[2];
//        int getAmount = Integer.parseInt(commands[1]);
//
//        boolean OddOrEven;
//        switch (getType) {
//            case "Even":
//                OddOrEven = isEven();
//                break;
//            case "Odd":
//                OddOrEven = isOdd();
//                break;
//        }
//
//        for (int i = 0, counter = 0; i < strSequence.length && counter < getAmount; i++) {
//           if (OddOrEven(i))
//                System.out.printf("%d ", sequence[i]);
//                counter++;
//            }
//        }
//
//    private static int[] toIntArray(String[] param) {
//
//        int arrayLenght = param.length;
//        int[] numbers = new int[arrayLenght];
//        for (int i = 0; i < arrayLenght; i++) {
//            numbers[i] = Integer.parseInt(param[i]);
//        }
//        return numbers;
//    }
//
//    private static boolean isOdd(int param) {
//
//        boolean isOdd = false;
//        if (param % 2 != 0) {
//            isOdd = true;
//        }
//        return isOdd;
//
//    }
//
//    private static boolean isEven(int param) {
//
//        boolean isEven = false;
//        if (param % 2 != 0) {
//            isEven = true;
//        }
//        return isEven;
//    }
//}