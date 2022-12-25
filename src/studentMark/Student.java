package studentMark;
import java.util.Scanner;

public class Student {
	int englishMark;
	int mathMark;
	int scienceMark;
	int socialMark;
	int sum;
	int average;
	int outputSum;
	int outputAverage;
    public int totalMarks(String name)
    {
    	sum=englishMark+mathMark+scienceMark+socialMark;
    	System.out.println("Total marks of the student: "+ name+":"+sum);
		return sum;
    }
    public int totalAverage(String name)
    {
	    average=sum/4;
	    System.out.println("Average of the student: "+name +":"+average);
		return average;
    }
    
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//************ METHOD 1. GIVING INPUT THROUGH CODE: ***********
		System.out.println("calculating marks for student 1"); 
		Student student1=new Student();
		student1.englishMark=60;
		student1.mathMark=80;
		student1.scienceMark=50;
		student1.socialMark=70;
		//int outputSum=student1.totalMarks();
		//int outputAverage=student1.totalAverage();
		//System.out.println("calculating sum for student 1:" + outputSum); 
		//System.out.println("calculating average for student 1:"  +outputAverage); 
		student1.totalMarks("reka");
		student1.totalAverage("reka");
		
		System.out.println("calculating marks for student 2");
		Student student2=new Student();
		student2.englishMark=50;
		student2.mathMark=30;
		student2.scienceMark=80; 
		student2.socialMark=100;
		student2.totalMarks("nv");
		student2.totalAverage("nv");
		
		System.out.println("calculating marks for student 3"); 
		Student student3=new Student();
		student3.englishMark=40;
		student3.mathMark=30;
		student3.scienceMark=90;
		student3.socialMark=70;
		student3.totalMarks("raja");
		student3.totalAverage("raja");
		
		System.out.println("calculating marks for student 4"); 
		Student student4=new Student();
		student4.englishMark=90;
		student4.mathMark=80;
		student4.scienceMark=70; 
		student4.socialMark=60;
		student4.totalMarks("rnvr");
		student4.totalAverage("rnvr");
		
		//**************** Method 2. ENTERING INPUT DYNAMICALLY USING SCANNER ******
		
		for (int i=1;i<=4;i++)
		{
		Scanner input=new Scanner(System.in);
		//System.in is a standard input stream  
		System.out.println("Entering marks of the student:" +i);
		System.out.print("Enter englishMark: ");  
		int englishMark= input.nextInt();  
		System.out.print("Enter mathMark: ");  
		int mathMark= input.nextInt();  
		System.out.print("Enter scienceMark: ");  
		int scienceMark= input.nextInt();  
		System.out.print("Enter socialMark: ");  
		int socialMark= input.nextInt();
		System.out.println("calculating total and average mark of the student" + i);
		int total=englishMark+mathMark+scienceMark+socialMark;
		int average=total/4;
		System.out.println("Total marks of the student: "+ i  +total);
		System.out.println("Average marks of the student: "+i+ average);
		}
	}
}
