package presentation;

import logic.CalculatorImpl;

public class TestCalculator {
	public static void main(String[] args) throws Exception {
		CalculatorImpl calc = new CalculatorImpl();
		System.out.println("6 + 2 = " + calc.add(6,2));
		System.out.println("6 - 2 = " + calc.sub(6,2));
		System.out.println("6 * 2 = " + calc.multi(6,2));
		System.out.println("6 / 2 = " + calc.div(6,2));
		System.out.println("Squareroot of 6 = " + calc.squareroot(6));
		System.out.println("Power of 6 to the 2 = " +calc.powerof(6,2));
		System.out.println("Cosinus of 30 = " +calc.cos(30));
		System.out.println("Sinus of 30 = " +calc.sin(30));	
	}
}
