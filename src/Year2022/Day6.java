package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Day6 {
    private ArrayList<String> inputString;

    public Day6() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay6Gold() {

    }

    public void mainProcessDay6Silver() {

    }

    public static void main() {
        // Initiate constructor
        Day6 main = new Day6();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay6Silver();
        main.mainProcessDay6Gold();
    }

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line = br.readLine();

            while (line != null) {
                inputString.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
