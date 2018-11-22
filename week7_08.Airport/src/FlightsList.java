
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class FlightsList {
    private ArrayList<Flight> flightsList;
    
    public FlightsList(){
        this.flightsList = new ArrayList<Flight>();
    }
    
    public void addFlight(Flight flight){
        this.flightsList.add(flight);
    }
    
    public String printList(){
        String output = "";
        for(Flight f : this.flightsList){
            output += f.toString();
            output += "\n";
        }
        
        return output;
    }
}
