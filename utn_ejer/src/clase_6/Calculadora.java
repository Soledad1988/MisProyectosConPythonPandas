package clase_6;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Ingrese un numero ");
		double unNumero = p.nextDouble();
		System.out.println("Ingrese otro numero ");
		double otroNumero = p.nextDouble();
		
		 System.out.println("CALCULADORA");
		 System.out.println("opciones: \n"
				            +"1 - Sumar\n"
				            +"2 - restar\n"
				            +"3 - multiplicar\n"
				            +"4 - dividir");
		
		System.out.print("Ingrese una opcion");
		Scanner leer = new Scanner(System.in);
		
		char opcion = leer.next().charAt(0);
		switch(opcion) {
		case '1':
			sumar(unNumero,otroNumero);
			break;
		case '2':
			resta(unNumero,otroNumero);
			break;
		case '3':
			multiplicar(unNumero,otroNumero);
			break;
		default:
			break;
		}
		
		
	}
	
	static public void sumar(double unNumero, double otroNumero) {
		double resultado;
		resultado=unNumero + otroNumero;
		System.out.println("la suma es "+resultado);
	}
	
	static public void resta(double unNumero, double otroNumero) {
		double resultado;
		resultado=unNumero - otroNumero;
		System.out.println("la resta es "+resultado);
	}
	
	static public void multiplicar(double unNumero, double otroNumero) {
		double resultado;
		resultado=unNumero * otroNumero;
		System.out.println("la multiplicacion es "+resultado);
	}
	
	static public void dividir(double unNumero, double otroNumero) {
		double resultado;
		resultado=unNumero / otroNumero;
		System.out.println("la division es "+resultado);
	}
}
