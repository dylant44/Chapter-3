package exercises;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double FahAt8;
		double FahAt12;
		double FahAt5;
		double CelAt8;
		double CelAt12;
		double CelAt5;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What was the temperature at 8:00?");
		FahAt8 = input.nextDouble();
		System.out.println("What was the temperature at 12:00?");
		FahAt12 = input.nextDouble();
		System.out.println("What was the temperature at 5:00?");
		FahAt5 = input.nextDouble();
		
		
		
		CelAt8 = ((FahAt8 - 32) * .5556 );
		System.out.println("At 8:00 the temperature in Celsius was " + CelAt8);
		CelAt12 = ((FahAt12 - 32) * .5556 );
		System.out.println("At 12:00 the temperature in Celsius was " + CelAt12);
		CelAt5 = ((FahAt5 - 32) * .5556 );
		System.out.println("At 5:00 the temperature in Celsius was " + CelAt5);
		
	}

}
