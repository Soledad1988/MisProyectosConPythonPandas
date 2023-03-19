package clase_5_1;

public class Carrito {

	int numeroCarrito;
	ItemCarrito itemCarrito;
	String fechaCompra;
	
	//constructor
	public Carrito() {
		
	}
	
	//constructor con parametros
	public Carrito(int numeroCarrito, String fechaCompra) {
		this.numeroCarrito = numeroCarrito;
		this.fechaCompra = fechaCompra;
	}

	//metodo calculatTotal
	public double calcularTotal(double precio, int cantidad) {
		return precio * cantidad;
	}
	
	//metodo agregar items
	public void agregarItem() {
		
	}
	
	//Getter y setter
	public int getNumeroCarrito() {
		return numeroCarrito;
	}

	public void setNumeroCarrito(int numeroCarrito) {
		this.numeroCarrito = numeroCarrito;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	

	
}
