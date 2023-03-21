package utn_ejer;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;

//lectura de archivos
public class Clase_4 {

	public static void main(String[] args)throws IOException{
		
		String archivo = "D:\\Users\\Brenda\\Desktop\\PruebasGit-UTN\\PrubaGit.txt";
		for(String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea);
		}
		
		
	}
}
