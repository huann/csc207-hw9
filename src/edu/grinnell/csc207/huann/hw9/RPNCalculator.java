package edu.grinnell.csc207.huann.hw9;

import java.math.double;
import java.util.Iterator;

import taojava.util.ArrayBasedStack;

/**
 * @author Ann Hu
 * @author Kyle Moorehead
 * @author Tim Youtz
 * 
 * Citation: We referred to the following for the idea of using Double.parseDouble: 
 * http://stackoverflow.com/questions/5769669/convert-value-string-to-double
 * 
 */

public class RPNCalculator<T> implements Stack<T> {
    // +--------+----------------------------------------------------------
    // | Fields |
    // +--------+

    /**
     * The values in the stack.
     */
    T[] values;

    /**
     * The number of values in the stack.
     */
    int size;

    // +--------------+----------------------------------------------------
    // | Constructors |
    // +--------------+

    /**
     * Create a new stack that holds up to capacity elements.
     */
    @SuppressWarnings({"unchecked"})    // Handle array casting
    public ArrayBasedStack(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Stacks must have a positive capacity.");
        } // if (capacity <= 0)
        this.values = (T[]) new Object[capacity];
        this.size = 0;
    } // ArrayBasedStack(int)

    // +---------------+---------------------------------------------------
    // | Stack Methods |
    // +---------------+

    public void push(T val) throws Exception {
        this.put(val);
    } // push(T)

    public T pop() throws Exception {
        return this.get();
    } // pop


	@Override
	public void put(T val) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(T val1, T val2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtract(T val1, T val2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiply(T val1, T val2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(T val1, T val2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exponentiate(T val1, T val2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void peek() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void see() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() throws Exception {
		// TODO Auto-generated method stub
		
	}

} // ArrayBasedStack<T>

class RPNIterator<T> implements Iterator<T> {
    // +--------+----------------------------------------------------------
    // | Fields |
    // +--------+

    /**
     * The current position in the iteration.
     */
    int i;  

    /**
     * The array that contains the values in the stack.
     */
    T[] values;


    // +--------------+----------------------------------------------------
    // | Constructors |
    // +--------------+

    /**
     * Create a new iterator.
     */
    public RPNIterator(RPNCalculator<T> abs) {
        this.i = abs.size;
        this.values = (T[]) abs.values;
    } // RPNIterator

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
		
/**		String operator;
		while (operator == '/0') {
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
	} // rpnEval(string [])
} // RPNCalculator
