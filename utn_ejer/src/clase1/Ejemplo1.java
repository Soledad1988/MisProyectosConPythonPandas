package clase1;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
	
		int num1, num2, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el segundo número ");
		num2 = teclado.nextInt();
		
		resultado = num1 + num2;
		System.out.println("El resultado es: \n"+resultado);
	}
	
	
}
