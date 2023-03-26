package ejercicio_Clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class RestaTest {

Calculadora ObjRestaTest;
	
	@BeforeEach
	public void setUp() { ObjRestaTest = new Calculadora();}
	
	@org.junit.jupiter.api.Test
	void resta() {
		ObjRestaTest.setUnNumero(90);
		ObjRestaTest.setOtroNumero(50);
		
		double resultadoParcial = ObjRestaTest.restar();
		double resultadoEsperado = 40.0;
		
		boolean total = (resultadoParcial == resultadoEsperado);
		assertTrue(total);
	}
	
}
