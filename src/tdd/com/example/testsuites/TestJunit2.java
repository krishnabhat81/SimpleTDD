package tdd.com.example.testsuites;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
* @author Krishna Bhat
*
*/

public class TestJunit2 {
	@Test
	public void testPrinter(){
		System.out.println("Test method of TestJunt2 called");
		assertTrue(true);
	}
}
