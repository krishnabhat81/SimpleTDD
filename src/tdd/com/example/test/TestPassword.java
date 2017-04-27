package tdd.com.example.test;

import org.junit.Test;

import tdd.com.example.PasswordValidator;

import org.junit.Assert; 

/**
* @author Krishna Bhat
*
*/

public class TestPassword {
	//test to check valid password: length is between 8 and 20 and alphabet and number
	@Test
	public void TestUserPassword(){
		PasswordValidator passValid = new PasswordValidator();
		
		Assert.assertEquals(true, passValid.isValid("KrI12@3Bhat"));
	}
}
