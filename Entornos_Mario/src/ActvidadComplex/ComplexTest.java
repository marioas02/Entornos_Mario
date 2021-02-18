package ActvidadComplex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	@DisplayName ("Prueba de la Suma 1")
	void testSumar1() {
		/**
		 * Suma de Números Complejos:
		 * (a, b) + (c, d) = (a + c, b + d)
		 */
		
		Complex numero1 = new Complex(30, 80);
		Complex numero2 = new Complex(35, 93);

		Complex prueba1 = numero1.sumar(numero2);
		Complex resultado = new Complex(65, 173);
		assertEquals(prueba1, resultado);
	}
	
	@Test
	@DisplayName ("Prueba de la Suma 2")
	void testSumar2() {
		/**
		 * Suma de Números Complejos:
		 * (a, b) + (c, d) = (a + c, b + d)
		 */
		
		Complex numero1 = new Complex(100, 63);
		Complex numero2 = new Complex(-35, 93);

		Complex prueba1 = numero1.sumar(numero2);
		Complex resultado = new Complex(65, 156);
		assertEquals(prueba1, resultado);
	}

	@Test
	@DisplayName ("Prueba de la Resta 1 (Enteros)")
	void testRestar1() {
		/**
		 * Resta de Números Complejos (Enteros):
		 * (a, b) - (c, d) = (a - c, b - d)
		 */
		
		Complex numero1 = new Complex(80, 230);
		Complex numero2 = new Complex(45, 120);

		Complex prueba1 = numero1.restar(numero2);
		Complex resultado = new Complex(35, 110);
		assertEquals(prueba1, resultado);
	}

	@Test
	@DisplayName ("Prueba de la Resta 2 (Negativos)")
	void testRestar2() {
		/**
		 * Resta de Números Complejos (Negativos):
		 * (a, b) - (c, d) = (a - c, b - d)
		 */
		
		Complex numero1 = new Complex(-50, 180);
		Complex numero2 = new Complex(-4, -20);

		Complex prueba1 = numero1.restar(numero2);
		Complex resultado = new Complex(-46, 200);
		assertEquals(prueba1, resultado);
	}
	
	@Test
	@DisplayName ("Prueba de la Resta 3 (Ceros)")
	void testRestar3() {
		/**
		 * Resta de Números Complejos (Ceros):
		 * (a, b) - (c, d) = (a - c, b - d)
		 */
		
		Complex numero1 = new Complex(46, 34);
		Complex numero2 = new Complex(0, 0);

		Complex prueba1 = numero1.restar(numero2);
		Complex resultado = new Complex(46, 34);
		assertEquals(prueba1, resultado);
	}
	
	@Test
	@DisplayName ("Prueba de la Multiplicación Complex 1")
	void testMultiplicarComplex1() {
		/**
		 * Multiplicación de Números Complejos:
		 * (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
		 */
		
		Complex numero1 = new Complex(12, 10);
		Complex numero2 = new Complex(8, 20);

		Complex prueba1 = numero1.multiplicar(numero2);
		Complex resultado = new Complex(-104, 320);
		assertEquals(prueba1, resultado);
	}
	
	@Test
	@DisplayName ("Prueba de la Multiplicación Complex 2")
	void testMultiplicarComplex2() {
		/**
		 * Multiplicación de Números Complejos:
		 * (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
		 */
		
		Complex numero1 = new Complex(-3, -4);
		Complex numero2 = new Complex(0, 9);

		Complex prueba1 = numero1.multiplicar(numero2);
		Complex resultado = new Complex(36, -27);
		assertEquals(prueba1, resultado);
	}

	@Test
	@DisplayName ("Prueba de la Multiplicación Double 1")
	void testMultiplicarDouble1() {
		/**
		 * Multiplicación de Números Complejos por un Número de Tipo Double:
		 * (a, b) * n = (a * n, b * n)
		 */
		
		Complex numero1 = new Complex(34, 10);

		Complex prueba1 = numero1.multiplicar(2.4);
		Complex resultado = new Complex(81.6, 24);
		assertEquals(prueba1, resultado);
	}

	@Test
	@DisplayName ("Prueba de la Multiplicación Double 2")
	void testMultiplicarDouble2() {
		/**
		 * Multiplicación de Números Complejos por un Número de Tipo Double:
		 * (a, b) * n = (a * n, b * n)
		 */
		
		Complex numero1 = new Complex(-12, 2);

		Complex prueba1 = numero1.multiplicar(3.5);
		Complex resultado = new Complex(-42, 7);
		assertEquals(prueba1, resultado);
	}
	
	@Test
	@DisplayName("Prueba de la División 1 (Enteros)")
	void testDividir1() {
		/**
		 * Dividisión de dos Números Complejos (Enteros):
		 * (a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		 */
		
		Complex numero1 = new Complex(59, 25);
		Complex numero2 = new Complex(54, 37);

		double prueba1 = (double) (59 * 54 + 25 * 37) / (double) (54 * 54 + 37 * 37);
		double prueba2 = (double) (25 * 54 - 59 * 37) / (double) (54 * 54 + 37 * 37);

		Complex obtenido = numero1.dividir(numero2);
		Complex esperado = new Complex(prueba1, prueba2);
		assertEquals(obtenido, esperado);
	}
	
	@Test
	@DisplayName ("Prueba de la División 2 (Negativos)")
	void testDividir2() {
		/**
		 * Dividisión de dos Números Complejos (Negativos):
		 * (a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		 */
		
		Complex numero1 = new Complex(68, -25);
		Complex numero2 = new Complex(-514, 307);

		double prueba1 = (double) (68 * -514 + -25 * 307) / (double) (-514 * -514 + 307 * 307);
		double prueba2 = (double) (-25 * -514 - 68 * 307) / (double) (-514 * -514 + 307 * 307);

		Complex obtenido = numero1.dividir(numero2);
		Complex esperado = new Complex(prueba1, prueba2);
		assertEquals(obtenido, esperado);
	}
		
	@Test
	@DisplayName ("Prueba de la División 3 (Ceros)")
	void testDividir3() {
		/**
		 * Dividisión de dos Números Complejos (Ceros):
		 * (a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
		 */
		
		Complex numero1 = new Complex(90, 0);
		Complex numero2 = new Complex(0, 45);

		double prueba1 = (double) (90 * 0 + 0 * 45) / (double) (0 * 0 + 45 * 45);
		double prueba2 = (double) (0 * 0 - 90 * 45) / (double) (0 * 0 + 45 * 45);

		Complex obtenido = numero1.dividir(numero2);
		Complex esperado = new Complex(prueba1, prueba2);
		assertEquals(obtenido, esperado);
	}

	@Test
	@DisplayName("Prueba de Equals 1")
	void testEqualsObject1() {
		/**
		 * Compara el Primer Número con el Segundo.
		 */

		Complex numero1 = new Complex(9, 13);
		Complex numero3 = new Complex(-27, -3.4);

		assertFalse(numero1.equals(numero3));
	}

	@Test
	@DisplayName("Prueba de Equals 2")
	void testEqualsObject2() {
		/**
		 * Compara el Primer Número con el Segundo.
		 */

		Complex numero1 = new Complex(-4, 2);
		Complex numero2 = new Complex(-4, 2);

		assertTrue(numero1.equals(numero2));
	}

}