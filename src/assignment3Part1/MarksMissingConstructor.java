package assignment3Part1;
public class MarksMissingConstructor {
//	Please write a java program to calculate sum & average  of given 4 marks via constructor,
//	if three or two marks only passed from main method, then keep the missing value(s) as 35)
//	- Hint - multiple parameterized constructor
	int sum;
	int avg;
	int mark1;
	int mark2;
	int mark3;
	int mark4;
	public MarksMissingConstructor(int i, int j, int k, int l)	{
		mark1=i;
		mark2=j;
		mark3=k;
		mark4=l;
	}
	public MarksMissingConstructor(int i, int j, int k) {
		mark1=i;
		mark2=j;
		mark3=k;
		mark4=35;
	}
	public MarksMissingConstructor(int i, int j) {
		mark1=i;
		mark2=j;
		mark3=35;
		mark4=35;
	}
	public MarksMissingConstructor(int i) {
		mark1=i;
		mark2=35;
		mark3=35;
		mark4=35;
	}
	public int sumMark(String name) {
		sum= mark1+mark2+mark3+mark4;
		System.out.println(" sum of the marks for the student " + name+" :" + sum);
		return sum;
		}
	public int average(String name) { 
		avg=sum/4;
		System.out.println(" average  of all the marks for the student "+ name +" :"  + avg );
		return avg;	
		}
	public static void main(String[] args) {
		
		MarksMissingConstructor student1=new MarksMissingConstructor(10,20,30,30);
		System.out.println(" calculating for the student1:");
		student1.sumMark("Reka");
		student1.average("Reka");
		MarksMissingConstructor student2=new MarksMissingConstructor(10,20,30);
		System.out.println(" calculating for the student2:");
		student2.sumMark("Raja");
		student2.average("Raja");
		MarksMissingConstructor student3=new MarksMissingConstructor(10,20);
		System.out.println(" calculating for the student3:");
		student3.sumMark("Hari");
		student3.average("Hari");
		MarksMissingConstructor student4=new MarksMissingConstructor(10);
		System.out.println(" calculating for the student4:");
		student4.sumMark("Darsh");
		student4.average("Darsh");
	}


}
