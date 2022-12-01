package Year2022;

import java.io.*;
import java.util.ArrayList;


public class DayN {
    private ArrayList<String> inputString;
    //private ArrayList<Integer> inputInteger;

    public DayN() {
        this.inputString = new ArrayList<>();
        //this.inputInteger = new ArrayList<>();
    }


    public void mainProcess() {
        for (int i = 0; i < inputString.size(); i++) {
            System.out.println(inputString.get(i));
        }

    }

    public static void main() {
        // Initiate constructor
        DayN main = new DayN();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcess();
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
