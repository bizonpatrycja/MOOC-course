/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class Flight {
    private String planeID;
    private int planeCap;
    private String depCode;
    private String destCode;
    
    public Flight(String planeID, int planeCap, String departureCode, String destinationCode){
        this.planeID = planeID;
        this.planeCap = planeCap;
        this.depCode = departureCode;
        this.destCode = destinationCode;
    }
    
    public String toString(){
        return this.planeID + " (" + this.planeCap + " ppl)" + " (" + this.depCode + "-" + this.destCode + ")";
    }
}
