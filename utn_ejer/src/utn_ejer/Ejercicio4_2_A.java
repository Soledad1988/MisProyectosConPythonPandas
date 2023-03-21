package utn_ejer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//haga un main donde por parametro envie ruta de un archivo. Ese archivo debe contener números.
//El programa debe escribir por consola la suma de esos números
public class Ejercicio4_2_A {

	public static void main(String[] args){
	
		try {
		
			BufferedReader archivo = new BufferedReader(new FileReader("D:\\Users\\Brenda\\Desktop\\Clase4\\numeros.txt")); 
			
			String linea = "0";
			
			double suma = 0;
			
			while(linea != null) {
				suma+=Double.parseDouble(linea);
				linea=archivo.readLine();
			}
			archivo.close();
			
			System.out.println("La suma es " + suma);
		
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}	
		
	}
}
