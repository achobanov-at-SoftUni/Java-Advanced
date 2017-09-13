import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem04_CopyJPGFile {
    public static void main(String[] args) {
        try(FileInputStream pictureReader = new FileInputStream("picture.jpg");
            FileOutputStream pictureCreator = new FileOutputStream("my-copied-picture.jpg")) {
            byte[] buffer = new byte[4096];

            while (true) {
                int readBytes = pictureReader.read(buffer, 0, buffer.length);
                if(readBytes <= 0) {
                    break;
                }

                pictureCreator.write(buffer, 0, readBytes);
            }

            pictureReader.close();
            pictureCreator.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
