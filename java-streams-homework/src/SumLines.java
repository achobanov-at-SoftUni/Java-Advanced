import java.io.*;

public class SumLines {

    public static void main(String[] args) throws IOException {
        final String FILE_PATH = "data/lines.txt";
        BufferedReader inputStream = new BufferedReader(
                new FileReader(FILE_PATH)
        );
        String line = inputStream.readLine();
        while (line != null) {
            char[] charSequence = line.toCharArray();
            int sumASKII = 0;
            for (char i : charSequence) {
                sumASKII += i;
            }
            System.out.println(sumASKII);
            line = inputStream.readLine();
        }
        inputStream.close();
    }
}
