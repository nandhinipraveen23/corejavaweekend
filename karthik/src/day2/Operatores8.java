package day2;
import java.util.Scanner;
public class Operatores8 {

	public static void main(String[] args) {
	 
		Scanner read = new Scanner(System.in);
		/*
		 * byte => nextByte()
		 * short => nextShort()
		 * int => nextInt()
		 * long => nextLong()
		 */
		byte age,weight;
		 boolean d;
		 System.out.println("Enter the age: ");
		 age = read.nextByte();
		 System.out.println("Enter the weight: ");
		 weight = read.nextByte(); 
		 
		 //12>=18 &&  70>=50
		d= age>=18 && weight>=50;
		System.out.println(d);
	 

	}

}
