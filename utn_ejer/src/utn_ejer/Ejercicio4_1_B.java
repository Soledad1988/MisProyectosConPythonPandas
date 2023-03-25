package utn_ejer;

import java.util.Arrays;
import java.util.Scanner;

//haga lo mismo que el ejercicio anterior perso solicitando los parametros de a uno por consola
public class Ejercicio4_1_B {

public static void main(String[] args) {
	Scanner p = new Scanner(System.in);
	
	int i;
	int[] numeros = new int[3]; 
	System.out.printf("Ingrese número 1: ");
	numeros[0] = p.nextInt();
	System.out.printf("Ingrese número 2: ");
	numeros[1] = p.nextInt();
	System.out.printf("Ingrese número 3: ");
	numeros[2] = p.nextInt();
	
	System.out.println("Como desea ordenar los números: \n"
						+"a - Ascendente\n"
			            +"b - descendendte");
	
	System.out.print("\nIngrese una opcion: ");
	Scanner leer = new Scanner(System.in);
	
	char opcion = leer.next().charAt(0);
	
	switch(opcion) {
	
	case 'a':
	System.out.println("-----Orden Ascendente--------");
	for(i=0;i<numeros.length;i++) {
		Arrays.sort(numeros);
		System.out.println(numeros[i]);
	}
	break;
	
	case 'b':
		System.out.println("------Orden Descendente------");
		for(i=numeros.length-1;i>=0;i--) {
			Arrays.sort(numeros);
			System.out.println(numeros[i]);
		}
		
		break;
			
	default:
	}
}
}
