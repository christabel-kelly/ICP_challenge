 /**
 * This program uses the product class to create ten products,
 *  and writes each product to two files(the main file and a backupfile).
 * @author Christabel Kekeli Alormene
 * @param args
 * 
 * @return no return value for the method
 * 
 */

import java.util.Calendar;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TenItems{ // class to create the ten items
    public static void main(String[] args){
        long start = Calendar.getInstance().getTime().getTime(); // time before program is executed
        try{ // trt-catch block to throw any exceptions
        FileWriter fileWriter = new FileWriter("essentials_stock.txt");// creating a file to store the products
        FileWriter fileWriter1 = new FileWriter("backup_essentials_stock.txt"); // creating a back-up file 
        PrintWriter printWriter = null; // initializing  printWriter to null
        PrintWriter printWriter1 = null;

        // creating an output stream for writing to the two files
        printWriter = new PrintWriter(new FileOutputStream("essentials_stock.txt", true)); 
        printWriter1 = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));

        
        Product product1 = new Product("milo", 7, 10); // creating an instance of type Product
        printWriter.print(product1.printItem() + "\n") ; // write the product object to essential_stock
        printWriter1.print(product1.printItem() + "\n") ; // write the product object to backup_essential_stock
        
        Product product2 = new Product("towels", 10, 5);
        printWriter.print(product2.printItem() + "\n");
        printWriter1.print(product2.printItem() + "\n") ;
      
        Product product3 = new Product("books", 20, 4);
        printWriter.print(product3.printItem() + "\n");
        printWriter1.print(product3.printItem() + "\n");
        
        Product product4 = new Product("pencils", 10, 0.50);
        printWriter.print(product4.printItem() + "\n");
        printWriter1.print(product4.printItem() + "\n");
    
        Product product5 = new Product("yogurt", 10, 7);
        printWriter.print(product5.printItem() + "\n");
        printWriter1.print(product5.printItem() + "\n");
    
        Product product6 = new Product("kalyppo", 15, 3);
        printWriter.print(product6.printItem() + "\n");
        printWriter1.print(product6.printItem() + "\n");
    
        Product product7 = new Product("Perfume", 20, 8);
        printWriter.print(product7.printItem() + "\n");
        printWriter1.print(product7.printItem() + "\n");

        Product product8 = new Product("Handkerchiefs", 30, 7);
        printWriter.print(product8.printItem() + "\n");
        printWriter1.print(product8.printItem() + "\n");

        Product product9 = new Product("Pens", 39, 1);
        printWriter.print(product9.printItem()+ "\n") ;
        printWriter1.print(product9.printItem()+ "\n") ;
    
        Product product10 = new Product("Chocolates", 10, 10);
        printWriter.print(product10.printItem() + "\n");
        printWriter1.print(product10.printItem() + "\n");
    
        // closes the streams for both files
        printWriter.close();
        printWriter1.close();
    
      
        }catch(IOException e){ // catches an IOExcpetion 
            e.printStackTrace();
        }
    long end = Calendar.getInstance().getTime().getTime(); // time after program completes execution
    long duration = end - start; // calculation of runtime in milliseconds
	System.out.println("\nRuntime: " + duration + " milliseconds");
    }
}