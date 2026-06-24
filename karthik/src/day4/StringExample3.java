package day4;

import java.util.Scanner;

public class StringExample3 {

	public static void main(String[] args) {
		//             0123456
		  String name="karthik";   //012345
		  String fruit = new String("orange");
		  String[] fruits= new String[3];
		  fruits[0]="apple";
		  fruits[1]="orange";
		  fruits[2]="mango";
		  
		  System.out.println(name.equals(fruit));//comapre both values are same
		  System.out.println(name.charAt(5));
		  System.out.println(fruit.charAt(4));// it bring given position element
		  System.out.println(name.concat(fruit));// join both words
		  System.out.println(name.contains("thk"));// it will check the give word or character is available or not
		  System.out.println(name.endsWith("ik"));//checks the ending character or words
		  System.out.println(name.equalsIgnoreCase("KARTHIK"));
		  System.out.println(fruit.indexOf("i"));// it will return the index
		 
		  
		  for(int i=0;i<3;i++)
		  {
			  System.out.print(fruits[i]);
		  }
		   
	}

}
