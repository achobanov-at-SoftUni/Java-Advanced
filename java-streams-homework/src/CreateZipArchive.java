import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {

    public static void main(String[] args) {
        File words = new File("data/words.txt");
        File lines = new File("data/lines.txt");
        File countChars = new File("data/count-chars.txt");
        File zipFile = new File("data/files.zip");

        try (ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipFile))) {

            byte[] buffer = new byte[1024];
            File file = null;
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0: file = words; break;
                    case 1: file = lines; break;
                    case 2: file = countChars; break;
                }
                FileInputStream stream = new FileInputStream(file);
                outputStream.putNextEntry(new ZipEntry(file.getName()));
                int data;
                while ((data = stream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, data);
                }
                outputStream.closeEntry();
                stream.close();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
