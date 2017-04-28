/**
 * @author krishna1bhat
 *
 */
//1. JUnit feature - test suites
//Test suite bundles a few unit test cases and runs them together.
//Run this class

package tdd.com.example.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit suite test
@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestJunit1.class, TestJunit2.class
})

public class JunitTestSuite{
	
}