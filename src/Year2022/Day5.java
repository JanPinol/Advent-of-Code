package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Day5 {

    private ArrayList<String> inputString;

    public Day5() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay5Gold() {

    }

    public void mainProcessDay5Silver() {

    }

    public static void main() {
        // Initiate constructor
        Day5 main = new Day5();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay5Silver();
        main.mainProcessDay5Gold();
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
