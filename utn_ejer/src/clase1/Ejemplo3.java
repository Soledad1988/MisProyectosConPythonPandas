package clase1;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el número para la table: ");
		
		byte num = lector.nextByte(); //tabla del número usando for
		
		System.out.println("Uso de FOR");
		for(int i=0;i<=10;i++) {
			System.out.println(i*num);
		}
		
		System.out.println("Uso de WHILE");
		
		int contador=0;
		while(contador<=10) {
			System.out.println(contador*num);
			contador++;
		}
		
		int cont=0;
		System.out.println("Uso de DO - WHILE");
		do {
			System.out.println(cont*num);
			cont++;
		}while(cont<=10);
		
	}
}
