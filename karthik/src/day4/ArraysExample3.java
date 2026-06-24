package day4;

import java.util.Scanner;

public class ArraysExample3 {

	public static void main(String[] args) {
		 int a[] = new int[3];
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("enter the nos");
 
		 
		 for ( int i=0;i<3;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 
		 System.out.println("the ans are:" );
		 for ( int i=0;i<3;i++)
		 {
			 System.out.println(a[i]);
		 }
	 

	}

}
