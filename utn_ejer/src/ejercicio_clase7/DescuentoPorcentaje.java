package ejercicio_clase7;

public class DescuentoPorcentaje extends Descuento{

	@Override
	public double venta(double precioInicial) {
		return precioInicial - (precioInicial*this.getVentaDesc());
	}
	
}
