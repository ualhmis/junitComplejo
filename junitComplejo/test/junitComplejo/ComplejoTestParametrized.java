package junitComplejo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ComplejoTestParametrized {
	
	private int c1_pr, c1_pi, c2_pr, c2_pi, exp_pr, exp_pi;
	
	public ComplejoTestParametrized (int c1pr, int c1pi, 
									 int c2pr, int c2pi, 
									 int exppr, int exppi){
		c1_pr = c1pr; 
		c1_pi= c1pi;
		c2_pr = c2pr; 
		c2_pi= c2pi;
		exp_pr = exppr; 
		exp_pi= exppi;
	}
	
	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] { 
			{  3,  5,  1, -1,  4,  4 }, 
			{  3,  5,  1,  1,  4,  6 },
			{ -3,  5, -1,  1, -4,  6 }, 
			{ -3, -5, -1,  1, -4, -4 }, 
			{ -3, -5, -1, -1, -4, -6 }, 
		});
	}	

	
	
	@Test
	public void testSumaComplejos(){
        // 1. Arrange 
        Complejo c1 = new Complejo(c1_pr, c1_pi);
        Complejo c2 = new Complejo(c2_pr, c2_pi);
        // 2. Act
        Complejo resultado = c1.sumar(c2);
        // 3. Assert
        assertTrue(resultado.getParteReal()==exp_pr);
        assertTrue(resultado.getParteImaginaria()==exp_pi);
  }     
    
}
