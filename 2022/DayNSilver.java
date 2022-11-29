import java.io.*;
import java.util.ArrayList;

public class DayNSilver {
    private ArrayList<String> inputString;
    //private ArrayList<Integer> inputInteger;

    public DayNSilver() {
        this.inputString = new ArrayList<>();
        //this.inputInteger = new ArrayList<>();
    }


    public void mainProcess() {


    }

    public static void main() {
        // Initiate constructor
        DayNSilver main = new DayNSilver();

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
