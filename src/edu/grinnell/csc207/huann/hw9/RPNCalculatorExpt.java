package edu.grinnell.csc207.huann.hw9;

import java.io.PrintWriter;

public class RPNCalculatorExpt {

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	static RPNCalculator<String> bestcalc = new RPNCalculator<String>(10);
	public static void main(String[] args) throws Exception {
		PrintWriter pen = new PrintWriter(System.out, true);
		pen.println(bestcalc.rpnEval("3 4 -"));
		
	} // main(String[])

} // RPNCalculatorExpt
