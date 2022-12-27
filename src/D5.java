import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class D5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/D5Input.txt"));
        ArrayList<LinkedList<Character>> ship = buildShip(in);
        in.nextLine();
//        System.out.println(ship);
        while(in.hasNext()){
            int[] instructions = parsInstructions(in.nextLine());
            for(int i = 0; i < instructions[0]; i++){
                char temp = ship.get(instructions[1]).remove();
                ship.get(instructions[2]).addFirst(temp);
            }
            //System.out.println(ship);
        }
//        String answer = "";
//        for(int i = 1; i <= 9; i++){
//            answer += ship.get(i).remove();
//        }
//        System.out.println(answer);
    }

    public static ArrayList<LinkedList<Character>> buildShip(Scanner in){
        ArrayList<LinkedList<Character>> ship = new ArrayList<>();
        for(int i = 0; i <= 9; i++){
            ship.add(new LinkedList<Character>());
        }
        while(true) {
            String line = in.nextLine();
            //System.out.println(line);
            int index = 0;
            for (int i = 1; i < line.length(); i += 4) {
                index++;
                char temp = line.charAt(i);
                if (temp == '1') {
                    //System.out.println(ship);
                    return ship;
                }
                if(temp != ' ')
                    ship.get(index).add(temp);
            }
        }
    }

    public static int[] parsInstructions(String line){
        int[] instructions = new int[3];
        System.out.println(line.length());
        System.out.println(line);
        instructions[0] = Integer.parseInt(line.substring(5,7));
        instructions[1] = Integer.parseInt(line.substring(12,14));
        instructions[2] = Integer.parseInt(line.substring(17));
        return instructions;
    }

}
