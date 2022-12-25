package assignment3Part1;
public class PrimeNumber
{
	//  Please write a java program to find the first 30 prime numbers. Hint : for loop and multiple if-else
	//natural numbers >1
	//#prime number has only factors 1 and the number itself  ,prime has 2 factors
	//# 19 ===>  19*1=19, 1*19=19   so 1 and 19   so 19 is prime number
	//#28  ====>  7*4=28, 4*7=28, 14*2=28, 1*28=28, 1,2,4,7,14,28  so 28  is not a prime number, have more than 2 factors
	//#num=input("enter a number:")  this will not work as num >1 str >int is invalid
	public static void main(String[] args) 
	{	
		int i =0;
		int num =0;

		for (i = 1; i <= 30; i++) 
		{ 
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				System.out.println(i + "  prime number");	
			}
			else
				System.out.println(i + " not a  prime number");
		}

	}
}

