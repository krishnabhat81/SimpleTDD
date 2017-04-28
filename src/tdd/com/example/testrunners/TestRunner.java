/**
 * @author krishna1bhat
 *
 */
//3. JUnit feature - test runners
//Test runner is used for executing the test cases.
//run as java application

package tdd.com.example.testrunners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJunit.class);
		// if any test case failed, print
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}

		// print overall test cases success or not
		System.out.println(result.wasSuccessful());
	}
}