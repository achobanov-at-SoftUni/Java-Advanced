import SaveCustomObjectToFile.JavaCourse;

import java.io.*;

public class SaveCustomObjectInFile {

    public static void main(String[] args) {

        File file = new File("data/course.save");
        JavaCourse object = new JavaCourse();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {

            outputStream.writeObject(object);
            System.out.println(inputStream.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
