import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1Q1 {
        public static void main(String args[]) throws FileNotFoundException {
                Scanner in = new Scanner(new File("Input/D1Q1Input.txt"));
                int maxNum = 0;
                int cur = 0;
                int number = 0;
                int line = 0;
                int first = 0;
                int second = 0;
                int third = 0;
                while(in.hasNextLine()){
                        line++;
                        String temp = "0" + in.nextLine();
                        double tempNum = Integer.parseInt(temp);
                        if(tempNum == 0){
                                number++;
                                if(cur > third) {
                                        if(cur > second){
                                                if(cur > first){
                                                        first = cur;
                                                }else{
                                                        second = cur;
                                                }
                                        }else{
                                                third = cur;
                                        }

                                }
                                cur = 0;
                        } else {
                                cur += tempNum;
                        }
                }
                System.out.println(third+second+first);

        }
}
