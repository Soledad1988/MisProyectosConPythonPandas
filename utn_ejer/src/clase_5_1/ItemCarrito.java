package clase_5_1;

public class ItemCarrito {

	Producto producto;
	int cantidadProducto;
	
	//constructor
	public ItemCarrito() {
		
	}
	
	//metodo subtotal
	public double calcularSubotal() {
		 return producto.precio * this.cantidadProducto;
	}

	//Getter y Setter
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	
	
}
