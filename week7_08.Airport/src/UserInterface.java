
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class UserInterface {
    private Scanner input;
    private FlightsList listOfFlights;
    private PlanesList listOfPlanes;
    
    public UserInterface(Scanner reader){
        this.input = reader;
        this.listOfFlights = new FlightsList();
        this.listOfPlanes = new PlanesList();
    }
    
    public void start(){
        System.out.println("Airport panel\n" +
                "--------------------\n");
        
        while(true){
            System.out.print("Choose operation:\n" +
                "[1] Add airplane\n" +
                "[2] Add flight\n" +
                "[x] Exit\n");
        
            String action = input.nextLine();

            if(action.equals("1")){
                System.out.print("Give plane ID: ");
                String id = this.input.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = this.input.nextInt();
                
                Plane p = new Plane(id,capacity);
                this.listOfPlanes.addPlane(p);
            }
            else if(action.equals("2")){
                System.out.print("Give plane ID: ");
                String id = this.input.nextLine();
                System.out.print("Give departure airport code: ");
                String depCode = this.input.nextLine();
                System.out.print("Give destination airport code: ");
                String destCode = this.input.nextLine();
                
                Flight f = new Flight(id, this.listOfPlanes.getPlane(id).getCapacity(),depCode, destCode);
                this.listOfFlights.addFlight(f);
            }
            else if(action.equals("x")){
                break;
            }
        }
        
        flightService();
    }
    
    public void flightService(){
        System.out.println("\nFlight service\n" +
                "------------\n");
        
        while(true){
            System.out.print("Choose operation:\n" +
                "[1] Print planes\n" +
                "[2] Print flights\n" +
                "[3] Print plane info\n" +
                "[x] Quit\n");
        
            String action = this.input.nextLine();

            if(action.equals("1")){
                System.out.println(this.listOfPlanes.printList());
            }
            else if(action.equals("2")){
                System.out.println(this.listOfFlights.printList());
            }
            else if(action.equals("3")){
                System.out.print("Give plane ID: ");
                String id = this.input.nextLine();
                System.out.println(this.listOfPlanes.getPlane(id).toString());
            }
            else if(action.equals("x")){
                break;
            }
        }
    }
}
