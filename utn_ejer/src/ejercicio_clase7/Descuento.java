package ejercicio_clase7;

public class Descuento {

	private String tipo;
	private double porcentaje;
	private int montoFijo;
	
	
	public Descuento() {
		
	}
	
	public Descuento(String tipo, double porcentaje, int montoFijo) {
		super();
		this.tipo = tipo;
		this.porcentaje = porcentaje;
		this.montoFijo = montoFijo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public int getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(int montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	
}
