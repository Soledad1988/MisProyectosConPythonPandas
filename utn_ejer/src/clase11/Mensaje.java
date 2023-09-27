package clase11;

public class Mensaje {
 
	String mensaje;

	public Mensaje() {
	}
	
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void guardarMensaje(Mensaje mensaje) {
	}
	
	public void mostrarMensaje() {
		
	}

	@Override
	public String toString() {
		return mensaje;
	}

 
	
}
