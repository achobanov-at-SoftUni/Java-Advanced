import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem01_SumLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("lines.txt")))){
            String line = reader.readLine();
            while (line != null) {
                char[] symbols = line.toCharArray();
                int sum = 0;

                for (int i = 0; i < symbols.length; i++) {
                    sum += symbols[i];
                }

                System.out.println(sum);
                line = reader.readLine();
            }

            reader.close();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
