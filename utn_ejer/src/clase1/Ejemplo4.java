package clase1;

import java.lang.reflect.Array;

//Arreglo - Vectores
public class Ejemplo4 {

	public static void main(String[] args) {
	
		//Formas de definir un arreglo:
		//1° declaro el arreglo
		
		int numeroTabla[];
		
		//Defino el alcance del mismo
		numeroTabla = new int[2];
		
		//Defino los valores que va a contener el arreglo por cada indice
		numeroTabla[0]=0;
		numeroTabla[1]=1;
		System.out.println("Opcion 1");
		for(int i=0;i<numeroTabla.length;i++) {
			System.out.println(numeroTabla[i]);
		}
		
		
		//2°Declaro el arreglo y defino el alcance en una sola linea
		int[] numeroTabla2 = new int[2];
		
		//Defino los valores que va a contener el arreglo por cada indice
		numeroTabla2[0]=0;
		numeroTabla2[1]=1;
		
		System.out.println("Opcion 2");
		for(int i=0;i<numeroTabla2.length;i++) {
			System.out.println(numeroTabla2[i]);
		}
		//3° Defino tanyo arreglo, su alcance y los datos que va a contener
		int[] numeroTabla3 = {0,1};
		
		System.out.println("Opcion 3");
		for(int i=0;i<numeroTabla3.length;i++) {
			System.out.println(numeroTabla3[i]);
		}
	}
}
