package tdd.com.example.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Krishna Bhat
 *
 */

// 1. Annotate test class with @RunWith(Parameterized.class).
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private int number;
	private boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;

	// 4. Create an instance variable for each "column" of test data.
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	// 3. Create a public constructor that takes in what is equivalent to one
	// "row" of test data.
	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method

	public PrimeNumberCheckerTest(int number, boolean expectedResult) {
		this.number = number;
		this.expectedResult = expectedResult;
	}

	// 2. Create a public static method annotated with @Parameters
	//    that returns a Collection of Objects (as Array) as test data set.
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true } });
	}

	// 5. Create your test case(s) using the instance variables as the source of
	// the test data.
	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is : " + number);
		assertEquals(expectedResult, primeNumberChecker.validate(number));
	}
}
