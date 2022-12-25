package assignment3Part1;
public class Factors {
	//	7.	Please write a java program to print the factors and total number of factors of given number
	//	(example : for the input 60, we have 12 factors which are 1 2 3 4 5 6 10 12 15 20 30 60)
	public static void main(String[] args) {
		int number = 60; 		
		for (int i = 1;i<=number;i++)
		{
			if (number%i==0)
				System.out.println("  factor of the " +number+ " is " + i );
		}

	}
}
