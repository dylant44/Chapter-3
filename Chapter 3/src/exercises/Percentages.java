package exercises;

import java.util.Scanner;

public class Percentages 
{

	public static void main(String[] args) 
	{
		
		double x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		x = input.nextDouble();
		double y;
		System.out.println("Enter another number");
		y = input.nextDouble();
		
computePercentage(x, y);
	}

	public static void computePercentage(double x, double y)
	{
		double percent;
		percent = 100 - ((y * 20)-(x * 20));
		
		System.out.println(x + " is " + percent + " % of " + y);
	}
}
