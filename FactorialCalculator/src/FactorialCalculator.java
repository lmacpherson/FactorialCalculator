/**
 * Author: Lauren MacPherson
 * 
 * Description: Use a for loop to calculate n!. Ask the user to enter an integer in the range 0 – 25, then display the result of the calculation.
 *
 **/
import javax.swing.JOptionPane;

public class FactorialCalculator {
	int userNum;
	int result;
	
	public int getNumber() {
		return userNum;
	}
	
	public int getFactorial() {
		return result;
	}
	
	public void setNumber(int num) {
		userNum = num;
	}
	//TODO: create for loop calculation function
	public void calculateF() {
		result = userNum;
		for (int i=userNum-1; i>0; i--) {
			System.out.println();
			System.out.println("i= " + i);
			result = result*i;
			System.out.println("result= " + result);
		}
	}
}
