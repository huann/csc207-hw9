package edu.grinnell.csc207.huann.hw9;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class RPNCalculatorTest {

	@Test
	public void testEva10() {
		assertEquals(BigInteger.valueOf(0), RPNCalculator.rpnEval("0"));
		assertEquals(BigInteger.valueOf(2), RPNCalculator.rpnEval("1 + 1"));
		assertEquals(BigInteger.valueOf(4), RPNCalculator.rpnEval("1 + 2 + 1"));
		assertEquals(BigInteger.valueOf(9), RPNCalculator.rpnEval("1 + 2 * 3"));
		assertEquals(BigInteger.valueOf(-11), RPNCalculator.rpnEval("1 * 2 - 13"));
		assertEquals(BigInteger.valueOf(3), RPNCalculator.rpnEval("6 / 2 ^ 1"));
	}
}
