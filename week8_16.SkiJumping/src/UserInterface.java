
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
    private Scanner reader;
    private Tournament tournament;
    private JumpingRecord jumpers;
    
    public UserInterface(Scanner reader, Tournament tournament){
        this.reader = reader;
        this.tournament = tournament;
        this.jumpers =  new JumpingRecord();
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        boolean flag = false;
        
        while(true){
            System.out.print("  Participant name: ");
            String input = reader.nextLine();
            if(!input.isEmpty()){
                this.jumpers.addJumpers(input);
            }
            if(input.isEmpty()){
                System.out.println("\nThe tournament begins!\n");
                
                while(true){
                    System.out.print("Write \"jump\" to jump; otherwise you quit: ");
                    String input2 = reader.nextLine();
                    if(input2.equals("jump")){
                        System.out.println("");
                        this.tournament.addRound(this.jumpers);
                        System.out.println("Round " + this.tournament.getNumOfRounds() + "\n\nJumping order:");
                        System.out.println(this.jumpers.printJumpers());
                        System.out.println("Results of round " + this.tournament.getNumOfRounds());
                        this.jumpers.addJump();
                        System.out.print(this.jumpers.printResultsOfRound() + "\n");
                        this.jumpers.sortJumpers();
                    }
                    if(input2.equals("quit")){
                        System.out.println("\nThanks!\n\nTournament results:\nPosition    Name");
                        System.out.println(this.jumpers.printFinalResult());
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == true){
                break;
            }
        }
    }
}
