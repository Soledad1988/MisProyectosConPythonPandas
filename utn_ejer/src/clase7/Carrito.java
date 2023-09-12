package clase7;

import java.time.LocalDateTime;
import java.util.Scanner;


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
	
	//metodo calcular deto descuento
	public double descuento() {
	 Scanner p = new Scanner(System.in);
	 System.out.println("desea calcular descuento? ");
	 System.out.println("1 - Descuento Fijo\n"
	         		+ "2 - Descuento por Porcentaje\n"
	         		+ "3 - Descuento con minimo de compra\n"
	         		+ "0 - SALIR");
	 System.out.print("Ingrese una opcion\n");
	 Scanner leer = new Scanner(System.in);
	 char opcion = leer.next().charAt(0);

	 
	 SALIR:
	 switch(opcion) {
	 case '1':
		 	System.out.println("Ingrese importe fijo");
		 	int n = p.nextInt();
		 	Descuento dtofijo = new DescuentoFijo();
			dtofijo.setDescuentoFijo(n);
			System.out.println("----------------------------");
			System.out.println("Total compra con descuento Fijo: ");
			System.out.println(dtofijo.venta(total()));
		break;
		
	 case '2':
		 	System.out.println("Porcentajes a plicar 20%");
		 	Descuento dtoporc = new DescuentoPorcentaje();
			dtoporc.setDescuentoPorcentaje(0.2);
			System.out.println("----------------------------");
			System.out.println("Total compra con descuento Porcentaje: ");
			System.out.println(dtoporc.venta(total()));
		break;
		
	 case '3':
		 	System.out.println("El minimo de compras es de 3 unidades y desco del 30%");
		    	Descuento minimo = new DescuentoPorcentajeConTope();
				minimo.setDescuentoPorcentaje(0.30);
				System.out.println("total a pagar");
				System.out.println(minimo.venta(total()));
		 
			
		break;
	
		default:
			System.out.println("----------------------------");
			System.out.println("Total compra: "+total());
			break SALIR;
		}
	 
	    return opcion;
		}
	
	
}

	