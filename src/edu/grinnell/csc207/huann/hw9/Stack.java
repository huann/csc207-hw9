package edu.grinnell.csc207.huann.hw9;

import java.util.Iterator;

public interface Stack<T> extends Iterable<T> {

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
	public void pop() throws Exception;

	/**
	 * Add two elements together. 
	 */
	public void add(T val1, T val2) throws Exception;

	/**
	 * Subtract one element from another. 
	 */
	public void subtract(T val1, T val2) throws Exception;

	/**
	 * Multiply two elements.
	 */
	public void multiply(T val1, T val2) throws Exception;

	/**
	 * Divide one element by another. 
	 */
	public void divide(T val1, T val2) throws Exception;

	/**
	 * Raise an element to the power of another element. 
	 */
	public void exponentiate(T val1, T val2) throws Exception;

	/**
	 * An iterator to iterate through the expression. 
	 */
	public Iterator<T> iterator();

	/**
	 * Print the top value on the stack.
	 */
	public void peek() throws Exception;

	/**
	 * Print the whole stack.
	 */
	public void see() throws Exception;

	/**
	 * Clear the whole stack.
	 */
	public void clear() throws Exception;

} // Stack<T> interface
