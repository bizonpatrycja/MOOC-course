
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
public class PlanesList {
    private ArrayList<Plane> planesList;
    
    public PlanesList(){
        this.planesList = new ArrayList<Plane>();
    }
    
    public void addPlane(Plane plane){
        this.planesList.add(plane);
    }
    
    public Plane getPlane(String id){
        for(Plane p : this.planesList){
            if(p.getID().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    public String printList(){
        String output = "";
        for(Plane p : this.planesList){
            output += p.toString();
            output += "\n";
        }
        return output;
    }
}
