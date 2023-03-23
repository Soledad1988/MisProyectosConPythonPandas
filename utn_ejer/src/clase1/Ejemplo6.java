package clase1;

public class Ejemplo6 {

	public static void main(String[] args) {
		
		String nombre ="Araceli";
		String primeras3= nombre.substring(0,3);
		
		System.out.println(primeras3);
		
		int longitud = nombre.length();
		System.out.println("La longitud es "+longitud);
		
		String ultimas3 = nombre.substring(longitud-3);
		System.out.println(ultimas3);
	}
}
