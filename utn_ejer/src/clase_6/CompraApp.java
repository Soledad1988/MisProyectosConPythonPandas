package clase_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompraApp {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		
	
		try {		
			int i = 0;
			for(String linea: Files.readAllLines(Paths.get("D:\\Users\\Brenda\\Desktop\\prubaCarrito\\archivo.txt"))) {
				System.out.println(linea);
				String nombre = linea.split(",")[0];
				int cantidad = Integer.parseInt(linea.split(",")[1]);
				double precio = Double.parseDouble(linea.split(",")[2]);
				
				Producto producto1 = new Producto(nombre, precio);
				ItemCompra item = new ItemCompra(producto1, cantidad);
				
				compra.getItems()[i] = item;
				
				i++;
			}
			
			System.out.println("Total compra: "+compra.total());
			
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}
		
	}
}
