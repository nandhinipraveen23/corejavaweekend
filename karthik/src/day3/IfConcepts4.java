package day3;

import java.util.Scanner;

public class IfConcepts4 {

	public static void main(String[] args) {
		int age,weight;
	//age>=18 and weight >=50	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur age");
		age=s.nextInt(); 
		System.out.println("Enter ur weight");
		weight=s.nextInt();
		
		
		if(age>=18 && weight>=50)
		{
			System.out.println("donate the blood");
		}
		else
		{
			System.out.println("can't donate");
		}
		 System.out.println("thank u for accessing"); }

}
