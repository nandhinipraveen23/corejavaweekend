package day3;

import java.util.Scanner;

public class IfConcepts {

	public static void main(String[] args) {
		int age;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter ur age: ");
		age=s.nextInt();//-1 ,0 ,3454,1
		 
		
		// 7>=18
		if(age>=18)// true or false
		{
			System.out.println("Hi...");
			System.out.println("u r eligible for vote");
		}
		System.out.println("see u");// if the condition is or false
	}

}
