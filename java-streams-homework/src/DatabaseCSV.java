import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class DatabaseCSV {

    public static void main(String[] args) throws FileNotFoundException {
//        Search
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

//TODO Define commands.

        BufferedReader inputStudents = new BufferedReader(new FileReader("data/DatabaseCSV/students.txt."));
        BufferedReader inputGrades = new BufferedReader(new FileReader("data/DatabaseCSV/grades.txt."));

//TODO Implement Data structures ( HashMaps ) to hold data for each query type.


//TODO Get data and fill HashMaps.


//TODO Associate HashMaps and Implement console interface for query.


//TODO Output to file


    }
}
