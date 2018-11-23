
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.owners.get(plate) == null){
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if(this.owners.get(plate) == null){
            return null;
        }
        
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.get(plate) == null){
            return false;
        }
        
        this.owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate key : this.owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        ArrayList<String> names = new ArrayList<String>();
        
        for (RegistrationPlate key : this.owners.keySet()){
            if(!names.contains(this.owners.get(key))){
                System.out.println(this.owners.get(key));
                names.add(this.owners.get(key));
            }
        }
    }
}
