package assignment3Part1;
import java.util.Scanner;

public class FibonacciSeries {
	//3. Please write a java program to print the nth fibonacci series number 
	//(example : 9th fibonacci series is 34) Hint : use simple if condition with recursive function call
	//	The Fibonacci numbers are the numbers in the following integer sequence.
	//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the no to find the fibonacci:"); 
	FibonacciSeries execute=new FibonacciSeries();
	int number =input.nextInt();
	System.out.println("fibonacii series for :" + number);
	int n1=0;
	int n2=1; 
	int sum=0; 
	System.out.print(n1+" , "+n2); 
	for (int i=2; i<=number;i++)
	{
		sum=n1+n2;
		System.out.print(" "+sum+" ");
		n1=n2;
		n2=sum;
	}
	
}
}