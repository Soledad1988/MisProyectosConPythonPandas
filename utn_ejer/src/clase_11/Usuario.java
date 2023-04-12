package clase_11;

public class Usuario {

	String nombre;
	Mensaje mensaje;
	
	public Usuario() {
	
	}
	

	public Usuario(String nombre, Mensaje mensaje) {
		super();
		this.nombre = nombre;
		this.mensaje = mensaje;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Mensaje getMensaje() {
		return mensaje;
	}


	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}



	@Override
	public String toString() {
		
		return "Usuario:" + nombre + "\n"+
				"Mensaje:" + mensaje;
	}
	
	
	
}
