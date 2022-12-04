package Year2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Day3 {
    private ArrayList<String> inputString;

    public Day3() {
        this.inputString = new ArrayList<>();
    }

    public void mainProcessDay3Gold() {
        int total = 0;
        for (int i = 0; i < inputString.size(); i++) {


            String[] parts1 = inputString.get(i).split("");
            String[] parts2 = inputString.get(i+1).split("");
            String[] parts3 = inputString.get(i+2).split("");

            boolean added = false;
            for (int j = 0; j < parts1.length; j++) {
                for (int n = 0; n < parts2.length ; n++) {
                    if (parts1[j].charAt(0) == parts2[n].charAt(0)) {
                        for (int k = 0; k < parts3.length ; k++) {
                            if (parts2[n].charAt(0) == parts3[k].charAt(0)) {
                                if (Character.isUpperCase(parts1[j].charAt(0))){
                                    total += parts1[j].charAt(0) - 38;
                                }else {
                                    total += parts1[j].charAt(0) - 96;
                                }
                                added = true;
                                break;
                            }
                        }
                    }
                    if(added) {
                        break;
                    }
                }
            }
            i += 2;
        }
        System.out.println(total);
    }

    public void mainProcessDay3Silver() {
        int total = 0;
        for (int i = 0; i < inputString.size(); i++) {
            String[] parts = inputString.get(i).split("");
            boolean added = false;
            for (int j = 0; j < parts.length / 2; j++) {
                for (int n = 0; n < parts.length ; n++) {
                    if (n >= parts.length / 2) {
                        if (parts[j].charAt(0) == parts[n].charAt(0)) {
                            if (Character.isUpperCase(parts[j].charAt(0))){
                                total += parts[j].charAt(0) - 38;
                            }else {
                                total += parts[j].charAt(0) - 96;
                            }
                            added = true;
                            break;
                        }
                    }
                }
                if(added) {
                    break;
                }
            }
        }
        System.out.println(total);
    }

    public static void main() {
        // Initiate constructor
        Day3 main = new Day3();

        // Read input.txt file and fill input array string
        main.readFile();

        // Execute the algorithm
        main.mainProcessDay3Silver();
        main.mainProcessDay3Gold();
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
