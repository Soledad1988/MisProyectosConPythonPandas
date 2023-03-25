package clase_5_1;

public class ItemCarrito {

	private Producto producto;
	private int cantidadProducto;
	
	//constructor
	public ItemCarrito() {
		
	}

	public ItemCarrito(Producto producto, int cantidadProducto) {
		super();
		this.producto = producto;
		this.cantidadProducto = cantidadProducto;
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
	
	//Método Subtotal
	public double calcularSubtotal() {
		double subtotal=0;
		
		subtotal = cantidadProducto * producto.getPrecio();
		
		return subtotal;
	}
	
	
}
