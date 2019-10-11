package NumberPrinter;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinter {

	public NumberPrinter() {
	}

	public String sayNumber(int a) {

		String wordNumber = "";

		int units = a % 10;
		int tens = (a - units) / 10;

		if (tens == 1) {
			
		}

		return wordNumber;
	}

	public List<Integer> splitNumber(int a) {
		//output is [units, tens, etc]
		List<Integer> split = new ArrayList<>();
		while (a>0) {
			int temp = a%10;
			a=(a-temp)/10;
			split.add(temp);
			
		}
		return split;
	}

	
	
	public String getTens(int a) {
		String wordNumber = "";
		int tens = a;
		 
		if (tens==0) {
			wordNumber ="";
		} else if (tens==1) {
			wordNumber ="ten";
		} else if (tens==2) {
			wordNumber ="twenty";
		} else if (tens==3) {
			wordNumber ="thirty";
		} else if (tens==4) {
			wordNumber ="fourty";
		} else if (tens==5) {
			wordNumber ="fifty";
		} else if (tens==6) {
			wordNumber ="sixty";
		} else if (tens==7) {
			wordNumber ="seventy";
		} else if (tens==8) {
			wordNumber ="eighty";
		} else if (tens==9) {
			wordNumber ="ninty";
		}
		
	
		return wordNumber;
	}
	

	public String getTeens(int a) {
		// for teen numbers only
		String wordNumber = "";
		int teens = a;
		if (teens == 0) {
			wordNumber = "Ten";
		} else if (teens == 1) {
			wordNumber = "Eleven";
		} else if (teens == 2) {
			wordNumber = "Twelve";
		} else if (teens == 3) {
			wordNumber = "Thirteen";
		} else {
			wordNumber = getUnits(a) + "teen";
		}
		return wordNumber;
	}

	public String getUnits(int a) {

		// for all units;

		String wordNumber = "";

		int units = a;

		if (units == 0) {
			wordNumber = "";
		} else if (units == 1) {
			wordNumber = "one";
		} else if (units == 2) {
			wordNumber = "two";
		} else if (units == 3) {
			wordNumber = "three";
		} else if (units == 4) {
			wordNumber = "four";
		} else if (units == 5) {
			wordNumber = "five";
		} else if (units == 6) {
			wordNumber = "six";
		} else if (units == 7) {
			wordNumber = "seven";
		} else if (units == 8) {
			wordNumber = "eight";
		} else if (units == 9) {
			wordNumber = "nine";
		}

		return wordNumber;

	}

}
