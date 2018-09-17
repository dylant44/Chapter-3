package exercises;

public class NumbersDemo {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 12;
		
		displayTwiceNum(x,y);
		displayNumPlusFive(x, y);
		displayNumSquared(x, y);
		
	}

	public static void displayTwiceNum(int x, int y)
	{
		int x2;
		int y2;
		x2 = x * 2; 
		y2 = y * 2; 
		displayMessage(x2, y2);
		
	}
	public static void displayNumPlusFive(int x, int y)
	{
		int x3;
		int y3;
		x3 = x + 5;
		y3 = y + 5;
		displayMessage(x3, y3);
		
	}
	public static void displayNumSquared(int x, int y)
	{
		int x4;
		int y4;
		x4 = x * x;
		y4 = y * y;
		displayMessage(x4, y4);
	}
	public static void displayMessage(int x, int y) {
		
		System.out.println("x = " + x + " , y = " + y);
	}
	}
