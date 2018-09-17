package exercises;

public class Percentages 
{

	public static void main(String[] args) 
	{
	double x = 4;
	double y = 5;
	
computePercentage(x, y);
	}

	public static void computePercentage(double x, double y)
	{
		double percent;
		percent = 100 - ((y * 20)-(x * 20));
		
		System.out.println(x + " is " + percent + " % of " + y);
	}
}
