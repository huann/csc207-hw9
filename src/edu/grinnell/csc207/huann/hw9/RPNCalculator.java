package edu.grinnell.csc207.huann.hw9;

import java.util.Iterator;
import java.lang.Math;

/**
 * @author Ann Hu
 * @author Kyle Moorehead
 * @author Tim Youtz
 * 
 * Citation: We referred to the following for the idea of using Double.parseDouble:
 * http://stackoverflow.com/questions/5769669/convert-value-string-to-double
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
	@SuppressWarnings({ "unchecked" })
	// Handle array casting
	public RPNCalculator(int capacity) throws Exception {
		if (capacity <= 0) {
			throw new Exception("Stacks must have a positive capacity.");
		} // if (capacity <= 0)
		this.values = (T[]) new Object[capacity];
		this.size = 0;
	} // RPNCalculator(int)

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
	public void peek() {
		System.out.print(this.values[this.size - 1] + " ");
	} // peek()

	@Override
	public void see() throws Exception {
		for (int i = 0; i < size; i++) {
			System.out.print(this.values[i] + " ");
		} // for
	} // see()

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

	@SuppressWarnings("unchecked")
	@Override
	public void add() throws Exception {
		double a, b;
		a = Double.parseDouble((String) pop());
		b = Double.parseDouble((String) pop());
		push((T) (String.valueOf(a + b)));
	} // add()

	@SuppressWarnings("unchecked")
	@Override
	public void subtract() throws Exception {
		double a, b;
		a = Double.parseDouble((String) pop());
		b = Double.parseDouble((String) pop());
		push((T) (String.valueOf(b - a)));
	} // subtract()

	@SuppressWarnings("unchecked")
	@Override
	public void multiply() throws Exception {
		double a, b;
		a = Double.parseDouble((String) pop());
		b = Double.parseDouble((String) pop());
		push((T) (String.valueOf(a * b)));
	} // multiply()

	@SuppressWarnings("unchecked")
	@Override
	public void divide() throws Exception {
		double a, b;
		a = Double.parseDouble((String) pop());
		b = Double.parseDouble((String) pop());
		push((T) (String.valueOf(b / a)));
	} // divide

	@SuppressWarnings("unchecked")
	@Override
	public void exponentiate() throws Exception {
		double a, b;
		a = Double.parseDouble((String) pop());
		b = Double.parseDouble((String) pop());
		push((T) (String.valueOf(Math.pow(b, a))));
	} // exponentiate()

	@Override
	public void clear() throws Exception {
		while (size > 0) {
			pop();
		} // while
	} // clear()

	/*
	 * Given a simple arithmetic expression written in Reverse Polish Notation
	 * in the form of a string, evaluate the expression accordingly. Supports
	 * addition, subtraction, multiplication, division, printing the top value,
	 * printing the whole stack, clearing the stack, and exponentiation.
	 * 
	 * @pre String parameter must be in RPN format.
	 */
	
	@SuppressWarnings({ "unchecked" })
	public T rpnEval(String expr) throws Exception {
		// use the spaces in the expression as a separator
		T[] rpnExpr = (T[]) expr.split(" ");
		for (int i = 0; i < rpnExpr.length; i++) {
			if (rpnExpr[i].equals("+")) {
				add();
			} // if addition
			else if (rpnExpr[i].equals("-")) {
				subtract();
			} // if subtraction
			else if (rpnExpr[i].equals("*")) {
				multiply();
			} // if multiplication
			else if (rpnExpr[i].equals("/")) {
				divide();
			} // if division
			else if (rpnExpr[i].equals("^")) {
				exponentiate();
			} // if exponentiation
			else if (rpnExpr[i].equals("p")) {
				peek();
			} // if peek
			else if (rpnExpr[i].equals("s")) {
				see();
			} // if see
			else if (rpnExpr[i].equals("c")) {
				clear();
			} // if clear
			else {
				push(rpnExpr[i]);
			} // if number
		} // for
		return pop();
	} // rpnEval(string [])
} // RPNCalculator

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

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}
