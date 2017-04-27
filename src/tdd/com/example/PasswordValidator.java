package tdd.com.example;

/**
* @author Krishna Bhat
*
*/

public class PasswordValidator {
	public boolean isValid(String password){
		//start string
		//a digit must occur at least once
		//a lower case letter must occur at least once
		//an upper case letter must occur at least once
		//a special character must occur at least once
		//no whitespace allowed in the entire string
		//anything, at least eight places and max 20

		if(password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}")){
			return true;
		}
		return false;
	}
}
