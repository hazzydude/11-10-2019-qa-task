package TaxCalcs;

public class TaxCalculator {
	
	int[] taxBraket;
	double[] taxRate;
	
	public TaxCalculator() {

	
		int[] taxBraket = { 0, 14999, 19999, 29999, 44999 };
		this.taxBraket = taxBraket;


		double[] taxRate = { 0, 0.1, 0.15, 0.2 };
		this.taxRate = taxRate;
	}

	public double percent(double income) {

		double remIncome = income;
		double incomeLostTOTax = 0;
		double deductable = 0;
		double braketQuantity = 0;

		int i = 0;
		while (remIncome > 0) {

			if (i == 3) {
				braketQuantity = income + 1;
			} else {
				braketQuantity = taxBraket[i + 1] - taxBraket[i];
			}

			if (braketQuantity > remIncome) {
				deductable = remIncome;
			} else {
				deductable = braketQuantity;
			}

			remIncome = remIncome - deductable;
			incomeLostTOTax = incomeLostTOTax + deductable * taxRate[i];
			i++;

		}
		double unRounded = 100 * incomeLostTOTax / income;;
		double rounded = Math.round(unRounded * 100.0) / 100.0;
		return rounded;

	}

}
