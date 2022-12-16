import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/D4Input.txt"));
        int num = 0;
        while(in.hasNext()){
            String line = in.nextLine();
            int index = line.indexOf(',');
            String a = line.substring(0,index);
            String b = line.substring(index + 1);
//            System.out.println(a);
//            System.out.println(b);

            int aStart = Integer.parseInt(a.substring(0,a.indexOf('-')));
            int aEnd = Integer.parseInt(a.substring(a.indexOf('-') + 1));
//            System.out.println(aStart);
//            System.out.println(aEnd);
            int bStart = Integer.parseInt(b.substring(0,b.indexOf('-')));
            int bEnd = Integer.parseInt(b.substring(b.indexOf('-') + 1));
            if(aStart <= bStart && aEnd >= bEnd)
                num++;
            if(bStart <= aStart && bEnd >= aEnd)
                num++;
        }
        System.out.println(num);
    }
}
