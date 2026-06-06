package day2;
import java.util.Scanner;
public class Operatores7 {

	public static void main(String[] args) {
	
		//read its a object
		Scanner read = new Scanner(System.in);
		/*
		 * byte => nextByte()
		 * short => nextShort()
		 * int => nextInt()
		 * long => nextLong()
		 */
		 int age,weight;
		 boolean d;
		 System.out.println("Enter the age: ");
		 age =read.nextInt();
		 System.out.println("Enter the weight: ");
		 weight = read.nextInt(); 
		 
		 //12>=18 &&  70>=50
		d= age>=18 && weight>=50;
		System.out.println(d);
	 

	}

}
