
package utn_ejer;

import java.util.Arrays;
//Haga un main, donde por parametro ponga 3 números y una letra
//que represente ascendente y descendente y muestre el orden por tal criterio
public class Ejercicio4_1_A {

public static void main(String[] args) {
	
	int[] numeros = {250, 50, 3};
	char a = 'a';	
		
	if(a=='a') {
		Arrays.sort(numeros);
		System.out.println("-----Orden Ascendente--------");
		for(int i = 0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		}else {
			Arrays.sort(numeros);
			System.out.println("-----Orden Descendente--------");
			for(int i = numeros.length-1;i>=0;i--) {
				System.out.println(numeros[i]);
			}
		}
		
	}
	
}
