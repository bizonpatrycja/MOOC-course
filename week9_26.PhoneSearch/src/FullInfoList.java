
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
public class FullInfoList {
    private ArrayList<Person> fullInfo;
    
    public FullInfoList(){
        this.fullInfo = new ArrayList<Person>();
    }
    
    public void addPhoneNum(String name, String number){
        boolean flag = false;
        for(Person p : this.fullInfo){
            if(p.getName().equals(name)){
                p.addPhoneNumber(number);
                flag = true;
            }
        }
        if(flag == false){
            this.fullInfo.add(new Person(name));
            for(Person p : this.fullInfo){
                if(p.getName().equals(name)){
                    p.addPhoneNumber(number);
                }
            }
        }
    }
    
    public List<String> searchNumByPerson(String name){
        for(Person p : this.fullInfo){
            if(p.getName().equals(name)){
                return p.getPhoneNumbers();
            }
        }
        return null;
    }
    
    public String searchNameByNumber(String number){
        for(Person p : this.fullInfo){
            for(String n : p.getPhoneNumbers()){
                if(n.equals(number)){
                    return p.getName();
                }
            }
        }
        return null;
    }
    
    public void addAddress(String name, String address){
        boolean flag = false;
        for(Person p : this.fullInfo){
            if(p.getName().equals(name)){
                p.addAddress(address);
                flag = true;
            }
        }
        if(flag == false){
            this.fullInfo.add(new Person(name));
            for(Person p : this.fullInfo){
                if(p.getName().equals(name)){
                    p.addAddress(address);
                }
            }
        }
    }
    
    public String getAddressAndNum(String name){
        for(Person p : this.fullInfo){
            if(p.getName().equals(name)){
                return p.toString();
            }
        }
        return "  not found";
    }
    
    public void remove(String name){
        for(int i = 0; i < this.fullInfo.size(); i++){
            if(this.fullInfo.get(i).getName().equals(name)){
                this.fullInfo.remove(i);
            }
        }
    }
    
    public String filteredSearch(String keyword){
        String output = "";
        sortList();
        for(Person p : this.fullInfo){
            boolean flag = false;
            if(p.getName().contains(keyword)){
                flag = true;
            }
            else{
                for(String a : p.getAddresses()){
                    if(a.contains(keyword)){
                        flag = true;
                    }
                }
            }
            if(flag == true){
                output = output + " " + p.getName() + "\n";
                output += p.toString();
                flag = false;
            }
        }
        if(output.equals("")){
            return " keyword not found";
        }
        return output;
    }
    
    public void sortList(){
        SortAddressesByName suitSorter = new SortAddressesByName();
        Collections.sort(this.fullInfo, suitSorter);
    }
}
