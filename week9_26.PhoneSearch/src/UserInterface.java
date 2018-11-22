
import java.util.List;
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
    private FullInfoList listOfAllPeople;
    //private Record record;
    
    public UserInterface(Scanner reader, FullInfoList list){
        this.reader = reader;
        this.listOfAllPeople = list;
        //this.record = record;
    }
    
    public void start(){
        System.out.println("phone search\navailable operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
        
        while(true){
            System.out.print("\ncommand: ");
            
            String input = reader.nextLine();
            
            if(input.equals("1")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                
                this.listOfAllPeople.addPhoneNum(name, number);
            }
            else if(input.equals("2")){
                System.out.print("whose number: ");
                String name = reader.nextLine();
                
                List<String> numbers = this.listOfAllPeople.searchNumByPerson(name);
                
                try{
                    if(numbers.isEmpty()){
                        System.out.println("  not found");
                    }
                    else{
                        for(String n : numbers){
                            System.out.println(" " + n);
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("  not found");
                }
                
            }
            else if(input.equals("3")){
                System.out.print("number: ");
                String number = reader.nextLine();
                String name = this.listOfAllPeople.searchNameByNumber(number);
                try{
                    if(name.isEmpty()){
                        System.out.println(" not found");
                    }
                    else{
                        System.out.println(" " + name);
                    }
                }
                catch(Exception e){
                    System.out.println("  not found");
                }
                
            }
            else if(input.equals("4")){
                System.out.print("whose address: ");
                String name = reader.nextLine();
                System.out.print("street: ");
                String street = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                
                this.listOfAllPeople.addAddress(name, street + " " + city);
            }
            else if(input.equals("5")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                
                System.out.println(this.listOfAllPeople.getAddressAndNum(name));
            }
            else if(input.equals("6")){
                System.out.print("whose information: ");
                String name = reader.nextLine();
                
                this.listOfAllPeople.remove(name);
            }
            else if(input.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String keyword = reader.nextLine();
                
                System.out.println(this.listOfAllPeople.filteredSearch(keyword));
            }
            else if(input.equals("x")){
                break;
            }
        }
        
    }
}
