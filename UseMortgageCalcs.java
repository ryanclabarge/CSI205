import java.util.Scanner;
import java.text.NumberFormat;

public class UseMortgageCalcs{
	public static void menu(){
		System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%n%s",
				"1:Display the Payment",
				"2:Display the Future Value",
				"3:Display the Interest Charge",
				"4:View all",
				"5:View Amortization table",
				"6:Exit",
				"Please select a number:");
	}

	public static void main(String[] args){
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		double princiapl,term,rate;
		do{
		System.out.println("Enter the total amount of the loan:");
		principal = scan.nextDouble();
		}
		while((principal<1)||(principal>500000));
		do{
		System.out.println("Enter the term in years:");
		term = scan.nextDouble();
		}
		while(term<1 || term>30);
		do{
		System.out.println("Enter the interest rate:");
		rate = scan.nextDouble();
		}
		while(rate<1 || rate>15);
		MortgageCalcs mort = new MortgageCalcs(rate,term,principal);
		menu();
		int t = scan.nextInt();
		switch(t){
			case 1: System.out.printf("%n%s:%s%n","Payment".formatter.format(mort.calcPayment()));
				menu();
				t = scan.nextInt();
			case 2: System.out.printf("%n%s:%s%n","Future Value",formatter.format(mort.futureValue()));
				menu();
				t = scan.nextInt();
			case 3: System.out.printf("%n%s:%s%n","Interest Charge:",formatter.format(mort.intCharge()));
				menu();
				t = scan.nextInt();
			case 4: 
			default: break;
		} 
	}
}
