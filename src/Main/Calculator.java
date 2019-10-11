package Main;

public class Calculator {

	public int addition(int a, int b ) {
		int sum= a+b; 
		return(sum);
	}
	
	public int subtraction(int a, int b ) {
		return a - b ;
	}
	
	public int multiplication(int a, int b ) {
		return a * b ;
	}
	
	public  double division(double a, double b ) {
		
		if (a>b) {
			System.out.println("division cannot be performed");
			return 0;
		
		}
		else {
		return a / b ;
		}
	
	}
	
	public int conditionalCalc(int a, int b, boolean condit ) {
		if (a%2 == 0 || b%2 ==0){
		 return 0;
		} else if (condit) {
			return a + b;
		} else {
			return a*b;
		}
	}
	
	
}
