import java.util.Scanner;

public class Convert7BaseToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String base_seven = input.nextLine();
        String decimal = Integer.toString(Integer.parseInt(base_seven, 7), 10);
        System.out.println(decimal);
    }
}