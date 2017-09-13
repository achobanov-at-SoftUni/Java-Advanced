import java.util.Scanner;

public class GhtettoNumeralSystem {

    public static void main(String[] args) {

        String[] ghettoDigits = {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};
        Scanner input = new Scanner(System.in);
        String number = input.next();
        String ghettoNumber = "";
        for (char digit : number.toCharArray()) {
            ghettoNumber += ghettoDigits[Character.getNumericValue(digit)];
        }
        System.out.println(ghettoNumber);
    }
}
