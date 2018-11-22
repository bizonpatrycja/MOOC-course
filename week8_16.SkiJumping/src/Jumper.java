
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
public class Jumper {
    private String name;
    private ArrayList<Jump> jumps;
    private int[] votes;
    private int totalPoints;
    
    public Jumper(String name){
        this.name = name;
        this.jumps = new ArrayList<Jump>();
        this.votes = new int[5];
        this.totalPoints = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addJump(){
        int length = (int)(Math.random() * ((120 - 60) + 1)) + 60;
        for(int i = 0; i < 5; i++){
            this.votes[i] = (int)(Math.random() * ((20 - 10) + 1)) + 10;
        }
        Jump j = new Jump(length, this.votes);
        this.jumps.add(j);
        this.totalPoints += j.getTotalPointsForJump();
    }
    
    public String printLastJump(){
        return "" + this.jumps.get(this.jumps.size() - 1);
    }
    
    public int getLastJumpsLength(){
        return this.jumps.get(this.jumps.size() - 1).getJumpsLength();
    }
    
    public int getNumberOfPoints(){
        return this.totalPoints;
    }
    
    public String getJumpsLengths(){
        int[] playersJumps = new int[this.jumps.size()];
        String lengths = "";
        for(Jump j : this.jumps){
            lengths += j.getJumpsLength();
            lengths += " m,";
        }
        lengths.substring(0, lengths.length() - 2); //delete last comma
        
        return lengths;
    }
    
    public String toString(){
        return this.name + " (" + this.getNumberOfPoints() + " points)\n            jump lengths: " + getJumpsLengths();
    }
}
