package utn_ejer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio4_3 {
	
	public static void main(String[] args) {
		
	Scanner p = new Scanner(System.in);
	
	String letras = "abcdefghijklmnñopqrstuvwxyz";
	
	System.out.println("Desea Codificar o Decodificar");
	System.out.println("Opcion 1: Codificar");
	System.out.println("Opcion 2: Decodificar");
	
	System.out.print("\nIngrese una opcion: ");
	Scanner leer = new Scanner(System.in);
	
	char opcion = leer.next().charAt(0);
	
	switch(opcion) {
	
	case '1': //Codificacion de archivo de Entrada
		
		try {
			String archivo = "D:\\Users\\Brenda\\Desktop\\Clase4\\datosEntrada.txt";
			for(String linea : Files.readAllLines(Paths.get(archivo))) {
				
				System.out.println("Ingrese número de desplazamiento ");
				int desplazo = p.nextInt();
				
				String texto = codificar(letras,linea, desplazo);
				
				System.out.println("El archivo ha sido codificado");
				
				FileWriter salida = null;
		        PrintWriter pw = null;
				salida = new FileWriter("D:\\Users\\Brenda\\Desktop\\Clase4\\codificacion.txt");
	            pw = new PrintWriter(salida);
	            
	            pw.println(texto.replace(" ", ""));

	            salida.close();
			}
			
			
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}	
		
		break;
		
	case '2': //Decodificacion de archivo de Entrada
		
		try {
			String archivo = "D:\\Users\\Brenda\\Desktop\\Clase4\\datoSalida.txt";
			for(String linea : Files.readAllLines(Paths.get(archivo))) {
				
				System.out.println("Ingrese número de desplazamiento ");
				int desplazo = p.nextInt();
				
				String texto = descodificar(letras,linea, desplazo);
				
				System.out.println("El archivo ha sido Decodificado ");
				
				FileWriter salida = null;
		        PrintWriter pw = null;
				salida = new FileWriter("D:\\Users\\Brenda\\Desktop\\Clase4\\decodificacion.txt");
	            pw = new PrintWriter(salida);
	            
	                pw.println(texto);

	            salida.close();
			}
			
			
		}catch(IOException ex) {
			System.out.println("no se encontro el archivo");
		}
		
		break;
		
	default:
	}
	
   } 
	
	//--Función Codificar -------
	public static String codificar(String letras, String texto, int desplazo) {
		String textoCodificado = "";
		
		char caracter;
	
		for(int i=0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			
			int pos = letras.indexOf(caracter);
			
			if(pos == 1) {
				textoCodificado += caracter;
			}else {
				textoCodificado+= letras.charAt((pos + desplazo)%letras.length());
			}
			
		}
		return textoCodificado;
	}
	
	//--funcion Decdificar -----
	public static String descodificar(String letras, String texto, int desplazo){
	    String textoDescodificado = "";
	
	    
	    char caracter;
	    for (int i = 0; i < texto.length(); i++) {
	        caracter = texto.charAt(i);
	 
	        int pos = letras.indexOf(caracter);
	        
	        if(pos == -1){
	            textoDescodificado += caracter;
	        }else{
	            if(pos - desplazo < 0){
	                textoDescodificado += letras.charAt( letras.length() + (pos - desplazo) );
	            }else{
	                textoDescodificado += letras.charAt( (pos - desplazo) % letras.length());
	            }
	        }
	    }
	    return textoDescodificado;
	}
	
}

