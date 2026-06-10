package day3;

import java.util.Scanner;

public class IfConcepts5 {

	public static void main(String[] args) {
		int age,weight;
	//age>=18 and weight >=50	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur age");
		age=s.nextInt(); 
		System.out.println("Enter ur weight");
		weight=s.nextInt();
		
		
		if(age>=18)
		{
			if(weight>=50)
			{
				
				System.out.println("donate the blood");
			}
			else
			{
				System.out.println("under weight");
			}
		}
		else
		{
			System.out.println("age is not eligible");
		}
		 System.out.println("thank u for accessing"); }

}
