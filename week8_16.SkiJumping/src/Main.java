
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Tournament skiJumping = new Tournament();

        UserInterface ui = new UserInterface(reader, skiJumping);
        ui.start();
        
    }
}
