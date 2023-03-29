package ejercicio_clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Prueba {

public static void main(String[] args) {
		
		Carrito compra=new Carrito();
		
		System.out.println("----------------------------");
		System.out.println("|cantidad |precio | producto|");
		System.out.println("----------------------------");
		
		try {		
			int i = 0;
			for(String linea: Files.readAllLines(Paths.get("D:\\Users\\Brenda\\Desktop\\prubaCarrito\\productos.txt"))) {
				System.out.println(linea);
			
				int cantidad = Integer.parseInt(linea.split(",")[0]);
				double precio = Double.parseDouble(linea.split(",")[1]);
				String nombre = linea.split(",")[2];
				
				
				Producto producto1 = new Producto(nombre,null,precio);
				ItemCarrito itemCarrito = new ItemCarrito(producto1,cantidad);
				
				compra.getItemCarrito()[i] = itemCarrito;
				
				i++;
			}
			
			System.out.println("----------------------------");
			System.out.println("Total compra: "+compra.total());
			System.out.println("----------------------------");
			
			System.out.println("total de items "+compra.agregarItem(i));
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}
		
	}
}
