
public class Purchase {
    private String product;
    private int amount;
    private int unitPtice;
    
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPtice = unitPrice;
    }
    
    public Purchase(String product, int unitPrice){
        this.product = product;
        this.unitPtice = unitPrice;
        this.amount = 1;
    }
    
    public int price(){
        return this.amount*this.unitPtice;
    }
    
    public void increaseAmount(){
        this.amount++;
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
}
