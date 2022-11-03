package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import CalculadoraMaven.CalculadoraMaven.*;

class TestCalculadora {
	
	CalculadoraApp calculadora;
	Functions functions;
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		functions = new Functions();
		calculadora = new CalculadoraApp();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		functions.clear();
		calculadora.clear();
	}
	
	@Test
	void testCalculadoraApp() {
		calculadora = new CalculadoraApp();
		calculadora.main(null);
	}
	
	@Test
	void testSumar() {
		double resultado = Functions.sumar("6", "6");
		double esperado = 12;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testRestar() {
		double resultado = Functions.restar("6", "6");
		double esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicar() {
		double resultado = Functions.multiplicar("6", "6");
		double esperado = 36;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDividir() {
		double resultado = Functions.dividir("6", "6");
		double esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testSumarError() {
		double resultado = Functions.sumar("6", "aa");
		double esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testRestarError() {
		double resultado = Functions.restar("6", "aa");
		double esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicarError() {
		double resultado = Functions.multiplicar("6", "aa");
		double esperado = 0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDividirError() {
		double resultado = Functions.dividir("6", "aa");
		double esperado = 0;
		assertEquals(esperado, resultado);
	}
}
