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
        String[] parts = inputString.get(0).split("");
        int count = 14;
        for (int i = 0; i < parts.length - 14; i++) {
            boolean found = false;
            String[] arr = new String[14];
            for (int j = 0; j < 14; j++) {
                arr[j] = parts[i + j];
            }

            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j].equals(arr[k])) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println(count);
                break;
            } else {
                count++;
            }
        }
    }

    public void mainProcessDay6Silver() {
        String[] parts = inputString.get(0).split("");
        int count = 4;
        for (int i = 0; i < parts.length - 3; i++) {
            boolean found = false;
            String[] arr = new String[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = parts[i + j];
            }

            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j].equals(arr[k])) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println(count);
                break;
            } else {
                count++;
            }
        }
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
