package ejercicio_Clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

	Calculadora ObjDivisionTest;
	
	@BeforeEach
	public void setUp() { ObjDivisionTest = new Calculadora();}
	
	@org.junit.jupiter.api.Test
	void dividir() {
		ObjDivisionTest.setUnNumero(330);
		ObjDivisionTest.setOtroNumero(3);
		
		double resultado = ObjDivisionTest.dividir();
		double resultadoEsperado = 110.0;
		
		boolean total = (resultado == resultadoEsperado);
		assertTrue(total);
	}

}
