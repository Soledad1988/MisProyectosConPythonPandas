package clase_11;

import java.util.Scanner;


public class PruebaChat {

	public static void main(String[] args) {
		
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("Desea escribir un mensaje o leer los mensajes, digite opcion: \n"
				+ "1 - Escribir mensaje\n"
				+ "2 - Leer mensajes");
		
		Scanner leer = new Scanner(System.in);
		char opcion = leer.next().charAt(0);
		
		SALIR:
			 switch(opcion) {
			 case '1':
				 	Usuario brenda = new Usuario();
					brenda.setNombre("Brenda");
					brenda.setMensaje(new Mensaje("hola me llamo Brenda, en que te puesdo ayudar?"));
					
					System.out.println("Por favor ingrese su nombre");
					String nombre = p.next();
					Usuario usuario = new Usuario();
					usuario.setNombre(nombre);
					
					System.out.println("Por favor ingrese su mensaje");
					String mensaje = p.next();
					usuario.setMensaje(new Mensaje(mensaje));
		
					
					System.out.println(brenda.toString());
					System.out.println(usuario.toString());
				 	
				break;
				
			 case '2':
				 	
				break;
			
			
				default:
					break SALIR;
				}
		
	}
}
