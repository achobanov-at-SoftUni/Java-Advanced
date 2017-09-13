import java.util.Scanner;

import static java.lang.String.format;

public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float b = input.nextFloat();
        float c = input.nextFloat();

        String hex = format("%-10s", Integer.toHexString(a)).toUpperCase();
        String bin = format("%10s", Integer.toBinaryString(a));

        System.out.printf("%s %s %10.2f %-10.2f", hex, bin, b, c);
    }
}
