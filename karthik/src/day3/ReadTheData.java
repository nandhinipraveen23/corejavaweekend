package day3;

import java.util.Scanner;

public class ReadTheData {

	public static void main(String[] args) {
		 String name;
		// to read the string 
		 //if its one word=>  next()
		 // if its morethan one word =>nextList()
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter the name: ");
		 //name=s.next();
		 name=s.nextLine();
		 System.out.println("my name is: "+name );
		 

	}

}
