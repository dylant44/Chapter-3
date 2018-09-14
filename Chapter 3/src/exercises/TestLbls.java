package exercises;

import java.util.Scanner;

public class TestLbls 
{

	public static void main(String[] args) 
{
		
		double weight;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		weight = input.nextDouble();
		
		poundsToKilograms(weight);
		poundsToOunces(weight);
		poundsToMilligrams(weight);
}
	public static void poundsToKilograms(double weight)
	{
		double newWeightKilos;
		final double KILO_CONVERSION = 0.453592;
		newWeightKilos = weight * KILO_CONVERSION;
		System.out.println("In Kilos it is " + newWeightKilos);
		
		
	}
	
	public static void poundsToOunces(double weight)
	{
		double newWeightOunces;
		final double OUNCE_CONVERSION = 16;
		newWeightOunces = weight * OUNCE_CONVERSION;
		System.out.println("In Ounces it is " + newWeightOunces);
	}
	
	public static void poundsToMilligrams(double weight)
	{
		double newWeightMilligrams;
		final double MILLIGRAM_CONVERSION = 453592;
		newWeightMilligrams = weight * MILLIGRAM_CONVERSION;
		System.out.println("In Milligrams it is " + newWeightMilligrams);
		
		
	}
}













