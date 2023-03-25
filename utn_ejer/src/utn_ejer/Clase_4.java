package utn_ejer;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;

//lectura de archivos
public class Clase_4 {

	public static void main(String[] args){
		
		String archivo = "D:\\Users\\Brenda\\Desktop\\Clase4\\codificacion.txt";
		try {
			for(String linea : Files.readAllLines(Paths.get(archivo))) {
				System.out.println(linea);
			}
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}
		
	}
	
}
