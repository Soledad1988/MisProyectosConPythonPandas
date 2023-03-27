package trabajoPracticoIntegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Prueba {
	public static void main(String[] args) {
	
		
		try {		
			for(String linea: Files.readAllLines(Paths.get("D:\\Users\\Brenda\\Desktop\\Java - UTN\\TrabajoPractico\\resultados.csv"))) {
				System.out.println(linea);
				
					/*String equipo1 = linea.split(",")[0];
					int golesEquipo1 = Integer.parseInt(linea.split(",")[1]);
					int golesEquipo2 = Integer.parseInt(linea.split(",")[2]);
					String equipo2 = linea.split(",")[3];
					
					Partido partido1 = new Partido();*/
				
			}
			
	
			
			for(String linea: Files.readAllLines(Paths.get("D:\\Users\\Brenda\\Desktop\\Java - UTN\\TrabajoPractico\\pronostico.csv"))) {
				System.out.println(linea);
			}
		
			
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}
		
		System.out.println("\nPuntaje es = ");
		
	}
}
