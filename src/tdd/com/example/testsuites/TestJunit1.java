package tdd.com.example.testsuites;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
* @author Krishna Bhat
*
*/

public class TestJunit1 {
	private String message = "Hello World";
	
	@Test
	public void testPrintHellowWorld(){
		System.out.println("Test method of TestJunt1 called");
		assertTrue(message.equals("Hello World"));
	}
}
