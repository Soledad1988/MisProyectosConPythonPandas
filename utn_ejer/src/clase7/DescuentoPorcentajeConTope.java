package clase7;

public class DescuentoPorcentajeConTope extends Descuento{
	
	//private ItemCarrito[] itemCarrito;
	private Carrito carro;

	public Carrito getCarro() {
		return carro;
	}

	public void setCarro(Carrito carro) {
		this.carro = carro;
	}

	@Override
	public double venta(double total) {
		double dtoConTope = 0;
			if ( carro.getNumeroCarrito()>3) {
				dtoConTope =  total -(total * this.getDescuentoPorcentaje());
			}
		return dtoConTope;
		
	}

}
