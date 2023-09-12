package clase7;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double venta(double total) {
		return total -(total * this.getDescuentoPorcentaje());
	}	
}
