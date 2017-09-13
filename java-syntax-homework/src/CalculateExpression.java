import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float firstFormula = (float) Math.pow((a * a + b * b) / (a * a - b * b), (a + b + c ) / Math.sqrt(c));
        float secondFormula = (float) Math.pow((a * a + b * b - c * c * c), a - b);
        float avarageFormlulae = (firstFormula + secondFormula) / 2;
        float avarage = (a + b + c) / 3;
        float diff = Math.abs(avarage - avarageFormlulae);

        System.out.printf("F1 result: %.2f; F2 result %.2f; Diff: %.2f", firstFormula, secondFormula, diff);
    }

}