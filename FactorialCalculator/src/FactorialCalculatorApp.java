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
			str = JOptionPane.showInputDialog("Enter a number to compute its factorial:");
			num = Integer.parseInt(str);
			
			factorial.setNumber(num);
			factorial.calculateF();
			factorial.outputString();
			
			JOptionPane.showMessageDialog(null, factorial.getString() + 
										"\nResult = " + factorial.getFactorial());
			choice = JOptionPane.showInputDialog("Run the calculator again? (y/n)");
		}
		
	}

}
