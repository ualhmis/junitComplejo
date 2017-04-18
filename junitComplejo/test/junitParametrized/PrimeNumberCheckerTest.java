package junitParametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void setUp() throws Exception {
		primeNumberChecker = new PrimeNumberChecker();
	}

	@Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 21, false },
	         { 23, true }
	      });
	   }
	
	@Test
	public void testValidate() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}

}
