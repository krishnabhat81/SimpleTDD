/**
 * @author krishna1bhat
 *
 */
package tdd.com.example.parameterized;

/*
 * Parameterized JUnit Test
 * --------------------------
 * JUnit 4 introduces.
 * It allow a developer to run the same test over and over again using different values.
 * 
 * There are five steps:
 * ----------------------
 * 1. Annotate test class with @RunWith(Parameterized.class).
 * 2. Create a public static method annotated with @Parameters 
 *    that returns a Collection of Objects (as Array) as test data set.
 * 3. Create a public constructor that takes in what is equivalent to one "row" of test data.
 * 4. Create an instance variable for each "column" of test data.
 * 5. Create your test case(s) using the instance variables as the source of the test data.
 */

//Example
public class ReadMe {

}