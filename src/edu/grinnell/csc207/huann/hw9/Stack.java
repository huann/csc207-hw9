package edu.grinnell.csc207.huann.hw9;

import java.util.Iterator;

public interface Stack<T> extends Iterable {

	/**
	 * Add a new element to the top of the stack.
	 */
	public void put(T val) throws Exception;

	/**
	 * Put val in at the position of the iterator, and move the iterator ahead
	 * in the stack.
	 */
	public void push(T val) throws Exception;

	/**
	 * Remove the element at the position of the iterator from the stack and
	 * more the iterator forward in the stack.
	 */
	public void pop(T val) throws Exception;

	
	public void add(T val1, T val2) throws Exception;

	public void subtract(T val1, T val2) throws Exception;

	public void multiply(T val1, T val2) throws Exception;

	public void divide(T val1, T val2) throws Exception;

	public void exponentiate(T val1, T val2) throws Exception;

	public Iterator<T> iterator();

	/**
	 * Print the top value on the stack.
	 */
	public void peek(T val) throws Exception;

	/**
	 * Print the whole stack.
	 */
	public void see(T val[]) throws Exception;

	/**
	 * Clear the whole stack.
	 */
	public void clear(T val[]) throws Exception;

}
