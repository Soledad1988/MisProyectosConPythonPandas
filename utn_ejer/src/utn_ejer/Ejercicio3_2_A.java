package utn_ejer;

import java.util.Scanner;

public class Ejercicio3_2_A {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		String letras = "abcdbefghijklmnñopqrstuvwxyz";
		
		System.out.println("Ingrese una frase (No se aceptan mayusculas): ");
		
		String frase = p.nextLine();
		
		String texto = codificar(letras, frase);
		System.out.println("Texto codificado: " + texto.replace(" ",""));
	   } 
		
		public static String codificar(String letras, String texto) {
			String textoCodificado = "";
			
			char caracter;
			
			for(int i=0; i < texto.length(); i++) {
				caracter = texto.charAt(i);
				
				int pos = letras.indexOf(caracter);
				
				if(pos == 1) {
					textoCodificado += caracter;
				}else {
					textoCodificado+= letras.charAt((pos + 1)%letras.length());
				}
				
			}
			return textoCodificado;
		}
				
}
