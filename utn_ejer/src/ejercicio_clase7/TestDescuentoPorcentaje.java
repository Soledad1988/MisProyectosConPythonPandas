package ejercicio_clase7;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

public class TestDescuentoPorcentaje {

	DescuentoPorcentaje objItemDtoPorcentaje;
	
	@BeforeEach
	public void setUp() {objItemDtoPorcentaje = new DescuentoPorcentaje();}
	
	@org.junit.jupiter.api.Test
	void testcalcularDtoFijo() {
		objItemDtoPorcentaje.setDescuentoPorcentaje(0.21);;
		
		double subTotal=objItemDtoPorcentaje.venta(1000);
		double subTotalEsperado = 790.0;
		
		boolean resultado = (subTotal == subTotalEsperado);
		assertTrue(resultado);
		
	}
}
