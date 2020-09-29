package JavaInterview.JavaInterview;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import org.junit.Test;



public class Prime {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();

		System.out.print("Enter the second number : ");
		int end = s.nextInt();

		System.out.println("List of prime numbers between " + start + " and " + end);

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	
	/** Sample data for testIsPrime. */
	private static final int SAMPLE_PRIMES[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 1021 };

	/** Sample data for Sample_Not_Primes */
	private static final int SAMPLE_NOT_PRIMES[] = { 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28,
			30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50 };

	
	
	@Test
	public void testIsPrime() {
		for (int p : SAMPLE_PRIMES) {
			assertTrue(isPrime(p));
		}
	}

	@Test
	public void testIsNotPrime() {
		for (int p : SAMPLE_NOT_PRIMES) {
			assertFalse(isPrime(p));
		}
	}

}
