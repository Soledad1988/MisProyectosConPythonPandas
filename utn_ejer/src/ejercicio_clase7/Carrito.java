package ejercicio_clase7;

import java.time.LocalDateTime;


public class Carrito {

	private int numeroCarrito;
	private LocalDateTime fechaCompra;
	private ItemCarrito[] itemCarrito;
	
	public Carrito() {
		this.fechaCompra=LocalDateTime.now();
		this.itemCarrito = new ItemCarrito[3];
	}
	
	public Carrito(int numeroCarrito, LocalDateTime fechaCompra, ItemCarrito[] itemCarrito) {
		super();
		this.numeroCarrito = numeroCarrito;
		this.fechaCompra = fechaCompra;
		this.itemCarrito = itemCarrito;
	}

	public int getNumeroCarrito() {
		return numeroCarrito;
	}

	public void setNumeroCarrito(int numeroCarrito) {
		this.numeroCarrito = numeroCarrito;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public ItemCarrito[] getItemCarrito() {
		return itemCarrito;
	}

	public void setItemCarrito(ItemCarrito[] itemCarrito) {
		this.itemCarrito = itemCarrito;
	}
	


	//metodo calculatTotal
	public double total() {
		double total = 0;
			
		for(int i=0;i<3;i++) {
			ItemCarrito item = itemCarrito[i];
				
			total += item.calcularSubtotal();
				
			total = total + item.calcularSubtotal();
		}
			
		return total;
	}

		
	//metodo agregar items
	public int agregarItem(int carro) {
		for(int i=0;i>0;i++) {
		carro+=i;	
		}
		return carro;
	}
	
	/*public double descuento() {
		double totalConDto = 0;
				
			totalConDto = total() * descuento();
			
		return totalConDto;
	}*/
	
	/*public double precio(Descuento desc) {
	int venta = 0;
	for (int i = 0; i < itemCarrito.length ;i++){ 
		venta = venta + itemCarrito[i].precio(venta)};
	return venta - desc.getVentaDesc();
	}*/
}
