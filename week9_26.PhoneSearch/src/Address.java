/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win8
 */
class Address {
    private String street;
    private String city;
    
    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }
    
    public String toString(){
        return this.street + " " + this.city;
    }
}
