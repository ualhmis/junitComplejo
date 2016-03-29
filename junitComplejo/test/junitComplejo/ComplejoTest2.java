package junitComplejo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplejoTest2 {
	Complejo c1, c2;
	
	@Before
	public void setUp() throws Exception {
        // 1. Arrange 
        c1 = new Complejo(3, 5);
        c2 = new Complejo(1, -1);

	}

	@Test
	public void testRestar() {
		
		Complejo resultado = c1.restar(c2);  // 2. Act
		
		//3. Assert
		assertEquals(resultado.getParteReal(), 2, 0.0000001);
		assertEquals(resultado.getParteImaginaria(), 6, 0.0000001);
		
	}

}
