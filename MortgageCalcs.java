
public class MortgageCalcs{
	private double interestRate, term, principal;
	
	public MortgageCalcs(double ir, double t, double p){
		interestRate = ir;
		term = t;
		principal = p;
	}
	
	public double calcPayment(){//this creates the calcPayment Mehtod
		double r = (interestRate/100.0);//changes the rate to a percent
		double x = (1.0+(r/12.0));
		double y = (term*12.0);
		double temp = (1.0/(Math.pow(x,y)));
		double payment = ((principal*(r/12.0))/(1-temp));//gives us the payment
		return payment;//returns the payement
	}	
	
	public double futureValue(){
		double future = calcPayment()*term*12;//calculates the future value by calling the calcPayment method and multiplying by 12 and the term in years
		return future;//returns the future value
	}
	
	public double intCharge(){//calculates the interest charged
		double intCharge = futureValue()-principal;
		return intCharge;
	}

	public double getinterestRate(){//gets the interest rate
		return interestRate;
	}
	public double getterm(){//gets the term in years
		return term;
	}
	public double getprincipal(){//gets the starting principal
		return principal;
	}

	public boolean amortize(int months){
		double newPrin = principal;//sets starting principal equal to the initial principal
		double payment = calcPayment();//gets the payment for each month
		double monthlyRate = (interestRate/100.0/12.0);//calculates the monthly interest rate
		if (months>=(term*12)){//returns false if outside of the term limit
			return false;
		}
		else {
			System.out.printf("%s %s %s %2s %2s%n","Month","Payment Amount","Interest","Principal","Balance");//prints the headers for each column
			for (int i = 0;i<=months;i++){//starts a for loop for printing the amortization table
				if (i == 0) System.out.printf("%,49.2f%n",newPrin);
				else{
				System.out.printf("%-10d%-11.2f%-9.2f%-10.2f%,.2f%n",i,payment, (newPrin*monthlyRate), (payment-(newPrin*monthlyRate)),newPrin-(payment-(newPrin*monthlyRate)));//prints the valuse in the table
				newPrin = newPrin-(payment-(newPrin*monthlyRate));//sets the new principal for the next month
				}
			}
		}
		return true;
	}



}//end class definition
