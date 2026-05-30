package day1;

public class IdentifiersExample5 {
	
public static void main(String[] args)
{
	  
	   byte a=10;
	   byte b=a;
	   byte c=127;
	   //type mismatch: cannot convert from int to byte
	   //we can't store 4byte of data into 1 byte
	   byte d=(byte)129;//(129 -128 =1 difference res-128 = result) 5-4=1 , 4-5= -1
	   System.out.println("a="+a);
	   System.out.println("b="+b);
	   System.out.println("c="+c);
	   System.out.println("d="+d);
}
	
}
