package assignment3Part1;

import java.util.Scanner;

//4.	Please write a java program to print the binary, octal, hexadecimal form of a given decimal number 
//(example : for the input 10, print 1010(binary), 12 (octal), A (hexa))
public class DecimalToBinOctHexa {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter the decimal number");
		int number=input.nextInt();
		String binary=Integer.toString(number,2); 
		String octal=Integer.toString(number,8);
		String hexa=Integer.toString(number,16);
		System.out.println("converting decimal number to Binary format " + binary);
		System.out.println("converting decimal number to octal format " + octal);
		System.out.println("converting decimal number to hexa format " + hexa.toUpperCase());
	}

}
