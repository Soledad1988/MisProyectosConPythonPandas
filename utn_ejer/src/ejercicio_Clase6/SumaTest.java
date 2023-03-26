package ejercicio_Clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

	Calculadora ObjSumaTest;
	
	@BeforeEach
	public void setUp() { ObjSumaTest = new Calculadora();}
	
	@org.junit.jupiter.api.Test
	void sumar() {
		ObjSumaTest.setUnNumero(70);
		ObjSumaTest.setOtroNumero(40);
		
		double resultadoParcial = ObjSumaTest.sumar();
		double resultadoEsperado = 110.0;
		
		boolean total = (resultadoParcial == resultadoEsperado);
		assertTrue(total);
	}
	
	
}
