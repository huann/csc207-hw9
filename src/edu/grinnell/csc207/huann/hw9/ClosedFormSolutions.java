package edu.grinnell.csc207.huann.hw9;

public class ClosedFormSolutions {

	/**
     * f0 - spoke with Prof. Rebelsky about this problem.
     *   f(n) = n + f(n/2)
     *   f(n) = n + (f(n/4) + n/2)
     *   f(n) = 3n/2 + f(n/4)
     *   f(n) = 3n/2 + (f(n/8) + n/4)
     *   f(n) = 7n/2 + f(n/8)
     *   f(n) = 7n/2 + (f(n/16) + n/8)
     *   f(n) = 15n/8 + f(n/16)
     *   *hand-maths*
     *   f(n) = 2^(1 + log_2(n)) - 1
     * 
     * 
     * f1
     *   f(n) = n + f(n-1)
     *   f(1) = 1
     *   f(2) = 2 + (f(1)) = 3
     *                1
     *   f(3) = 3 + (f(2)) = 6
     *                3
     *   f(4) = 4 + (f(3)) = 10
     *               6
     * 
     *   f(n) = n(n+1) / 2 			(pattern identified by Wolfram Alpha)
     * 
     * 
     * f2
     *   f(n) = c + f(n-1)
     *   f(1) = 1
     *   f(2) = c + 1
     *   f(3) = c + (c + 1)
     *   f(4) = c + (c + c + 1)
     * 
     *   f(n) = c*(n-1) + 1 
     * 
     * 
     * f3
     *   f(n) = c + f(n/2)       
     *  f(n) = c+(1 + log_2(n))   	 (pulled parts from f0, added constant)
     * 
     * 
     * f4 - Analysis taken from http://www.cs.grinnell.edu/~rebelsky/Courses/CSC207/2013F/eboards/32.md
     *   t(n) = 2*f(n/2) + n    
     *   t(n) = 2*(2*f(n/4) + n/2) + n     
     *   t(n) = 4*f(n/4) + 2n     
     *   t(n) = 4*(2*f(n/8) + n/4) + 2n  
     *   t(n) = 8*f(n/8) + 3n    
     *   t(n) = 8*(2*f(n/16) + n/8) + 3n
     *   t(n) = 16*f(n/16) + 4n
     * 
     *   f(n) = n + n*log_2(n)
     * 
     * 
     * f5
     *   f(n) = c + 2*f(n/2)
     *   f(1) = 1
     *   f(2) = c + 2*f(2/2)
     *          c + 2 * 1 = c + 2
     *   f(4) = c + 2*f(4/2)
     *          c + 2 * (c + 2) = 3c + 4
     *   f(8) = c + 2*f(8/2)
     *          c + 2 * (3c + 4) = 7c + 8
     *   f(16) = c + 2*f(16/2)
     *           c + 2 * (7c + 8) = 15c + 16
     * 
     * `f(n) = (n-1)*c + n
     * 
     * 
     * f6
     *   f(n) = c + 2*f(n-1)
     *   f(1) = 1
     *   f(2) = c + 2*f(2-1)
     *          c + 2 * 1 = c + 2
     *   f(3) = c + 2*f(3-1)
     *          c + 2 * (c + 2) = 3c + 4
     *   f(4) = c + 2*f(4-1)
     *          c + 2 * (3c + 4) = 7c + 8
     *   f(5) = c + 2*f(5-1)
     *          c + 2 * (7c + 8) = 15c + 16
     * 
     *   f(n) = ((2^(n-1))-1)*c + 2^(n-1)
     */
} // ClosedFormSolutions
