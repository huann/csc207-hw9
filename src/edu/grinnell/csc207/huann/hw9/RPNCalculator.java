package edu.grinnell.csc207.huann.hw9;

import java.math.double;
import java.util.Iterator;

/**
 * @author 
 * @author 
 * @author 
 * 
 * Citation:
 * http://stackoverflow.com/questions/5769669/convert-value-string-to-double
 * 
 */

public class RPNCalculator implements Stack {

	// Constructors
	public String[] 
	
	// ITERABLE METHODS
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>(this);
	} // iterator()

	@Override
	public void put(Object val) throws Exception {
		this.contents[this.top++] = newvalue;
	}

	@Override
	public void push(Object val) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void pop(Object val) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(Object val1, Object val2) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void subtract(Object val1, Object val2) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void multiply(Object val1, Object val2) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void divide(Object val1, Object val2) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void exponentiate(Object val1, Object val2) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void peek(Object val) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void see(Object[] val) throws Exception {
		// TODO Auto-generated method stub	
	}

	@Override
	public void clear(Object[] val) throws Exception {
		// TODO Auto-generated method stub		
	}

	

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
		
		for (int i = 0; i < arrExpr.length; i++) {
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
	}

} // rpnEval(string [])
