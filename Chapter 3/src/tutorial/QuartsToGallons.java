package youDoIt;

import javax.swing.JOptionPane;


public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int QTS_IN_GALLON = 4;
		int numberOfQuartsNeeded;
		int numberOfGallons;
		int numberOfQuartsLeft;
		String numQuartsString;
		
		
		numQuartsString = JOptionPane.showInputDialog(null, "How many quarts do you need?");
		numberOfQuartsNeeded = Integer.parseInt(numQuartsString); 
		
	
		numberOfGallons = numberOfQuartsNeeded / QTS_IN_GALLON;
		numberOfQuartsLeft = numberOfQuartsNeeded % QTS_IN_GALLON;
		
		
		JOptionPane.showMessageDialog(null, "You will need " + numberOfGallons + " gallons and " + numberOfQuartsLeft + " quarts");
		
		
		
		
	}

}
