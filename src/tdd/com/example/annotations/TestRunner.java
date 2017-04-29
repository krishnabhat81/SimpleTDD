/**
 * @author krishna1bhat
 *
 */
package tdd.com.example.annotations;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//run as Java Application or, run JunitAnnotations class as JUnit Test
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitAnnotations.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}