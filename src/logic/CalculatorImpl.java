package logic;

import java.lang.Math;

public class CalculatorImpl implements Calculator{
	public double number1;
	public double number2;
	
	//Overide to over write
	
	@Override
	public double add(double number1,double number2){
		return number1 + number2;
	}
	@Override
	public double sub(double number1,double number2){
		return number1 - number2;
	}
	@Override
	public double multi(double number1,double number2){
		return number1 * number2;
	}
	@Override
	public double div(double number1,double number2){
		return number1 / number2;
	}
	@Override
	public double squareroot(double number1){
		return Math.sqrt(number1);
	}
	@Override
	public double powerof(double number1, double number2){
		return Math.pow(number1,number2);
	}
	@Override
	public double cos(double number1){
		number1 = Math.toRadians(number1);
		return Math.cos(number1);
	}
	@Override
	public double sin(double number1){
		number1 = Math.toRadians(number1);
		return Math.sin(number1);
	}
}
