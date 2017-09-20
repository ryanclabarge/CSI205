public class UseMortgageCalcs{
	public static void main(String[] args){
		int k = Integer.parseInt(args[0]);
		MortgageCalcs m = new MortgageCalcs(7.5,5,20000);
		System.out.println(m.getprincipal());
		System.out.println(m.getterm());
		System.out.println(m.getinterestRate());
		m.amortize(k);
	}
}
