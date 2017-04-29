package tdd.com.example.annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Krishna Bhat
 *
 */

/*
 * Annotations are like meta-tags that you can add to your code, and apply them
 * to methods or in class
 */

/*
 * WHY BeforeClass and AfterClass should have to be static
 * => JUnit always creates one instance of the test class for each @Test method. 
 * This is a fundamental design decision to make it easier to write tests without side-effects.
 * 
 * So, to make class level, we simply need to make static for class level (static in JAVA)
 * 
 * And because each test method has its own instance, it makes no sense for the @BeforeClass/@AfterClass methods to be instance methods.
 */
public class JunitAnnotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class called (Only once).");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class called (Only once).");
	}

	@Before
	public void before() {
		System.out.println("Before is called");
	}

	@After
	public void after() {
		System.out.println("After is called");
	}

	// test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("Ignore is called");
	}

	@Test
	public void testMethod1() {
		System.out.println("Tet method1 is called");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Tet method2 is called");
	}
}
