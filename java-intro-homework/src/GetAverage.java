import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        System.out.println(Average(a, b, c));
    }

    private static float Average(float a, float b, float c) {
        float sum = a + b + c;
        return sum / 3;
    }
}