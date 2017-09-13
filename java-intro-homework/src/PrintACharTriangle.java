import java.util.Scanner;

public class PrintACharTriangle {

    public static void main(String[] args) {
//          Getting and validating input.
        Scanner input = new Scanner(System.in);
        int height;
        do {
            System.out.println("Choose height: (2 - 26) ");
            height = input.nextInt();

        } while (height < 2 || height > 26);

        int maxHeight = height * 2 - 1;
        for (int line = 0, endStop = 0; line < maxHeight; line++) {
            int width = 0;
            for (char letter = 'a'; width <= line - endStop; letter++) {
                System.out.print(letter);
                width++;
            }
            if (line >= height - 1) {
                endStop += 2;
            }
            System.out.println();
        }
    }
}

