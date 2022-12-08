import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/D2Input.txt"));
        int points = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            char op = line.charAt(0);
            char you = line.charAt(2);
            points += win(op, you);
            points += choice(you);
        }
        System.out.println(points);
    }

    public static int win(char op, char you){
        if(op == 'A' & you == 'X'){ return 3; }
        if(op == 'A' & you == 'Y'){ return 6; }
        if(op == 'A' & you == 'Z'){ return 0; }
        if(op == 'B' & you == 'X'){ return 0; }
        if(op == 'B' & you == 'Y'){ return 3; }
        if(op == 'B' & you == 'Z'){ return 6; }
        if(op == 'C' & you == 'X'){ return 6; }
        if(op == 'C' & you == 'Y'){ return 0; }
        if(op == 'C' & you == 'Z'){ return 3; }
        return -1;
    }

    public static int choice(char you){
        switch (you) {
            case 'X':
                return 1;
            case 'Y':
                return 2;
            case 'Z':
                return 3;
        }
        return 0;
    }
}

class D2Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/D2Input.txt"));
        int points = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            char op = line.charAt(0);
            char outcome = line.charAt(2);
            char you = you(op, outcome);
            points += choice(you);
            points += win(outcome);
        }
        System.out.println(points);
    }

    public static char you(char op, char outcome) {
        if (op == 'A' & outcome == 'X') {
            return 'Z';
        }
        if (op == 'A' & outcome == 'Y') {
            return 'X';
        }
        if (op == 'A' & outcome == 'Z') {
            return 'Y';
        }
        if (op == 'B' & outcome == 'X') {
            return 'X';
        }
        if (op == 'B' & outcome == 'Y') {
            return 'Y';
        }
        if (op == 'B' & outcome == 'Z') {
            return 'Z';
        }
        if (op == 'C' & outcome == 'X') {
            return 'Y';
        }
        if (op == 'C' & outcome == 'Y') {
            return 'Z';
        }
        if (op == 'C' & outcome == 'Z') {
            return 'X';
        }
        return 'A';
    }

    public static int choice(char you) {
        switch (you) {
            case 'X':
                return 1;
            case 'Y':
                return 2;
            case 'Z':
                return 3;
        }
        return 0;
    }

    public static int win(char outcome){
        switch (outcome) {
            case 'X':
                return 0;
            case 'Y':
                return 3;
            case 'Z':
                return 6;
        }
        return 0;
    }
}
