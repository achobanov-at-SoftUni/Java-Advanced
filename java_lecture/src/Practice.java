import java.io.*;

public class Practice {

    public static void main(String[] args) throws IOException {

        final String FILE_PATH = "streams/practice/user-log.txt";
        File inputFile = new File (FILE_PATH);

        BufferedReader inputStream = new BufferedReader(
                new FileReader(inputFile)
        );
        String line = inputStream.readLine();
        while (line != null) {
            String[] data = line.split(" ");
            String name = data[0];
            int totalMinutes = parseTime(data);

            int minsInDay = 60 * 24;
            int days = totalMinutes / minsInDay;
            int hours = (totalMinutes % minsInDay) / 60;
            int mins = (totalMinutes % minsInDay) % 60;
            System.out.printf("%s %d (%d days, %d hours, %d minutes)%n", name, totalMinutes, days, hours, mins);
            line = inputStream.readLine();
        }
    }

    private static int parseTime(String[] input) {

        int totalMinutes = 0;
        for (int i = 1; i < input.length; i++) {
            String[] loggedTime = input[i].split(":");
            int hours = Integer.parseInt(loggedTime[0]);
            int minutes = Integer.parseInt(loggedTime[1]);
            totalMinutes += hours * 60 + minutes;
        }
        return totalMinutes;
    }
}
