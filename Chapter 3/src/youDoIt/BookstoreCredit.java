package youDoIt;

import java.util.Scanner; 

public class BookstoreCredit {

	public static void main(String[] args) {
		
		String name;
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name?");
		name = input.nextLine();
		double gpa;
		System.out.print("What is your GPA?");
		gpa = input.nextDouble();
		
		
		computeCredit(name, gpa);
	}
	
	public static void computeCredit(String name, double gpa)
	{
		double credit = gpa * 10;
		System.out.println(name + ", since your gpa is " + gpa + " you get a credit of $" + credit);
	}

}
