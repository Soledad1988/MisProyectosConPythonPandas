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
	
	Arrays.sort(numeros);
	System.out.println("-----Orden Ascendente--------");
	for(i=0;i<numeros.length;i++) {
		System.out.println(numeros[i]);
	}
			
	}

}
