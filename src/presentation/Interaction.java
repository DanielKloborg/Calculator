package presentation;

import logic.CalculatorImpl;
import java.util.Scanner;

public class Interaction {
	public static void main(String[] args) throws Exception {
		CalculatorImpl calc = new CalculatorImpl();
	    Scanner scan = new Scanner(System.in);
	    
	    double number1 = 0;
	    double number2 = 0;
	    double selection;
	        
	    System.out.println("Make your selection");
	    System.out.println("1. Addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. Division");
	    System.out.println("4. Multiplication");
	    System.out.println("5. Squareroot");
	       
	    selection=scan.nextInt();
	    if (selection > 8 ) {
	    	System.out.println("Please enter the correct selection");
	    	selection=scan.nextInt();
	    }
	        
	    if(selection == 1 ) {
	    	System.out.println("Please enter any two numbers");
			number1=scan.nextDouble();
			number2=scan.nextDouble();
	       	System.out.println("Your answer is "+ calc.add(number1,number2));
	    }
	    else if(selection == 2) {
	    	System.out.println("Please enter any two numbers");
			number1=scan.nextDouble();
			number2=scan.nextDouble();
	        System.out.println("Your answer is "+ calc.sub(number1,number2));
	    }
	    else if (selection == 3) {
	    	System.out.println("Please enter any two numbers");
			number1=scan.nextDouble();
			number2=scan.nextDouble();
	        System.out.println("Your answer is "+ calc.multi(number1,number2));	
	    }
	    else if (selection == 4) {
	    	System.out.println("Please enter any two numbers");
			number1=scan.nextDouble();
			number2=scan.nextDouble();
	       	System.out.println("Your answer is "+ calc.div(number1,number2));
	    }
	    else if (selection == 5) {
	    	System.out.println("Please enter any numbers");
			number1=scan.nextDouble();
	    	System.out.println("Your answer is "+ calc.squareroot(number1));
	    }
	    else if (selection == 6) {
	    	System.out.println("Please enter any two numbers");
			number1=scan.nextDouble();
			number2=scan.nextDouble();
	    	System.out.println("Your answer is " + calc.powerof(number1,number2));
	    }
	    else if (selection == 7) {
	    	System.out.println("Please enter any numbers");
			number1=scan.nextDouble();
	    	System.out.println("Your answer is "+ calc.cos(number1));
	    }
	    else if (selection == 8) {
	    	System.out.println("Please enter any numbers");
			number1=scan.nextDouble();
	    	System.out.println("Your answer is "+ calc.sin(number1));
	    }
	}
}
