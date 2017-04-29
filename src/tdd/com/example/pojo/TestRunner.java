package tdd.com.example.pojo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Krishna Bhat
 *
 */

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
		
		for(Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
