package edu.grinnell.csc207.huann.hw9;

import java.math.double;
import java.util.Iterator;

public class RPNCalculator {

	// ITERABLE METHODS
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>(this);
	} // iterator()

	
	
	/*
	 * Given a simple arithmetic expression written in Reverse Polish Notation
	 * in the form of a string, evaluate the expression accordingly. Supports
	 * addition, subtraction, multiplication, division, printing the top value,
	 * printing the whole stack, clearing the stack, and exponentiation.
	 */
	
	
	
	public static double rpnEval(String expr) {
		// use the spaces in the expression as a separator
		String[] arrExpr = expr.split(" ");
		// take the first number as temporary answer
		double ans = Double.parseDouble(arrExpr[0]);
		String operator;
/**		while (operator == '/0') {
			if (arrExpr[i].equals("+")) {
				operator = arrExpr[i];
			}
			else if (arrExpr[i].equals("-"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("*"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("/"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("^"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("p"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("s"))
				operator = arrExpr[i];
			
			else if (arrExpr[i].equals("c"))
				operator = arrExpr[i];
		}
		*/
		
		for (int i = 2; i < arrExpr.length; i++) {
			if (arrExpr[i].equals("+")) {
				ans = ans.add(arrExpr[i + 1]));
			} // if addition
			if (arrExpr[i].equals("-")) {
				ans = ans.subtract((arrExpr[i + 1]));
			} // if subtraction
			if (arrExpr[i].equals("*")) {
				ans = ans.multiply((arrExpr[i + 1]));
			} // if multiplication
			if (arrExpr[i].equals("/")) {
				ans = ans.divide((arrExpr[i + 1]));
			} // if division
			if (arrExpr[i].equals("^")) {
				ans = ans.pow(Integer.valueOf(arrExpr[i + 1]));
			} // if exponentiation
			
		} // for
		return ans;
	} // rpnEval(string [])

	
	
}
