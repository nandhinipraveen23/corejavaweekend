package day4;

import java.util.Scanner;

public class StringExample5 {

	public static void main(String[] args) {
		 
		  String[] fruits= new String[3] ;
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the fruits name: ");
		 for(int i=0;i<3;i++)
		  {
			  fruits[i]=s.nextLine();
		  }
		 
		 
		 System.out.println("the fruits are: ");
		  for(int i=0;i<3;i++)
		  {
			  System.out.println(fruits[i]);
		  }
		   
	}

}
