
package ejercicio_clase7;


public class ItemCarrito {

	private Producto producto;
	private int cantidadProducto;
	
	public ItemCarrito() {
		
	}
	
	public ItemCarrito(Producto producto, int cantidadProducto) {
		super();
		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
	}

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
	
	//Método Subtotal
		public double calcularSubtotal() {
			double subtotal=0;
			
			subtotal = cantidadProducto * producto.getPrecio();
			
			return subtotal;
		}
	
	
	//calcularPrecio
		public double precio(double precio) {
			return  cantidadProducto * producto.getPrecio();
		}
		

}
