package utn_ejer;

import java.util.Arrays;

//Dado un vector de números, y un número X, que sume todo los números
//> X y retorne el resultado
public class Ejercicio3_1_C {
	
	public static void main(String[] args) {

		int[] numeros = {25, 13, 10, 47};
		
		int suma = 0;
		int x = 5;
		
		for(int i=0; i < numeros.length;i++) {
			
			if(numeros[i]>x) {
				suma+=numeros[i];	
			}
		}
		System.out.println("La suma es "+suma);
		System.out.println(Arrays.toString(numeros));
		
	}
	
}
