package day4;

import java.util.Scanner;

public class ArraysExample4 {

	public static void main(String[] args) {
		 int a[] = new int[3];
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("enter the nos");
		 int sum=0;
		 
		 for ( int i=0;i<3;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 
		  
		 for ( int i=0;i<3;i++)
		 {
			 sum=sum+a[i];
		 }
	 System.out.println("tot ans"+sum);

	}

}
