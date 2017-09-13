import org.omg.CORBA.Environment;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Problem02_AllCapitals {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("lines.txt")))){
            StringBuilder text = new StringBuilder();
            String line = reader.readLine();
            while (line != null){
                text.append(line.toUpperCase() + System.lineSeparator());
                line = reader.readLine();
            }

            reader.close();

            PrintWriter writer = new PrintWriter("lines.txt");

           writer.write(text.toString());


            writer.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
