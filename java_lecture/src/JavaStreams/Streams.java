
package JavaStreams;

import java.io.*;

public class Streams {


    public static void main(String[] args) throws IOException {
        DataSteam();
    }
    private static void DataSteam() throws IOException {
// Write
        DataOutputStream myData = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("mydata.txt")
                )
        );

        myData.writeUTF("pesho");
        myData.writeInt(6);
        myData.flush();
        myData.close();
// Read
        DataInputStream readData = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("mydata.txt")
                )
        );

        String name = readData.readUTF();
        System.out.println(name);
        int grade = readData.readInt();
        System.out.println(grade);
        readData.close();
    }
}
