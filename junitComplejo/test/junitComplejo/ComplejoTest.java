package junitComplejo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplejoTest {

	@Test
	public void testSumaComplejos(){
        // 1. Arrange 
        Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(1, -1);
        // 2. Act
        Complejo resultado = c1.sumar(c2);
        // 3. Assert
        assertTrue("Error en la parte real de la suma", resultado.getParteReal()==4);
        assertTrue("Error en la parte imaginaria de la suma", resultado.getParteImaginaria()==4);
  }     

}
