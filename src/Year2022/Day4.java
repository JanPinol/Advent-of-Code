package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;


public class Day4 {
    private ArrayList<String> inputString;

    public Day4() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay4Gold() {
        int total = 0;
        for (int i = 0; i < inputString.size(); i++) {
            String[] aux = inputString.get(i).split(",");
            String[] partsLeft = aux[0].split("-");
            String[] partsRight = aux[1].split("-");

            int firstMin = parseInt(partsLeft[0]);
            int firstMax = parseInt(partsLeft[1]);
            int secondMin = parseInt(partsRight[0]);
            int secondMax = parseInt(partsRight[1]);

            if (firstMax < secondMin && firstMin < secondMin || firstMin > secondMax && firstMax > secondMax) {

            } else {
                total++;
            }
        }
        System.out.println(total);
    }

    public void mainProcessDay4Silver() {
        int total = 0;
        for (int i = 0; i < inputString.size(); i++) {
            String[] aux = inputString.get(i).split(",");
            String[] partsLeft = aux[0].split("-");
            String[] partsRight = aux[1].split("-");

            int firstMin = parseInt(partsLeft[0]);
            int firstMax = parseInt(partsLeft[1]);
            int secondMin = parseInt(partsRight[0]);
            int secondMax = parseInt(partsRight[1]);

            if (firstMin >= secondMin && firstMax <= secondMax || secondMin >= firstMin && secondMax <= firstMax) {
                total++;
            }

        }
        System.out.println(total);
    }

    public static void main() {
        // Initiate constructor
        Day4 main = new Day4();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay4Silver();
        main.mainProcessDay4Gold();
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
