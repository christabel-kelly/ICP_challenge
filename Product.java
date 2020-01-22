 /**
 * This program creates a class for the product object.
 * @author Christabel Kekeli Alormene
 * @param 
 * String item, int quantity, double price
 * 
 * @return no return value for the method
 * 
 */
import java.util.Scanner;

public class Product{
    private String item; // instance variables for the product object
    private int quantity;
    private double price;

    public Product(String item, int quantity, double price){ // constructor for the class
        this.item = item;
        this.quantity = quantity;
        this.price = price;

    }
    // creating setters for each instance variable
    public void setItem(String name){
        this.item = name;
    }
    public void setQuantity(int qty){
        this.quantity = qty;
    }
    public void setPrice(int pr){
        this.price = pr;
    }
    // creating getters for each instance variable
    public String getItem(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    // this method returns the item, its price and quantity
    public String printItem(){
        return this.getItem() + " " + this.getQuantity() + " " + "GHC " + this.getPrice() + " ";
    }
}
	
