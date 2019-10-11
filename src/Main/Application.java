package Main;

import TaxCalcs.TaxCalculator;

public class Application {
	public static void main(String[] args) {
		
		
		Stringprint printer = new Stringprint();
		printer.disp("hello world");
	
		
		
		
		Calculator calc = new Calculator();
		System.out.println(calc.addition(1,3));
		System.out.println(calc.subtraction(1,3));
		System.out.println(calc.multiplication(1,3));
		System.out.println(calc.division(14,3));
		
		
		Results hayden = new Results() ;
		hayden.markBreakdown(77, 140, 92);
		hayden.percentage(77, 140, 92);
		
		
		System.out.println(calc.conditionalCalc(7,3,true));
		System.out.println(calc.conditionalCalc(7,3,false));
		System.out.println(calc.conditionalCalc(7,2,true));
		
		
		BlackJack awesomeGame = new BlackJack();
		System.out.println(awesomeGame.play(17,22));
		
		
		UniqueSum uniq = new UniqueSum();
		System.out.println(uniq.unique3sum(3,4,3));
		
		
		Cheese cheese1 = new Cheese("Cheddar",12, 45);
		System.out.println(cheese1.weight);
	
		
		
		TaxCalculator tCalc = new TaxCalculator();
		
	}
}
