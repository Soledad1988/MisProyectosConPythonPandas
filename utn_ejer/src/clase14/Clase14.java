package clase14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Clase14 {

	public static void main(String[] args) {
	

		
		String emailRegex = "([a-z]|[0-9])+@[a-z]+\\.[a-z]+" ;
		String linea = "ramonperez@gmail.com" ;
		boolean esValido;
		
		System.out.println(linea.matches("([a-z]|[0-9])+@[a-z]+\\.[a-z]+" ));
		final Pattern pattern = Pattern.compile(emailRegex);
		
		System.out.println(pattern.matcher(linea).matches());
		
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Ingrese su direccion de correo electronico: ");
			String email = scanner.nextLine();
			esValido = email.matches(emailRegex);
			if(!esValido) {
				System.out.println("El email no es valido");
				//System.out.println("Ingrese su direccion de correo electronico: ");
			}
		
		}while(!esValido);
		System.out.println("Direccion de email valida! Garcias!");
		
		scanner.close();
		
		final Pattern pattern2 = Pattern.compile(emailRegex);
	}
		
	
	
}
