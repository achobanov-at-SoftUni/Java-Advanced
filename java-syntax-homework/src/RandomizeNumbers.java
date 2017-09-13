import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomizeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        List<Integer> sequence = new ArrayList<>();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for(; min <= max; min++) {
            sequence.add(min);
        }
        Collections.shuffle(sequence);

        System.out.println(sequence);
    }
}

