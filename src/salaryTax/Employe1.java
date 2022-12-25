package salaryTax;
import java.util.Scanner;
public class Employe1 {

	double basicPay;
	double boa;
	double peformanceBonus;
	double monthSal;
	double pfMoney;
	double monthly_Taxable;
	double yearly_Taxable;
	double yearly_Tax;
	double monthly_Tax;
	double take_Home; 
	double tax_Rate;
	int employee_level;
	double bonus;
	double exist_tax_Rate;
	double new_tax_Rate;
	double yearly_exist_Tax;
	double yearly_new_Tax ;
	double basic_Allowance;
	double eTAX;
	double nTAX;
	
	public double empLevel(double employee_level) {
		if (employee_level==1)
		{ bonus =2000;} 
		else if(employee_level==2 )
		{bonus=2500;}
		else if(employee_level==3)
		{bonus=3000;}
		else if(employee_level==4)
		{bonus=3500;}
		return bonus;
	}

	public double monthlySalary(double basicPay,double basic_Allowance) { 
		monthSal=basicPay+basic_Allowance+bonus;
		System.out.println("monthly salary of employee:" + monthSal);
		return monthSal;
	}

	public double pf(double basicPay) {
		pfMoney=basicPay*0.12;
		System.out.println("pf of employee:" + pfMoney);
		return pfMoney;
	}

	public double monthlyTaxable() {
		monthly_Taxable=monthSal-pfMoney;
		System.out.println("monthly Taxable from salary:" + monthly_Taxable);
		return monthly_Taxable;
	}

	public double yearlyTaxable() {
		yearly_Taxable=monthly_Taxable*12;
		System.out.println("Yearly Taxable from salary::" + yearly_Taxable);
		return yearly_Taxable;		
	}

	public  double taxCalculation() {
		if(yearly_Taxable<=250000) { 
			System.out.println(" no tax");
		}
		else if( (yearly_Taxable>250000) && ( yearly_Taxable<=500000)){
			exist_tax_Rate=0.05; 
			eTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +eTAX );
			/*new_tax_Rate=0.05;
				 	 nTAX=yearly_Taxable*exist_tax_Rate;
					System.out.println("using exist tax:" +nTAX );*/
		}

		else if( yearly_Taxable<500000 && yearly_Taxable >=750000)
		{/*exist_tax_Rate=0.20;
		eTAX=yearly_Taxable*exist_tax_Rate;
		System.out.println("using exist tax:" +eTAX );*/
			new_tax_Rate=0.10;
			nTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +nTAX );}

		else if( yearly_Taxable<750000 && yearly_Taxable>=1000000)
		{/*exist_tax_Rate=0.20; 
		eTAX=yearly_Taxable*exist_tax_Rate;
		System.out.println("using exist tax:" +eTAX );*/
			new_tax_Rate=0.15;
			nTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +nTAX );}

		else if( yearly_Taxable<1000000 && yearly_Taxable>=1250000)
		{/*exist_tax_Rate=0.30; 
		eTAX=yearly_Taxable*exist_tax_Rate;
		System.out.println("using exist tax:" +eTAX );*/
			new_tax_Rate=0.20;
			nTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +nTAX );}


		else if( yearly_Taxable<1250000 && yearly_Taxable>=1500000)
		{/*exist_tax_Rate=0.30; 
		eTAX=yearly_Taxable*exist_tax_Rate;
		System.out.println("using exist tax:" +eTAX );*/
			new_tax_Rate=0.25;
			nTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +nTAX );} 

		else {
			/*exist_tax_Rate=0.30;
			eTAX=yearly_Taxable*exist_tax_Rate;
			System.out.println("using exist tax:" +eTAX );*/
			new_tax_Rate=0.30;
			nTAX=yearly_Taxable*new_tax_Rate;
			System.out.println("using exist tax:" +nTAX );
		}
		return nTAX;
		//return nTAX;
	}

	public double monthlyTax() {
		//double monthly_ExistTax = eTAX/12;
		double monthly_NewTax = nTAX/12;
		//System.out.println("monthly exist tax:" + monthly_ExistTax);
		System.out.println("monthly new tax:" + monthly_NewTax);
		return monthly_Tax;		
	}

	public double monthlyTakeHomeSalary() { 
		take_Home=monthly_Taxable-monthly_Tax;
		System.out.println("take home salary:" + take_Home);
		return take_Home;
	}

	public static void main(String[] args) {
		for (int i = 1;1<5;i++)
		{
			Scanner input=new Scanner(System.in);
			//System.in is a standard input stream  
			System.out.println("Enter  basic pay of the employee: " );
			double  basicPay= input.nextInt();  
			System.out.println("Enter Basic alowance of the employee: ");  
			double basic_Allowance= input.nextInt();  
			System.out.println("Enter employee level: ");  
			int employee_level= input.nextInt(); 
			//System.out.println("Enter bonus: ");  
			//int bonus= input.nextInt(); 	
			System.out.println("Claculating salary for Employee  :");
			Employee employee=new Employee();
			//double output=employee.empLevel();
			
			employee.monthlySalary(basicPay,basic_Allowance,employee_level);
			employee.pf(basicPay);
			employee.monthlyTaxable();
			employee.yearlyTaxable();
			employee.taxCalculation();
			employee.monthlyTax();
			employee.monthlyTakeHomeSalary();
		}
	}
}


