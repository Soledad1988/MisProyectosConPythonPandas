package clase3;

import java.util.Arrays;

//dado 3 números y un orden (ascendente o descendente) que ordene los mismos
//y los retorne en un vector de 3
public class Ejercicio3_1_B {

	public static void main(String[] args) {
		
		int[] numeros = {250, 50, 3};
		
		Arrays.sort(numeros);
		
		System.out.println(Arrays.toString(numeros));
	}
}
