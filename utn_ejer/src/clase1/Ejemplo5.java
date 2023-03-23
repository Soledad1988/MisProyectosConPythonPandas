package clase1;

public class Ejemplo5 {

	public static void main(String[] args) {
		
		int[]notas = new int[5];
		int i;
		notas[0]=2;
		notas[1]=8;
		notas[2]=7;
		notas[3]=10;
		notas[4]=3;
		
		//usando for tradicional
		System.out.println("El array tiene "+notas.length+" elemntos");
		System.out.println("Los elementos son: ");
		for(i=0;i<notas.length;i++) {
			System.out.println(notas[i]+"");
		}
		System.out.println();
	}
}
