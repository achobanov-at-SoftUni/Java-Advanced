// Problem * 11 Recursive Binary Search
//----------------------------------------------------------------------------------------------------------------------
// Takes target and sequence as input and returns the index of the target element or '-1' if there is no such element,
// using recursion.
//----------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class P11RecursiveBinSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());
        String sequence = input.nextLine();

        int[] numbers = stringToIntArray(sequence);
        int start = 0;
        int end = numbers.length - 1;
        int indexOfTarget = binSearch(start, end, numbers, target);     // Calling the recursion.
        System.out.println(indexOfTarget);
    }
    // Recursion
    static int binSearch(int start, int end, int[] array, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }
        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            return binSearch(start, middle - 1, array, target);     // Returns a call for itself, setting new 'end' parameter, effectively halving the array.
        } else {
            return binSearch(middle + 1, end, array, target);     // Same, but passes new 'start' parameter to the new self-instance.
        }
    }

    static int[] stringToIntArray(String input) {
        String[] temp = input.split(" ");
        int[] numbers = new int[temp.length];
        for (int i = 0, n = temp.length; i < n; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(temp[i]));
        }
        return numbers;
    }
}






























//    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 8, 11, 15, 16, 18, 19, 20, 29};
//        int target = 5;
//        System.out.println(binarySearch(arr, target));
//    }
//    public static int binarySearch(int[] a, int target) {
//
//        return binarySearch(a, 0, a.length - 1, target);
//    }
//
//    public static int binarySearch(int[] a, int start, int end, int target) {
//
//        int middle = (start + end) / 2;
//        if (end < start) {
//            return -1;
//        }
//
//        if (target == a[middle]) {
//            return middle;
//        } else if (target < a[middle]) {
//            return binarySearch(a, start, middle - 1, target);
//        } else {
//            return binarySearch(a, middle + 1, end, target);
//        }
//    }
//}