package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Day4 {
    private ArrayList<String> inputString;

    public Day4() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay4Gold() {

    }

    public void mainProcessDay4Silver() {

    }

    public static void main() {
        // Initiate constructor
        Day4 main = new Day4();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        //main.mainProcessDay4Silver();
        //main.mainProcessDay4Gold();
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
