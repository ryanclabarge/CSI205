
public class MortgageCalcs{
	private double interestRate, term, principal;
	
	public MortgageCalcs(double interestRate, double term, double principal){
		this.interestRate = interestRate;
		this.term = term;
		this.principal = principal;
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
		if (0<months && months<=(term*12)){//returns true if between the term limits
			System.out.printf("%s %s %s %2s %2s%n%,49.2f%n","Month","Payment Amount","Interest","Principal","Balance",principal);//prints the headers for each column and principal in the second row
			for (int i =1;i<=months;i++){ 		
				System.out.printf("%3d%14.2f%11.2f%9.2f%,12.2f%n",i,payment,(newPrin*monthlyRate), (payment-(newPrin*monthlyRate)),newPrin-(payment-(newPrin*monthlyRate)));//prints the valuse in the table
				newPrin = newPrin-(payment-(newPrin*monthlyRate));//sets the new principal for the next month
			}
		return true;
		}	
		else return false;
	}


}//end class definition
