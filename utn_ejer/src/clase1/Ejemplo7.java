package clase1;
//switch
public class Ejemplo7 {

	public static void main(String[] args) {
		int nota = 2;
		
		switch(nota) {
		case 1:
			System.out.println("tenes un 1");
			break;
			
		case 2:
			System.out.println("tenes un 2");
			break;
			
		case 3:
			System.out.println("tenes un 3");
			break;
			
		default:
			System.out.println("tenes una nota distinta a 1, 2 o 3");
		}
		
	}
}
