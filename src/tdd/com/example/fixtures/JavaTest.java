/**
 * @author krishna1bhat
 *
 */
//1. JUnit feature - fixtures
package tdd.com.example.fixtures;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
	protected int a1, a2;

	// assign value to a1, a2 - before every test method invocation
	protected void setUp() {
		System.out.println("Before test invocation");
		a1 = 50;
		a2 = 5;
	}

	// test method to add these two values
	public void testAdd() {
		double result = a1 + a2;
		assertTrue(result == 55);
	}
	
	// test method to add these two values
	public void testSubtract() {
		double result = a1 - a2;
		assertTrue(result == 45);
	}
	
	// run after every test method call
	protected void tearDown(){
		System.out.println("After test method");
	}
}