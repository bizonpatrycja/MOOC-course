
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
public class Tournament {
    private ArrayList<JumpingRecord> tournament;
    
    public Tournament(){
        this.tournament = new ArrayList<JumpingRecord>();
    }
    
    public void addRound(JumpingRecord round){
        tournament.add(round);
    }
    
    public int getNumOfRounds(){
        return this.tournament.size();
    }
}
