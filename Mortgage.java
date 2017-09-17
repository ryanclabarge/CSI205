import java.util.Scanner;
import java.text.NumberFormat;

public class Mortgage {
	public static double Payment(double a, double b, double c){//this calculates the payment
		//double payment = ((a*(b/12.0))/(1.0-(1.0/(Math.pow((1.0+(b/12.0)),(c*12.0))))));
		double r = (b/100.0);
		double x = (1.0+(r/12.0));
		double y = (c*12.0);
		double temp = (1.0/(Math.pow(x,y)));
		double payment = ((a*(r/12.0))/(1-temp));
		return payment;
	}
	public static double Future(double p, double c){
		double future = p*c*12.0;
		return future;
	}
	public static double Interest(double a, double b){
		return (a-b);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);//creates a Scanner object
		System.out.println("Enter the starting amount of the Mortgage:");
		double a = scan.nextDouble();//Gets the Mortgage
		System.out.println("Enter the length of the term in years:");
		double c = scan.nextDouble();//Gets the Term in years
		System.out.println("Enter the interest rate:");
		double b = scan.nextDouble();//Gets the interest rate at a number
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("Princapal: " +formatter.format(a));
		System.out.println("Future Value: "+formatter.format(Future(Payment(a,b,c),c)));
		System.out.println("Interest Rate: "+b+"%");
		System.out.println("Interest Charge: "+formatter.format(Interest(Future(Payment(a,b,c),c),a)));
		System.out.println("Payment: "+formatter.format(Payment(a,b,c)));
	}
}

