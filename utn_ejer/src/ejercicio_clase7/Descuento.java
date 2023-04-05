package ejercicio_clase7;

public abstract class Descuento {

	private double venta;
	
	public double getVentaDesc() {
	return venta;
	}
	
	public void setVentaDesc(double venta) {
	this.venta = venta;
	}
	
	public abstract double venta(double precioInicial);
	
	
	
	
	    /*private double venta;
		private int monto;
		private int porcentaje;
		
		public int getMonto() {
			return monto;
		}
		public void setMonto(int monto) {
			this.monto = monto;
		}
		public int getPorcentaje() {
			return porcentaje;
		}
		public void setPorcentaje(int porcentaje) {
			this.porcentaje = porcentaje;
		}
		
		public int descuentoFifo() {
			double totalConDto;
			return (int) (totalConDto = this.venta - this.monto);
		}
		
		public int descuentoPorcentaje() {
			double totalConDto;
			return (int) ((totalConDto = this.venta * this.porcentaje)/100);
		}*/

		
}
