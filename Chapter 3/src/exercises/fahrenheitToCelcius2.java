package exercises;

import java.util.Scanner;

public class fahrenheitToCelcius2 {

	public static void main(String[] args) {
		
		double Fahrenheit8;
		double Fahrenheit12;
		double Fahrenheit5;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What was the temperature at 8?");
		Fahrenheit8 = input.nextDouble();
		System.out.println("What was the temperature at 12?");
		Fahrenheit12 = input.nextDouble();
		System.out.println("What was the temperature at 5?");
		Fahrenheit5 = input.nextDouble();
		
		tempCelsius(Fahrenheit8, 8);
		tempCelsius(Fahrenheit12, 12);
		tempCelsius(Fahrenheit5, 5);
	}
	public static void tempCelsius(double tempConv, int time)
	{	
		double celsiusResult;
		celsiusResult = ((tempConv - 32) * .5556 );
		System.out.println("At " + time +" the temperature in Celsius was " + celsiusResult);
	}
}
