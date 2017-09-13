import java.io.*;

public class CopyJpg {

    public static void main(String[] args) {
        File sourceImage = new File("data/Tiger.jpg");
        File copyImage = new File("data/my-copied-picture.jpg");

        try (FileInputStream inputStream = new FileInputStream(sourceImage);
             FileOutputStream outputStream = new FileOutputStream(copyImage);) {
            byte[] buffer = new byte[1024];
            int dataRead = inputStream.read(buffer);
            while (dataRead != -1) {
                outputStream.write(buffer, 0, dataRead);
                dataRead = inputStream.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
