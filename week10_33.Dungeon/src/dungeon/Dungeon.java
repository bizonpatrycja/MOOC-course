/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author color
 */
public class Dungeon {
    private int length, height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    
    private Scanner reader;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.reader = new Scanner(System.in);
    }
    
    public void run(){
        Vampires vampires = new Vampires();
        vampires.initializeList(this.vampires, this.length, this.height);
        
        int playerX = 0;
        int playerY = 0;
        
        while(true){
            System.out.println("" + this.moves);
            System.out.println("");
            System.out.println("@ " + playerX + " " + playerY);
            for(int i = 0; i < vampires.size(); i++){
                System.out.println("v " + vampires.getVampire(i).getX() + " " + vampires.getVampire(i).getY());
            }
            
            System.out.println("");
            
            //prining the board with player and vampires
            for (int i = 0; i < this.length; i++) {
                boolean flag = false;
                for (int j = 0; j < this.height; j++) {
                    if(j == playerX && i == playerY){
                        System.out.print("@");
                        flag = true;
                    }
                    for(int k = 0; k < vampires.size(); k++){
                        if(j == vampires.getVampire(k).getX() && i == vampires.getVampire(k).getY()){
                            System.out.print("v");
                            flag = true;
                        }
                    }
                    if(flag == false){
                        System.out.print(".");
                    }
                    flag = false;
                }
                System.out.println("");
            }
            System.out.println("");
            
            String move = reader.nextLine();
            
            //if other characters were entered - do not do anything
            if(!move.contains("w") && !move.contains("d") && !move.contains("s") && !move.contains("a")){
                continue;
            }
            
            //move the player
            if(move.contains("s")){
                for(int l = 0; l < move.length(); l++){
                    if(move.charAt(l) == 's'){
                        if(playerY + 1 < this.height){
                            playerY++;
                        }
                    }
                }
            }
            if(move.contains("w")){
                for(int l = 0; l < move.length(); l++){
                    if(move.charAt(l) == 'w'){
                        if(playerY - 1 >= 0){
                            playerY--;
                        }
                    }
                }
            }
            if(move.contains("a")){
                for(int l = 0; l < move.length(); l++){
                    if(move.charAt(l) == 'a'){
                        if(playerX - 1 >= 0){
                            playerX--;
                        }
                    }
                }
            }
            if(move.contains("d")){
                for(int l = 0; l < move.length(); l++){
                    if(move.charAt(l) == 'd'){
                        if(playerX + 1 < this.length){
                            playerX++;
                        }
                    }
                }
            }
            
            //check if any vampire was killed
            if(vampires.isVampireAtPosition(playerX, playerY)){
                vampires.deleteVampire(playerX, playerY);
            }
            
            //change the positions of vampires if vampiresMove is true
            if(this.vampiresMove == true){
                vampires.moveAll(playerX, playerY);
            }
            
            this.moves--;
            
            if(this.moves == 0 && vampires.size() > 0){
                System.out.println("YOU LOSE");
                break;
            }
            else if(vampires.size() == 0){
                System.out.println("YOU WIN");
                break;
            }
            
        }
        
        
    }
}
