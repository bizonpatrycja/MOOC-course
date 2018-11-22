
import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class JumpingRecord {
    private ArrayList<Jumper> round;
    
    public JumpingRecord(){
        this.round = new ArrayList<Jumper>();
    }
    
    public void addJumpers(String name){
        this.round.add(new Jumper(name));
    }
    
    public void sortJumpers(){
        SortJumpers suitSorter = new SortJumpers();
        Collections.sort(this.round, suitSorter);
        Collections.reverse(this.round);
    }
    
    public void addJump(){
        for(Jumper j : this.round){
            j.addJump();
        }
    }
    
    public String printJumpers(){
        Collections.reverse(this.round);
        int i = 1;
        String result = "";
        for(Jumper j : this.round){
            result += ("  " + i + ". " + j.getName() + " (" + j.getNumberOfPoints() + " points)\n");
            i++;
        }
        
        return result;
    }
    
    public String printFinalResult(){
        int i = 1;
        String result = "";
        for(Jumper j : this.round){
            result += (i + "           " + j.getName() + " (" + j.getNumberOfPoints() + " points)\n            jump lengths: " + j.getJumpsLengths() + "\n");
            i++;
        }
        
        return result;
    }
    
    public String printResultsOfRound(){
        String result = "";
        for(Jumper j : this.round){
            result += "  " + j.getName() + "\n" + j.printLastJump() + "\n";
        }
        
        return result;
    }
}
