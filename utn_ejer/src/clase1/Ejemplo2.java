package clase1;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String usuarioBD = "Brenda";
		String passwordBD = "12345";
		
		System.out.println("Ingrese su usuario: ");
		String usuario = teclado.next();
		
		System.out.println("Ingrese su password: ");
		String password = teclado.next();
		
		if(usuario.equals(usuarioBD)&&password.equals(passwordBD)) {
			System.out.println("Ingresaste correctamente");
		}else
			System.out.println("Usuario y password incorrectos");
	}
}
