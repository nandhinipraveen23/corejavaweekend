package day4;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		  String name;
		  String fruit = new String();
		  
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the name: ");
		  name=s.nextLine();
		  System.out.println("Enter the fruit name: ");
		  fruit=s.nextLine();

		  System.out.println(name);
		  System.out.println(fruit);

	}

}
