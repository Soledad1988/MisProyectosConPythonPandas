package clase6;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ItemCompraTest {

	ItemCompra objItemCompraTest;
	
	@BeforeEach
	public void setUp() {objItemCompraTest = new ItemCompra();}
	
	
	@org.junit.jupiter.api.Test
	void testcalcularSubtotal() {
		objItemCompraTest.setCantidad(2);
		objItemCompraTest.setProducto(new Producto("arroz",200));
		
		
		double subTotal=objItemCompraTest.calcularSubtotal();
		double subTotalEsperado = 400.0;
		
		boolean resultado = (subTotal == subTotalEsperado);
		assertTrue(resultado);
	}
}
