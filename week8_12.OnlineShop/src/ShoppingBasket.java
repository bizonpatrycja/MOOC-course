
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> list;
    
    public ShoppingBasket(){
        this.list = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.list.containsKey(product)){
            this.list.get(product).increaseAmount();
        }
        else{
            this.list.put(product, new Purchase(product, price));
        }
    }
    
    public int price(){
        int price = 0;
        for(String p : this.list.keySet()){
            price += this.list.get(p).price();
        }
        
        return price;
    }
    
    public void print(){
        for(String p : this.list.keySet()){
            System.out.println(this.list.get(p));
        }
    }
}
