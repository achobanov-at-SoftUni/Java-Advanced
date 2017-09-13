
import java.util.Scanner;

public class HiTheTarget {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int product = input.nextInt();

        for(int i = 1; i <= 20; i++) {
            for(int y = 1; y <= 20; y++) {
                if (i + y == product ) {
                    System.out.printf("%d + %d = %d", i, y, product);
                    System.out.println();
                } else if (i - y == product) {
                    System.out.printf("%d - %d = %d", i, y, product);
                    System.out.println();
                }
            }
        }
    }
}
