package edu.grinnell.csc207.huann.hw9;

import java.util.Iterator;

public interface Stack<T> extends Iterable<T> {

	/**
	 * Check if the stack is empty.
	 */
	boolean isEmpty();

	/**
	 * Check if the stack is full.
	 */
	boolean isFull();

	/**
	 * Print the top value on the stack.
	 */
	public void peek() throws Exception;

	/**
	 * Print the whole stack.
	 */
	public void see() throws Exception;

	/**
	 * Add a new element to the top of the stack.
	 */
	public void put(T val) throws Exception;

	/**
	 * Get the element at the top position of the stack.
	 */
	T get() throws Exception;
	
	/**
	 * An iterator to iterate through the expression. 
	 */
	public Iterator<T> iterator();
	
	/**
	 * Put val in at the position of the iterator, and move the iterator ahead
	 * in the stack.
	 */
	public void push(T val) throws Exception;

	/**
	 * Remove the element at the position of the iterator from the stack and
	 * more the iterator forward in the stack.
	 */
	public T pop() throws Exception;

	/**
	 * Add two elements together. 
	 */
	public void add() throws Exception;

	/**
	 * Subtract one element from another. 
	 */
	public void subtract() throws Exception;

	/**
	 * Multiply two elements.
	 */
	public void multiply() throws Exception;

	/**
	 * Divide one element by another. 
	 */
	public void divide() throws Exception;

	/**
	 * Raise an element to the power of another element. 
	 */
	public void exponentiate() throws Exception;

	/**
	 * Clear the whole stack.
	 */
	public void clear() throws Exception;
} // Stack<T> interface
