import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testMultiplicacion() {
		Calculadora calcu = new Calculadora(1,2,3);
		int resultado = calcu.Multiplicacion();
		assertEquals(6, resultado);
	}

	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(1,2,3);
		int resultado = calcu.Suma();
		assertEquals(6, resultado);
	}

	@Test
	public void testMedia() {
		Calculadora calcu = new Calculadora(1,2,3);
		float resultado = calcu.Media();
		assertEquals(2,resultado, 0);
	}

	@Test
	public void testMayorDTres() {
		Calculadora calcu = new Calculadora(1,2,3);
		int resultado = calcu.MayorDTres();
		assertEquals(3, resultado);
	}

}