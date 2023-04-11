package clase_11;

public class PruebaChat {

	public static void main(String[] args) {
		
		Usuario brenda = new Usuario();
		
		brenda.setNombre("Brenda");
		brenda.setMensaje("Hola Soy Brenda, como estas?");
		
		Usuario sofia = new Usuario();
		sofia.setNombre("Sofia");
		sofia.setMensaje("Hola, bien y tu?");
		
		
		System.out.println(brenda.toString());
		System.out.println(sofia.toString());
	}
}
