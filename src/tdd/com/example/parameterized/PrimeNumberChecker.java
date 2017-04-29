package tdd.com.example.parameterized;

/**
 * @author Krishna Bhat
 *
 */

public class PrimeNumberChecker {
	//is prime? check/validate
	public boolean validate(final int primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
