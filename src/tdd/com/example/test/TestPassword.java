package tdd.com.example.test;

import org.junit.Test;

import org.junit.Assert; 

/**
* @author Krishna Bhat
*
*/

public class TestPassword {
	//test to check valid password: length is between 8 and 20 and alphabet and number
	@Test
	public void TestUserPassword(String password){
		PasswordValidator passValid = new PasswordValidator();
		
		Assert.assertEquals(true, passValid.isValid("KrI123Bhat"));
	}
}
