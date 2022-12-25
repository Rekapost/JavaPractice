package assignment3Part1;
import java.util.Scanner;

public class Restaurant {
	double TotalCost;
	double vegnonvegtotal;
	double total;
	double nonVegtotal;
	double pay;
	double quantity;
	double order;
	double GSTtax;
	double parcelDinecharge;
	double totalBillAmmount;
	double discount;
	double netBillAmmount;
	double totalCost;
	double PaneerTikka;
	double CashewPulao;
	double VegFriedRice;
	double Gobi65;
	double Vegthali;
	double Chickenbriyani;
	double Fishcurry;
	double Chicken65;
	double MuttonGravy;
	double Chickenfriedrice;
	int count;
	double totalFood;
	double vegtotal;
	double discFromTotal;
	double gst;
	double totalVeg;
	double totalnonVeg;
	static double option;

	public Restaurant(double a, double b, double c, double d,double e,double f, double g, double h, double i,double j)
	{
		PaneerTikka=a;
		CashewPulao=b;
		VegFriedRice=c;
		Gobi65=d;
		Vegthali=e;	
		Chickenbriyani=f;
		Fishcurry=g;
		Chicken65=h;
		MuttonGravy=i;
		Chickenfriedrice=j;	
	}

	public void displayMenu() {
		Scanner d = new Scanner(System.in);
		switch (d.nextInt()) 
		{
		case 1:
			System.out.println ( "You picked Vegetarian" );
			System.out.println(" here is the menu list:");
			System.out.println( );
			System.out.println("Enter 1 : Paneer tikka - Rs. 120.00 (per item)");
			System.out.println("Enter 2 :Cashew pulao - Rs. 150.00 (per item");	
			System.out.println("Enter 3: Veg fried rice - Rs. 130.00 (per item)");
			System.out.println("Enter 4: Gobi 65 - Rs. 100.00 (per item)");
			System.out.println("Enter 5: Veg. thali - Rs. 140.00 (per item)");
			selectFromVegMenu();
			break;

		default:
			System.out.println ( "You picked Non vegetarian" );
			System.out.println("here is the menu list:");
			System.out.println( );
			System.out.println("Enter 1: Chicken briyani - Rs. 200.00 (per item)");
			System.out.println("Enter 2: Fish curry -  Rs. 150.00 (per item)");
			System.out.println("Enter 3 :Chicken 65 - Rs. 120.00 (per item)");
			System.out.println("Enter 4: Mutton gravy -  Rs. 220.00 (per item)");					
			System.out.println("Enter 5: Chicken fried rice - Rs. 180.00 (per item)");

			System.out.println("enetr digit from 1 to 5 to order from non veg :");
			selectFromNonVegMenu();
			break;
		}
		
	}

	public double selectFromNonVegMenu() { 
		Scanner nonVeg = new Scanner(System.in);
		double total=0;
		switch (nonVeg.nextInt()) 
		{
		case 1:
			System.out.println ("Chicken briyani - Rs. 200.00 (per item)");
			System.out.println(" how many chicken biryani u want ");
			quantity = nonVeg.nextInt();
			nonVegtotal += total+(quantity*200);
			System.out.println(" total amount :"+ nonVegtotal);
			break;

		case 2:
			System.out.println ("Fish curry -  Rs. 150.00 (per item)");
			System.out.println(" how many Fish curry u want ");
			quantity = nonVeg.nextInt();
			nonVegtotal += total+(quantity*150);
			System.out.println(" total amount :"+ nonVegtotal);
			break;

		case 3:
			System.out.println ( "Enter 3 :Chicken 65 - Rs. 120.00 (per item)" );
			System.out.println(" how many Chicken 65  u want ");
			quantity = nonVeg.nextInt();
			nonVegtotal += total+(quantity*120);
			System.out.println(" total amount :"+ nonVegtotal);
			break;

		case 4:
			System.out.println ( "Mutton gravy -  Rs. 220.00 (per item)" );
			System.out.println(" how many Mutton gravyy u want ");
			quantity = nonVeg.nextInt();
			nonVegtotal += total+(quantity*220);
			System.out.println(" Total amount :"+ nonVegtotal);
			break;

		case 5:
			System.out.println("Chicken fried rice - Rs. 180.00 (per item)");
			System.out.println(" how many Chicken fried rice - u want ");
			quantity = nonVeg.nextInt();
			nonVegtotal += total+(quantity*180);
			System.out.println(" Total amount :"+ nonVegtotal);
			break;

		default:
			System.out.println(" u have not ordered any veg food");
			break;
		}
		return nonVegtotal;
	}

	public double selectFromVegMenu() {
		System.out.println("Enter digit from 1 to 5 to order from veg :");
		Scanner Veg = new Scanner(System.in);
		double total = 0;
		switch (Veg.nextInt()) 
		{
		case 1:
			System.out.println ("Paneer tikka - Rs. 120.00 (per item)");
			System.out.println(" how many Paneer tikka - u want ");
			quantity = Veg.nextInt();
			vegtotal += total+(quantity*120);
			System.out.println(" total amount :"+ vegtotal);
			break;

		case 2:
			System.out.println ("Cashew pulao - Rs. 150.00 (per item");
			System.out.println(" how many Cashew pulao - u want ");
			quantity = Veg.nextInt();
			vegtotal += total+(quantity*150);
			System.out.println(" total amount :"+ vegtotal);
			break;

		case 3:
			System.out.println ( "Veg fried rice - Rs. 130.00 (per item)" );
			System.out.println(" how many Veg fried rice - u want ");	
			quantity = Veg.nextInt();
			vegtotal += total+(quantity*130);
			System.out.println(" total amount :"+ vegtotal);
			break;

		case 4:
			System.out.println ( "Gobi 65 - Rs. 100.00 (per item)" );
			System.out.println(" how many Gobi 65 - u want ");
			quantity =Veg.nextInt();
			vegtotal += total+(quantity*100);
			System.out.println(" Total amount :"+ vegtotal);
			break;

		case 5:
			System.out.println("  Veg. thali - Rs. 140.00 (per item)");
			System.out.println(" How many Veg. thali do you want ");
			quantity = Veg.nextInt();
			vegtotal += total+(quantity*140);
			System.out.println(" total amount :"+ vegtotal);
			break;

		default:
			System.out.println(" u did not order any non veg food  , please order");
			break;
		}

		return vegtotal;

	}

	public double totalCost() {
		total += vegtotal+nonVegtotal;
		System.out.println("Total bill of only food without discount : "+total);
		return total;
	}
	public double taxGST() {
		GSTtax=(total*0.06);
		System.out.println("Total with GST tax : "+ GSTtax);
		return GSTtax;
	}

	public double parcelDine() {	
		//		•	10 rupees per dish will be charged for parcel else
		//		•	30  rupees will be charged per bill as service charge for dine-in
		parcelDinecharge = 30;
		System.out.println("Parcel/Dine-in charge: " + parcelDinecharge);
		return parcelDinecharge;
	}

	public void discountFromTotal() {
		total=total+GSTtax;
		if(total>1000 && total<=1500 )
		{
			discFromTotal=(total*0.10);
			System.out.println(" Discount with 10% : " +discFromTotal);
		}
		else
		{
			discFromTotal=(total*0.5);
			System.out.println(" Discount with 15% : " +discFromTotal);
		}
		
	}

	public double netBill() {
		netBillAmmount=(total-discFromTotal)+parcelDinecharge;
		System.out.println(" NetBillAmmount cost : " + netBillAmmount);
		return netBillAmmount;
		
	}
	public static void main(String[] args) {

		Restaurant customer1 = new Restaurant(120.00, 150.00, 130.00, 100.00, 140.00, 200.00, 150.00, 120.00,
				220.00, 180.00);
		try (Scanner input1 = new Scanner(System.in)) {

			System.out.println("Welcome to Numpy Ninja Restaurant");
			System.out.println("please select the service offering from the below list:");
			System.out.println("Enter 1 for Dine in Numpy Ninja Restaurant");
			System.out.println("Enter 2 for Take away at Numpy Ninja Restaurant");
			switch (input1.nextInt()) {
			case 1:
				System.out.println("You picked Dine In");
				break;

			case 2:
				System.out.println("You picked Take Away");
				break;
			}

			System.out.println("Please select the category from the below list:");
			System.out.println("Enter 1 : category 1 Vegetarian Menu List :");
			System.out.println("Enter 2:  category 2 Non Vegetarian Menu List :");
			customer1.displayMenu();
			System.out.println("Would you like to order one more dish ? [Y] or [N] :");
			while(input1.next().equalsIgnoreCase("y")){
				System.out.println(" Enter 1 for veg or other key for non veg :");
				customer1.displayMenu();
				System.out.println("Would you like to order one more dish ? [Y] or [N] :");
			}
			System.out.println("Calculating food bill : \n");
			customer1.totalCost();
			customer1.taxGST();
			customer1.parcelDine();
			customer1.discountFromTotal();
			customer1.netBill();
			System.out.println(" Thank you! Come Again!");

		}
	}
}


