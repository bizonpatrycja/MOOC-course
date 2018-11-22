
import java.util.Comparator;
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
public class SortAddressesByName implements Comparator<Person>{
    
    public int compare(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}
