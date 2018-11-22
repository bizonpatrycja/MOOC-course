
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class Jump {
    private int length;
    private int[] votes;
    private int totalPointsForJump;
    
    public Jump(int length, int[] votes){
        this.length = length;
        this.votes = votes;
    }
    
    public int getTotalPointsForJump(){
        Arrays.sort(votes);
        return this.length + votes[1] + votes[2] + votes[3];
    }
    
    public int getJumpsLength(){
        return this.length;
    }
    
    public String toString(){
        return "    length: " + this.length + "\n" + "    judge votes: [" + votes[0] + ", " +votes[1] + ", " +votes[2] + ", " +votes[3] + ", " +votes[4] + "]";
    }
}
