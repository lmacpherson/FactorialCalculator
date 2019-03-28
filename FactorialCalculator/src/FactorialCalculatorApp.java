/**
 * Author: Lauren MacPherson
 * 
 * Description: Use a for loop to calculate n!. Ask the user to enter an integer in the range 0 – 25, then display the result of the calculation.
 *
 **/
import javax.swing.JOptionPane;

public class FactorialCalculatorApp {
	
	public static void main(String[] args) {
		FactorialCalculator factorial = new FactorialCalculator(); //object of FactorialCalculator
		String choice = "y";	//initialize while loop run
		String str;
		int num;	//initialize user input

		while (choice.equalsIgnoreCase("y")) {
			//TODO implement functions to accept input, run calculator, and return value
			str = JOptionPane.showInputDialog("Enter a number to compute its factorial:");
			num = Integer.parseInt(str);
			
			factorial.setNumber(num);
			factorial.calculateF();
			
			//TODO use outputString function to output complete multiplication breakdown
			//JOptionPane.showMessageDialog(null, "The factorial of " + num + " is " + factorial.getFactorial());
			factorial.outputString();
			JOptionPane.showMessageDialog(null, factorial.getString());
			
			choice = JOptionPane.showInputDialog("Run the calculator again? (y/n)");
		}
		
	}

}
