package junitParametrized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junitParametrized.Addition;

//JUnit Test Parametrized 
//http://examples.javacodegeeks.com/core-java/junit/junit-parameterized-test-example/ 	

@RunWith(Parameterized.class)
public class AdditionTest {

	private int expected;
	private int first;
	private int second;
	private Addition add;

	public AdditionTest(int expectedResult, int firstNumber,
			int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] { 
			{ 3, 1, 2 }, 
			{ 5, 2, 3 },
			{ 7, 3, 4 }, 
			{ 9, 4, 5 }, 
		});
	}

	@Before
	public void setUp() {
		add = new Addition();
	}
	
	@Test
	public void testAddNumbers() {
		System.out.println("Addition with parameters : " + first + " and " + second);
		assertEquals(expected, add.addNumbers(first, second));
	}

}
