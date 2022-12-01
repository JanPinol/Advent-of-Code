package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class Day1 {
    private ArrayList<String> inputString;

    public Day1() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay1Gold() {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        int suma = 0;
        for (int i = 0; i < inputString.size(); i++) {
            if (inputString.get(i).equals("")) {
                sortedArray.add(suma);
                suma = 0;
            }else {
                suma += parseInt(inputString.get(i));
            }
        }
        Collections.sort(sortedArray);
        Collections.reverse(sortedArray);
        int total = sortedArray.get(0) + sortedArray.get(1) + sortedArray.get(2);
        System.out.println(total);
    }

    public void mainProcessDay1Silver() {
        int max = 0;
        int suma = 0;
        for (int i = 0; i < inputString.size(); i++) {
            if (inputString.get(i).equals("")) {
                if (max < suma) {
                    max = suma;
                }
                suma = 0;
            }else {
                suma += parseInt(inputString.get(i));
            }
        }
        System.out.println(max);
    }

    public static void main() {
        // Initiate constructor
        Day1 main = new Day1();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay1Silver();
        main.mainProcessDay1Gold();
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
