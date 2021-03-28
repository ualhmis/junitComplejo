package junitenclase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import junitComplejo.Complejo;

class TestSumaRestaComplejos {

	@ParameterizedTest (name = "{index} => sumar ({0},{1}) con ({2},{3}) sale ({4},{5})")
	@CsvSource({"  3,  5,  1, -1,  4,  4 ", 
		"  3,  5,  1,  1,  4,  6 ", 
		" -3,  5, -1,  1, -1,  6 ", 
		" -3, -5, -1,  1, -4, -3 ", 
	" -3, -5, -1, -1, -4, -6 "})

	void testsuma(int c1_pr, int c1_pi, int c2_pr, int c2_pi, int exp_pr, int exp_pi){
		// 1. Arrange 
		Complejo c1 = new Complejo(c1_pr, c1_pi);
		Complejo c2 = new Complejo(c2_pr, c2_pi);
		// 2. Act
		Complejo resultado = c1.sumar(c2);
		// 3. Assert
		assertEquals(exp_pr, resultado.getParteReal(), 0.0000001, "Falla la parte real");
		assertEquals(exp_pi, resultado.getParteImaginaria(), 0.0000001, "Falla la parte imaginaria");
	}


	@ParameterizedTest (name = "{index} => restar ({0},{1}) menos ({2},{3}) sale ({4},{5})")
	@CsvFileSource(files = "test/junitenclase/datosResta.csv")
	void testresta(int c1_pr, int c1_pi, int c2_pr, int c2_pi, int exp_pr, int exp_pi){
		// 1. Arrange 
		Complejo c1 = new Complejo(c1_pr, c1_pi);
		Complejo c2 = new Complejo(c2_pr, c2_pi);
		// 2. Act
		Complejo resultado = c1.restar(c2);
		// 3. Assert: assertAll comprueba varios asserts (JUnit 5)
		assertAll(
				() -> assertEquals(exp_pr, resultado.getParteReal(), 0.0000001, "Falla la parte real"),
				() -> assertEquals(exp_pi, resultado.getParteImaginaria(), 0.0000001, "Falla la parte imaginaria")
				);
	}




	@ParameterizedTest(name = "{index} => sumar {0} con {1} sale {2}")
	@MethodSource("complejoProvider")
	void testWithExplicitLocalMethodSourceSumaComplejos(Complejo c1, Complejo c2, Complejo expected) {
		assertNotNull(c1);
		assertNotNull(c2);
		assertNotNull(expected);
		
		// 2. Act
		Complejo resultado = c1.sumar(c2);
		// 3. Assert: assertAll comprueba varios asserts (JUnit 5)
		assertAll(
				() -> assertEquals(expected.getParteReal(), 		resultado.getParteReal(), 0.0000001, "Falla la parte real"),
				() -> assertEquals(expected.getParteImaginaria(), 	resultado.getParteImaginaria(), 0.0000001, "Falla la parte imaginaria")
				);
	}

	static Stream<Arguments> complejoProvider() {
		return Stream.of(
				Arguments.of(new Complejo(3, -1), new Complejo (2, 1),  new Complejo(5, 0)),
				Arguments.of(new Complejo(3, -1), new Complejo (2, -2), new Complejo(4, -2))
			);
	}


}
