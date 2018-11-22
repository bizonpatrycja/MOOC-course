
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FullInfoList list = new FullInfoList();
        UserInterface ui = new UserInterface(reader, list);
        ui.start();
    }
}
