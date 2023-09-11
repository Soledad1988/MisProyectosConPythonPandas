package clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MultiTest {

	Calculadora objMultiTest;
	
	@BeforeEach
	public void setUp() {objMultiTest = new Calculadora();}
	
	@org.junit.jupiter.api.Test
	void multiplicar() {
		objMultiTest.setUnNumero(110);
		objMultiTest.setOtroNumero(25);
		
		double resultado = objMultiTest.multiplicar();
		double resultadoEsperado = 2700.0;
		
		boolean total = (resultado == resultadoEsperado);
		assertFalse(total);
	}
}
