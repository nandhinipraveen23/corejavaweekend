package day3;

import java.util.Scanner;

public class IfConcepts3 {

	public static void main(String[] args) {
		int choice;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur choice:(1. biscut 2. cooldrink 3. chocolate) ");
		choice=s.nextInt(); 
		 
	 //     4==1
		if(choice ==1) 
		{
			System.out.println("Hi...");
			System.out.println("take ur biscut");
		}     //4==2
		else if(choice==2)
		{
			System.out.println("take cool drink");
		}//     4==3
		else if(choice==3)
		{
			System.out.println("take chocolate");
		}
		else
		{
			System.out.println("no item found");
		}
		System.out.println("thank u for accessing"); }

}
