import java.util.Scanner;

public class SumNumberFrom1ToN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (;number > 0; number--) {
            sum += number;
        }
        System.out.println(sum);

    }
}
