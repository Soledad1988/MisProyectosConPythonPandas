package utn_ejer;

//Dado un String y una letra, que cuente la cantidad de apariciones
//de la letra en el String
public class Ejercicio3_1_A {

	public static void main(String[] args) {
		
		String palabra = "dormitorio"; 
		
		int contarCaracteres = 0;
		char letra;
		
		for(int i=0; i < palabra.length(); i++) {
			
			letra = palabra.charAt(i);
			if (letra == 'o') {
				contarCaracteres++;
			}	
		}
		System.out.println("La letra o aparece "+contarCaracteres+" veces en la palabra "+palabra);
		
	}
}
