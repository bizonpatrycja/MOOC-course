
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class Person {
    private String name;
    private List<String> phoneNumbers;
    private List<String> addresses;
    
    public Person(String name){
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
        this.addresses = new ArrayList<String>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPhoneNumber(String number){
        this.phoneNumbers.add(number);
    }
    
    public void addAddress(String address){
        this.addresses.add(address);
    }
    
    public List<String> getPhoneNumbers(){
        return this.phoneNumbers;
    }
    
    public List<String> getAddresses(){
        return this.addresses;
    }
    
    public String toString(){
        String s = "";
        if(this.addresses.isEmpty()){
            s += "  address unknown\n";
        }
        else{
            s += "  address: ";
            for(String a : this.addresses){
                s += a + "\n";
            }
        }
        
        if(this.phoneNumbers.isEmpty()){
            s += "  phone number not found";
        }
        else{
            s += "  phone numbers:\n";
            for(String n : this.phoneNumbers){
                s += "   " + n + "\n";
            }
        }
        
        return s;
    }
}
