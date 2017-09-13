import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveArrayListOfDoubles {

    public static void main(String[] args) {
        List<Double> data = new ArrayList<>(Arrays.asList(1.25, 15.08, 0.05, 102.5, 18.19));
        File file = new File("data/doubles.list");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            outputStream.writeObject(data);
            System.out.println(inputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
