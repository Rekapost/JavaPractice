package assignment3Part1;
import java.util.Scanner;

public class LeapYear { 
	//2.	Please write a java program to print the leap years between 2000 and 2100 - Hint : for loop and multiple if-else 
		public static void main(String[] args) {

				for (int year=2000; year<=2100; year++)
				{ 
				if (year%4==0)
				{
					System.out.println(year +" is leap year");
				}
				else
				{
				System.out.println(  year +"  is not a leap year");	
				}
				 
				}
			}	
	}
		
		

