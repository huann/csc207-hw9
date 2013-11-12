package edu.grinnell.csc207.huann.hw9;

import java.util.Iterator;

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
    public RPNCalculator(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Stacks must have a positive capacity.");
        } // if (capacity <= 0)
        this.values = (T[]) new Object[capacity];
        this.size = 0;
    } // ArrayBasedStack(int)


    // +-------------------------+-----------------------------------------
    // | LinearStructure Methods |
    // +-------------------------+

    @Override
    public boolean isEmpty() {
        return this.size <= 0;
    } // isEmpty()

    @Override
    public boolean isFull() {
        return this.size == this.values.length;
    } // isFull()

    @Override
    public T peek() {
        return this.values[this.size-1];
    } // peek()

    @Override
    public void put(T val) throws Exception {
        if (this.isFull()) {
            throw new Exception("full");
        } // if full
        this.values[this.size++] = val;
    } // put(T)

    @Override
    public T get() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("empty");
        } // if empty
        return values[--size];
    } // get()

    @Override
    public Iterator<T> iterator() {
        return new RPNIterator<T>(this);
    } // iterator()

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
	public void add() throws Exception {
		int a, b;
		a = Double.parseDouble(pop())
		pop();
		
	}

	@Override
	public void subtract() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiply() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exponentiate() throws Exception {
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
    
    @SuppressWarnings({"unchecked"})
	public void rpnEval(String expr) {
		// use the spaces in the expression as a separator
		T[] rpnExpr = (T[]) expr.split(" ");
		
/**		String operator;
		while (operator == '/0') {
			if (rpnExpr[i].equals("+")) {
				operator = rpnExpr[i];
			}
			else if (rpnExpr[i].equals("-"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("*"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("/"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("^"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("p"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("s"))
				operator = rpnExpr[i];
			
			else if (rpnExpr[i].equals("c"))
				operator = rpnExpr[i];
		}
		*/
		
		for (int i = 0; i < rpnExpr.length; i++) {
			if (rpnExpr[i].equals("+")) {
				add();
			} // if addition
			if (rpnExpr[i].equals("-")) {
				subtract();
			} // if subtraction
			if (rpnExpr[i].equals("*")) {
				multiply();
			} // if multiplication
			if (rpnExpr[i].equals("/")) {
				divide();
			} // if division
			if (rpnExpr[i].equals("^")) {
				exponentiate();
			} // if exponentiation
			
		} // for
		return ans;
	}

		
	} // rpnEval(string [])
} // RPNCalculator
