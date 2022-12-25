package salaryTax;
public class Employe {

	int BOA;
	int basic;
	int bonus;
	double monthSal;
	double monthlyTaxableSal;
	double yearlyTaxableSal;
	double yearTaxAmt;
	double monthTaxAmt;
	double salary;
	double p1;

	public Employe(int a, int b, int c) {
		basic = a;
		BOA = b;
		bonus = c;
	}

	public double monthly_sal() {
		monthSal = (bonus + BOA + basic);
		System.out.println();
		System.out.println("Monthly salary is : " + monthSal);  
		return monthSal;
	}

	public double pf() {
		p1 = basic * 0.12;
		System.out.println("PF is : " + p1); 
		return p1;
	}

	public double monthly_taxable() {
		monthlyTaxableSal = monthSal - p1;
		System.out.println("Monthly gross : " + monthlyTaxableSal);
		return monthlyTaxableSal;
	}

	public double yearly_taxable() {
		yearlyTaxableSal = monthlyTaxableSal * 12;
		System.out.println("Yearly gross : " + yearlyTaxableSal);
		return yearlyTaxableSal;
	}

	public double tax_year() {

		if	(yearlyTaxableSal <= 250000)   
		{
			yearTaxAmt= 0;
			System.out.println("No tax required"); 
			//return yearTaxAmt;
		} 
		else if	(yearlyTaxableSal > 250000 && yearlyTaxableSal <= 500000)
		{
			yearTaxAmt = yearlyTaxableSal * 0.05;
			System.out.println("Yearly tax is :" + yearTaxAmt);  
			//return yearTaxAmt;
		}  
		else if	(yearlyTaxableSal > 500000 && yearlyTaxableSal <= 750000) 
		{
			yearTaxAmt = yearlyTaxableSal * 0.10;
			System.out.println("Yearly tax is :" + yearTaxAmt); 
			//return yearTaxAmt;
		}
		else if (yearlyTaxableSal > 750000 && yearlyTaxableSal <= 1000000)
		{
			yearTaxAmt = yearlyTaxableSal * 0.15;
			System.out.println("Yearly tax is:" + yearTaxAmt);
		}
		else if (yearlyTaxableSal > 100000 && yearlyTaxableSal <= 1250000)
		{
			yearTaxAmt = yearlyTaxableSal * 0.20;
			System.out.println("Yearly tax is :" + yearTaxAmt);
		}
		else if (yearlyTaxableSal > 1250000 && yearlyTaxableSal <= 1500000)
		{
			yearTaxAmt = yearlyTaxableSal * 0.25;
			System.out.println("Yearly tax is :" + yearTaxAmt);
		}
		else
		{
			yearTaxAmt = yearlyTaxableSal * 0.30;
			System.out.println("Tax applicable is :" + yearTaxAmt);
		}
		return yearTaxAmt;

	}

	public double monthly_tax() {
		monthTaxAmt = yearTaxAmt / 12;
		System.out.println("Monthly tax : " + monthTaxAmt);
		return monthTaxAmt;
	}

	public double salary_month() {
		salary = monthlyTaxableSal - monthTaxAmt;
		System.out.println("Monthly take home :" + salary);
		return salary;
	}

	public static void main(String[] args) {

		Employe emp1 = new Employe(7000, 5000, 2000);
		emp1.monthly_sal();
		emp1.pf();
		emp1.monthly_taxable();
		emp1.yearly_taxable();
		emp1.tax_year();
		emp1.monthly_tax();
		emp1.salary_month();
		Employe emp2 = new Employe(10000, 7000, 2500);
		emp2.monthly_sal();
		emp2.pf();
		emp2.monthly_taxable();
		emp2.yearly_taxable();
		emp2.tax_year();
		emp2.monthly_tax();
		emp2.salary_month();
		Employe emp3 = new Employe(12000, 9000, 3000);
		emp3.monthly_sal();
		emp3.pf();
		emp3.monthly_taxable();
		emp3.yearly_taxable();
		emp3.tax_year();
		emp3.monthly_tax();
		emp3.salary_month();
		Employe emp4 = new Employe(15000, 10000, 3500);
		emp4.monthly_sal();
		emp4.pf();
		emp4.monthly_taxable();
		emp4.yearly_taxable();
		emp4.tax_year();
		emp4.monthly_tax();
		emp4.salary_month();
	}

}