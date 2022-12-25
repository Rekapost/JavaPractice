package assignment3Part1;
import java.util.Scanner;

public class DaysOfTheWeek {
//    1.	Please write a java program to print the day of the week when number is given (example : 1 means Sunday should be printed) - Hint :  Switch case
	public static void main(String[] args)
	{ 
	int maxAttempts=4; 
		Scanner input=new Scanner(System.in);
		for(int i = 1;i<=maxAttempts;i++) {
		System.out.println("enter the no to get the day of the week");
		int dayOfTheWeek = input.nextInt();	
			switch (dayOfTheWeek) {
			
			case 1: { 
				System.out.println(" today is monday");
				break;
			} 
			case 2: {
				System.out.println(" today is tuesday");
				break;
			}
			case 3: {
				System.out.println(" today is wednesday");
				break;
			}
			case 4: {
				System.out.println(" today is thursday");
				break;
			}
			case 5: {
				System.out.println(" today is friday");
				break;
			}
			case 6: {
				System.out.println(" today is saturday");
				break;
			}
			default:
				System.out.println(" today is sunday");		
				break;
			}
		}
		input.close();
	}
}

