import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllCapitals {

    public static void main(String[] args) throws FileNotFoundException {

        final String FILE_PATH = "data/lines.txt";
        File file = new File(FILE_PATH);
        List<String> output = new ArrayList<>();
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            String line = inputStream.readLine();
            while (line != null) {
                output.add(line.toUpperCase());
                line = inputStream.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(file, false))) {
            output.forEach(outputStream::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
// User reminder
        System.out.println("Скъпи колега, преглеждащ домашното ми. Не забравай да подмениш файла или да му добавиш първоначалното съдържание за да репродуцираш правилния ефект от програмата, ако има нужда. Поздрав!");
    }
}
