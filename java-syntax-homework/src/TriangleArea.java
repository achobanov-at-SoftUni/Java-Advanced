import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter point A x coordinates: ");
        int Ax = input.nextInt();
        System.out.println("Enter point A y coordinates: ");
        int Ay = input.nextInt();
        System.out.println("Enter point B x coordinates: ");
        int Bx = input.nextInt();
        System.out.println("Enter point B y coordinates: ");
        int By = input.nextInt();
        System.out.println("Enter point C x coordinates: ");
        int Cx = input.nextInt();
        System.out.println("Enter point C y coordinates: ");
        int Cy = input.nextInt();

        int area = Math.abs((Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2);
        System.out.println(area);
    }
}
