import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem05_SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(3.21, 0.1234552, 16.0, 20.1, 1.2323);

        saveDoubles(doubles);
        loadDoubles();
    }

    public static void saveDoubles(List<Double> doubles){
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("doubles.list"))){
            for (Double number : doubles){
             writer.writeObject(number);
            }
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void loadDoubles(){
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("doubles.list"))){
            String number = reader.readObject().toString();

            while (number != null){
                System.out.println(number);
                number = reader.readObject().toString();
            }
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
