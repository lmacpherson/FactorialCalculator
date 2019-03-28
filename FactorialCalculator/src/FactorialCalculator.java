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
	
	String outputMessage;
	
	public int getNumber() {
		return userNum;
	}
	
	public int getFactorial() {
		return result;
	}
	
	public String getString() {
		return outputMessage;
	}
	
	public void setNumber(int num) {
		userNum = num;
	}
	
	public void calculateF() {	//calculates factorial, does not return result
		result = userNum;
		for (int i=userNum-1; i>0; i--) {
			result = result*i;
		}
	}
	
	public void outputString() { //creates "n! = (n-1)*(n-2)*...." string
		outputMessage = userNum +"! = ";
		for (int n = userNum; n > 0; n--) {
			if (n>1) {
				outputMessage+= n + "*";
			}
			else {
				outputMessage+= n;
			}
		}
	}
	
}
