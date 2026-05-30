package day1;

public class IdentifiersExample7 {
	
public static void main(String[] args)
{
	 
	  short a=32767;
//type mismatch: cannot convert from int to short
	  //can't store 4byte data into 2byte
	  short b=(short)32768;
	   System.out.println("a="+a);
	   System.out.println("b="+b);
}
	
}
