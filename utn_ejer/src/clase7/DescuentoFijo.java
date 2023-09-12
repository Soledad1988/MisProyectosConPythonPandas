package clase7;

public class DescuentoFijo extends Descuento{

	@Override
	public double venta(double total) {
		return total - this.getDescuentoFijo();
	}


}