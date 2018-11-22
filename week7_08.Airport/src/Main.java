
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
//        String inputManual = "1\n"  + "HA-LOL\n" + "42\n" +
//                "1\n"  + "G-OWAC\n" + "101\n" +
//                "2\n"  + "G-OWAC\n" + "JFK\n" + "BAL" +
//                "2\n"  + "HA-LOL\n" + "HEL\n" + "BAL" +
//                "x" +
//                "1" + "2" + "3" + "G-OWAC" + "x";
        
        Scanner input = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(input);
        
        ui.start();
    }
}
