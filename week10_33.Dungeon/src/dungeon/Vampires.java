/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author color
 */
public class Vampires {
    private ArrayList<Vampire> vampires;
    private int length, height;
    
    public Vampires(){
        this.vampires = new ArrayList<Vampire>();
    }
    
    public Vampire getVampire(int index){
        return this.vampires.get(index);
    }
    
    public int size(){
        return this.vampires.size();
    }
    
    public boolean isVampireAtPosition(int x, int y){
        boolean output = false;
        for(Vampire v : this.vampires){
            if(v.getX() == x && v.getY() == y){
                output = true;
                break;
            }
        }
        
        return output;
    }
    
    public void deleteVampire(int x, int y){
        ArrayList<Vampire> toBeRemoved = new ArrayList<Vampire>();
        for(Vampire v : this.vampires){
            if(v.getX() == x && v.getY() == y){
                toBeRemoved.add(v);
            }
        }
        
        this.vampires.removeAll(toBeRemoved);
    }
    
    public void moveAll(int playerX, int playerY){
        ArrayList<Vampire> vampiresTemp = new ArrayList<Vampire>();
        for (int i = 0; i < this.vampires.size(); i++) {
            Vampire v = new Vampire();
            int x, y;
            
            //choosing random unique position of vampire
            while(true){
                boolean flag = false;
                x = new Random().nextInt(this.length);
                y = new Random().nextInt(this.height);
                v.setXY(x, y);
                
                for(Vampire vam : vampiresTemp){
                    if((vam.getX() == x && vam.getY() == y) || (x == playerX && y == playerY)){
                        flag = true;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            
            vampiresTemp.add(v);
        }
        
        //updating positions in original vampites ArrayList
        for(int i = 0; i < this.vampires.size(); i++){
            this.vampires.set(i, vampiresTemp.get(i));
        }
    }
    
    public void initializeList(int vampires, int length, int height){
        this.length = length;
        this.height = height;
        for (int i = 0; i < vampires; i++) {
            Vampire v = new Vampire();
            int x, y;
            
            //choosing random unique position of vampire
            while(true){
                boolean flag = false;
                x = new Random().nextInt(this.length);
                y = new Random().nextInt(this.height);
                v.setXY(x, y);
                
                for(Vampire vam : this.vampires){
                    if((vam.getX() == x && vam.getY() == y) || (x == 0 && y == 0)){
                        flag = true;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            
            this.vampires.add(v);
        }
    }
    
    public String toString(){
        String output = "Vampires' positions:\n";
        for(Vampire v : this.vampires){
            output += "" + v.getX() + ", " + v.getY() + "\n";
        }
        
        return output;
    }
}
