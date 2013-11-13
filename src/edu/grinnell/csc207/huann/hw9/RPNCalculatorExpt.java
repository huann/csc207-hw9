package edu.grinnell.csc207.huann.hw9;

import java.io.PrintWriter;

public class RPNCalculatorExpt {

	/**
	 * An experiment to test our calculator.
	 */
	public static void main(String[] args) throws Exception {
		RPNCalculator<String> bestcalc = new RPNCalculator<String>(10);
		PrintWriter pen = new PrintWriter(System.out, true);
		pen.println(bestcalc.rpnEval("3 4 -"));
		pen.println(bestcalc.rpnEval("3 4 5 * +"));
		pen.println(bestcalc.rpnEval("100 10 /"));
		pen.println(bestcalc.rpnEval("2 3 ^"));
		pen.println(bestcalc.rpnEval("3 4 - c 10"));
		pen.println(bestcalc.rpnEval(""));
		pen.println(bestcalc.rpnEval("12 8 4 s / 100 s + p"));
		pen.println(bestcalc.rpnEval("c"));
		pen.println(bestcalc.rpnEval("12 - 8")); // this should break
	} // main(String[])
} // RPNCalculatorExpt
