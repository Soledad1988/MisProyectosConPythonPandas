package ejercicio_clase7;

public abstract class Descuento {

	private int descuentoFijo;
	private double descuentoPorcentaje;
	
	public int getDescuentoFijo() {
		return descuentoFijo;
	}

	public void setDescuentoFijo(int descuentoFijo) {
		this.descuentoFijo = descuentoFijo;
	}

	public double getDescuentoPorcentaje() {
		return descuentoPorcentaje;
	}

	public void setDescuentoPorcentaje(double descuentoPorcentaje) {
		this.descuentoPorcentaje = descuentoPorcentaje;
	}

	public abstract double venta(double total);

	/*private double valorDescuento;
		
		public double getValorDescuento() {
		return valorDescuento;
		}
		
		public void setValorDescuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;*/
		
}
