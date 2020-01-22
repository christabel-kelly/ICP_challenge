 /**
 * This program adds a new item to the stock available and 
 * displays all the products 
 * @author Christabel Kekeli Alormene
 * 
 * @param args
 * @throws InputMismatchException
 */

import java.util.Calendar;
import java.util.Scanner;
import java.util.InputMismatchException;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class InputDataScanner {

	/**
	 * Constructor
	 */
	public InputDataScanner() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) 
	{
		//A new scanner class
		long start = Calendar.getInstance().getTime().getTime(); // time before program is executed
		try{ //try-catch block to throw exceptions
		System.out.println("Creating a new item");
		
		 // receives item's name as input
		Scanner itm = new Scanner(System.in);
		System.out.println("Enter the product name");
		String item= itm.nextLine();

		// receives item's quantity as input
		Scanner qty = new Scanner(System.in); 
		System.out.println("Enter the quantity");
		int quantity= qty.nextInt();
		
		// receives item's price as input
		Scanner pr = new Scanner(System.in); 
		System.out.println("Enter the price");
		double price= itm.nextDouble();

		// creates a new product using input given by user
		Product newItem= new Product(item, quantity, price );
		newItem.printItem();

		   
		FileWriter fileWriter = new FileWriter("essentials_stock.txt", true); //Set true for append mode
		FileWriter fileWriter1 = new FileWriter("backup_essentials_stock.txt", true);
		PrintWriter printWriter = new PrintWriter(fileWriter); // creating an instance printWriter
		PrintWriter printWriter1 = new PrintWriter(fileWriter1);

		printWriter.print(newItem.printItem() + "\n");  // write the new product to essential_stock
		printWriter1.print(newItem.printItem() + "\n");   // write the new product to backup_essential_stock

		//closes the output stream for both files
		printWriter.close();
		printWriter1.close();

		// read from file and display all items in the file
		BufferedReader br = new BufferedReader(new FileReader("essentials_stock.txt"));
        String line;
        while ((line = br.readLine()) != null) {
          System.out.println(line);
        }
	}catch (IOException e) { // catch IOException
		e.printStackTrace();
	}catch (InputMismatchException e){ // catch input mismatch exception
		System.out.println("\nPlease enter the right input");

	}
	long end = Calendar.getInstance().getTime().getTime(); // time after program completes execution
    long duration = end - start; // calculation of runtime in milliseconds
	System.out.println("\nRuntime: " + duration + " milliseconds");
}
}