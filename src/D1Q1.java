import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1Q1 {
        public static void main(String args[]) throws FileNotFoundException {
                Scanner in = new Scanner(new File("Input/D1Q1Input.txt"));
                int max = 0;
                int maxNum = 0;
                int cur = 0;
                int number = 0;
                int line = 0;
                while(in.hasNextLine()){
                        line++;
                        String temp = "0" + in.nextLine();
                        double tempNum = Integer.parseInt(temp);
                        if(tempNum == 0){
                                number++;
                                if(cur > max) {
                                        max = cur;
                                        maxNum = number;
                                }
                                cur = 0;
                        } else {
                                cur += tempNum;
                        }
                }
                System.out.println(max);

        }
}
