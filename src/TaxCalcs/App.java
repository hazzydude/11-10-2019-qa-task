package TaxCalcs;

public class App {

	public static void main(String[] args) {

		TaxCalculator taxCalculate = new TaxCalculator();
		
		double myTaxPercentage = taxCalculate.percent(22000);
		
		
		System.out.println(myTaxPercentage + "% of your salary paid as tax");
		
		
		
	}

}
