import java.io.*;
import java.util.Objects;

public class CountCharTypes {

    public static void main(String[] args) {

        final String INPUT_FILE_PATH = "data/words.txt";
        final String OUTPUT_FILE_PATH = "data/count-chars.txt";
        File inputFile = new File(INPUT_FILE_PATH);
        File outputFile = new File(OUTPUT_FILE_PATH);

        String words = "";
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
            words = inputStream.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String vowels = "aeiou";
        String punctuation = ".,?!";
        int numVowels = 0;
        int numConsonants = 0;
        int numPunctuation = 0;
        for(char i : words.toCharArray()) {
            String y = String.valueOf(i);
            if (vowels.contains(y)) {
                numVowels++;
            } else if (punctuation.contains(y)) {
                numPunctuation++;
            } else if (!Objects.equals(y, " ")){
                numConsonants++;
            }
        }

        try (PrintWriter outputStream = new PrintWriter(new FileWriter(outputFile))) {
            outputStream.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d%n",
                    numVowels, numConsonants, numPunctuation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
