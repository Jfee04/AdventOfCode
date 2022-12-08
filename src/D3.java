import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class D3 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap map = buildMap();
        Scanner in = new Scanner(new File("Input/D3Input.txt"));
        int points = 0;
        while (in.hasNext()){
            String str = in.next();
            int mid = str.length() / 2;

            // Get the first and second half of the string
            String firstHalf = str.substring(0, mid);
            String secondHalf = str.substring(mid);
//            System.out.println(str);
//            System.out.println(firstHalf);
//            System.out.println(secondHalf);
            ArrayList<Character> seen = new ArrayList<Character>();
            for(char c : firstHalf.toCharArray()){
                if(secondHalf.indexOf(c) != -1 && !seen.contains(c)) {
                    points += (int) map.get(c);
                    seen.add(c);
                }
            }
        }
        System.out.println(points);
    }


    //(int)'a' = 97
    //(int)'A' = 65
    public static HashMap buildMap(){
        HashMap map = new HashMap();
        for(int i = (int)'a'; i < (int)'a' + 26; i++){
            char c = (char) i;
            map.put(c, i - (int) 'a' + 1);
        }
        for(int i = (int)'A'; i < (int)'A' + 26; i++){
            char c = (char) i;
            map.put(c, i - (int) 'A' + 27);
        }
        //System.out.println(map.toString());
        return map;
    }

}


class D3Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap map = buildMap();
        Scanner in = new Scanner(new File("Input/D3Input.txt"));
        int points = 0;
        while (in.hasNext()){
            String[] strs = new String[3];
            for(int i = 0; i < 3; i++){
                if(in.hasNext()){
                    strs[i] = in.next();
                }
            }
            for(char c : strs[0].toCharArray()){
                if(strs[1].indexOf(c) != -1 && strs[2].indexOf(c) != -1) {
                    points += (int) map.get(c);
                    break;
                }
            }
        }
        System.out.println(points);
    }


    //(int)'a' = 97
    //(int)'A' = 65
    public static HashMap buildMap(){
        HashMap map = new HashMap();
        for(int i = (int)'a'; i < (int)'a' + 26; i++){
            char c = (char) i;
            map.put(c, i - (int) 'a' + 1);
        }
        for(int i = (int)'A'; i < (int)'A' + 26; i++){
            char c = (char) i;
            map.put(c, i - (int) 'A' + 27);
        }
        //System.out.println(map.toString());
        return map;
    }

}
