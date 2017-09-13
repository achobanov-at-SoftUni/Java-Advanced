import java.io.*;
import java.util.Arrays;

public class Problem03_CountCharacterTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        Character[] vowelsSymbols = new Character[]{'a', 'e', 'i', 'o', 'u'};
        Character[] punctuationSymbols = new Character[]{'!', ',', '.', '?'};

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("words.txt")))) {
            String line = reader.readLine();

            while (line != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    for (char symbol : word.toCharArray()) {
                        if (Arrays.asList(vowelsSymbols).contains(symbol)) {
                            vowels++;
                        } else if (Arrays.asList(punctuationSymbols).contains(symbol)) {
                            punctuation++;
                        } else {
                            consonants++;
                        }
                    }
                }
                line = reader.readLine();
            }
            reader.close();

            PrintWriter writer = new PrintWriter("count-chars.txt");

            writer.write(String.format(
                    "Vowels: " + vowels + System.lineSeparator() +
            "Consonants: " + consonants + System.lineSeparator() +
            "Punctuation: " + punctuation + System.lineSeparator()));

            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
