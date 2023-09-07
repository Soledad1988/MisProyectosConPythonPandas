package clase1;

//Utilizando la sentencia while / For, imprima todos los números entre 2 variables
//"a" y "b"
public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("----------Utilizando While------------");
		
		int numeroInicio = 5;
		int numeroFin = 14;
		
		while(numeroInicio <= numeroFin){
			System.out.println(numeroInicio + " ");
			numeroInicio++;
		}
		
		System.out.println("----------Utilizando For------------");

		for(int i=numeroFin;i>=numeroInicio;i--) {
			System.out.println(i+" ");
		}
	}
}
