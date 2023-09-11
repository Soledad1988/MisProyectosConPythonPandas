package clase6;

public class Calculadora {
	
	private double unNumero;
	private double otroNumero;
	
	public Calculadora() {
	
	}
	
	public Calculadora(double unNumero, double otroNumero) {
		super();
		this.unNumero = unNumero;
		this.otroNumero = otroNumero;
	}
	
	public double getUnNumero() {
		return unNumero;
	}

	public void setUnNumero(double unNumero) {
		this.unNumero = unNumero;
	}


	public double getOtroNumero() {
		return otroNumero;
	}

	public void setOtroNumero(double otroNumero) {
		this.otroNumero = otroNumero;
	}

	public double sumar() {
		double resultado = 0;
		resultado = unNumero + otroNumero;
		return resultado;
	}
	
	public double restar() {
		double resultado = 0;
		resultado = unNumero - otroNumero;
		return resultado;
	}
	
	public double multiplicar() {
		double resultado = 0;
		resultado= unNumero * otroNumero;
		return resultado;
	}
	
	public double dividir() {
		double resultado=0;
		if(otroNumero !=0) {
			resultado=unNumero / otroNumero;
		}else {
			System.out.println("No se puede dividir por cero");
		}
		
		return resultado;
	}
	
}
