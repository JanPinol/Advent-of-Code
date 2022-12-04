package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Day2 {
    private ArrayList<String> inputString;

    public Day2() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay2Gold() {
        int total = 0;

        for (int i = 0; i < inputString.size(); i++) {
            String[] parts = inputString.get(i).split(" ");
            switch (parts[0]) {
                //rock
                case "A":
                    switch (parts[1]) {
                        case "X" -> total += 0 + 3;
                        case "Y" -> total += 3 + 1;
                        case "Z" -> total += 6 + 2;
                    }
                    break;
                //paper
                case "B":
                    switch (parts[1]) {
                        case "X" -> total += 0 + 1;
                        case "Y" -> total += 3 + 2;
                        case "Z" -> total += 6 + 3;
                    }
                    break;
                //scissors
                case "C":
                    switch (parts[1]) {
                        case "X" -> total += 0 + 2;
                        case "Y" -> total += 3 + 3;
                        case "Z" -> total += 6 + 1;
                    }
                    break;
            }
        }
        System.out.println(total);
    }

    public void mainProcessDay2Silver() {
        int total = 0;

        for (int i = 0; i < inputString.size(); i++) {
            String[] parts = inputString.get(i).split(" ");
            switch (parts[0]) {
                //rock
                case "A":
                    switch (parts[1]) {
                        case "X" -> total += 3 + 1;
                        case "Y" -> total += 6 + 2;
                        case "Z" -> total += 0 + 3;
                    }
                    break;
                //paper
                case "B":
                    switch (parts[1]) {
                        case "X" -> total += 0 + 1;
                        case "Y" -> total += 3 + 2;
                        case "Z" -> total += 6 + 3;
                    }
                    break;
                //scissors
                case "C":
                    switch (parts[1]) {
                        case "X" -> total += 6 + 1;
                        case "Y" -> total += 0 + 2;
                        case "Z" -> total += 3 + 3;
                    }
                    break;
            }
        }
        System.out.println(total);
    }

    public static void main() {
        // Initiate constructor
        Day2 main = new Day2();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay2Silver();
        main.mainProcessDay2Gold();
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
