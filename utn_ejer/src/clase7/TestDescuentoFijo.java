package clase7;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;


public class TestDescuentoFijo {

	DescuentoFijo objItemDtoFijo;
	
	@BeforeEach
	public void setUp() {objItemDtoFijo = new DescuentoFijo();}
	
	@org.junit.jupiter.api.Test
	void testcalcularDtoFijo() {
		objItemDtoFijo.setDescuentoFijo(100);
		
		double subTotal=objItemDtoFijo.venta(1000);
		double subTotalEsperado = 900.0;
		
		boolean resultado = (subTotal == subTotalEsperado);
		assertTrue(resultado);
		
	}
}
