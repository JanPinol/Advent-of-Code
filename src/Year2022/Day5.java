package Year2022;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;



public class Day5 {

    public void mainProcessDay5Gold() throws IOException {
        Stack[] stackSilver = createFirstInputStack();
        Scanner scanner = new Scanner(new File("input.txt"));
        int saltarStacksInput = 1;
        while (scanner.hasNext()) {
            if (saltarStacksInput <= 10) {
                scanner.nextLine();
                saltarStacksInput++;
            } else {
                String[] parts = scanner.nextLine().split(" ");
                int nBox = Integer.parseInt(parts[1]);
                int from = Integer.parseInt(parts[3]);
                int to = Integer.parseInt(parts[5]);
                ArrayList<Character> saveOrder = new ArrayList<>();
                for (int i = 0; i < nBox; i++) {
                    saveOrder.add((char) stackSilver[from - 1].pop());
                }
                for (int i = 0; i < nBox; i++) {
                    stackSilver[to - 1].push(saveOrder.get(nBox - 1 - i));
                }
            }
        }
        for (int i = 0; i < stackSilver.length; i++) {
            System.out.print(stackSilver[i].peek());
        }
    }

    public void mainProcessDay5Silver() throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        Stack[] stackSilver = createFirstInputStack();
        int saltarStacksInput = 0;
        while (scanner.hasNext()) {
            if (saltarStacksInput <= 9) {
                scanner.nextLine();
                saltarStacksInput++;
            } else {
                String[] parts = scanner.nextLine().split(" ");
                int nBox = Integer.parseInt(parts[1]);
                int from = Integer.parseInt(parts[3]);
                int to = Integer.parseInt(parts[5]);
                while (nBox > 0) {
                    stackSilver[to - 1].push(stackSilver[from - 1].pop());
                    nBox--;
                }
            }
        }
        for (int i = 0; i < stackSilver.length; i++) {
            System.out.print(stackSilver[i].peek());
        }
    }

    public static Stack[] createFirstInputStack() {
        Stack<Character> stack1 = new Stack<>();
        stack1.push('B');
        stack1.push('Z');
        stack1.push('T');

        Stack<Character> stack2 = new Stack<>();
        stack2.push('V');
        stack2.push('H');
        stack2.push('T');
        stack2.push('D');
        stack2.push('N');

        Stack<Character> stack3 = new Stack<>();
        stack3.push('B');
        stack3.push('F');
        stack3.push('M');
        stack3.push('D');

        Stack<Character> stack4 = new Stack<>();
        stack4.push('T');
        stack4.push('J');
        stack4.push('G');
        stack4.push('W');
        stack4.push('V');
        stack4.push('Q');
        stack4.push('L');

        Stack<Character> stack5 = new Stack<>();
        stack5.push('W');
        stack5.push('D');
        stack5.push('G');
        stack5.push('P');
        stack5.push('V');
        stack5.push('F');
        stack5.push('Q');
        stack5.push('M');

        Stack<Character> stack6 = new Stack<>();
        stack6.push('V');
        stack6.push('Z');
        stack6.push('Q');
        stack6.push('G');
        stack6.push('H');
        stack6.push('F');
        stack6.push('S');

        Stack<Character> stack7 = new Stack<>();
        stack7.push('Z');
        stack7.push('S');
        stack7.push('N');
        stack7.push('R');
        stack7.push('L');
        stack7.push('T');
        stack7.push('C');
        stack7.push('W');

        Stack<Character> stack8 = new Stack<>();
        stack8.push('Z');
        stack8.push('H');
        stack8.push('W');
        stack8.push('D');
        stack8.push('J');
        stack8.push('N');
        stack8.push('R');
        stack8.push('M');

        Stack<Character> stack9 = new Stack<>();
        stack9.push('M');
        stack9.push('Q');
        stack9.push('L');
        stack9.push('F');
        stack9.push('D');
        stack9.push('S');

        return new Stack[]{stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9};
    }

    public static void main() throws IOException {
        // Initiate constructor
        Day5 main = new Day5();

        // Execute the algorithm
        main.mainProcessDay5Silver();
        System.out.println();
        main.mainProcessDay5Gold();
    }



}
