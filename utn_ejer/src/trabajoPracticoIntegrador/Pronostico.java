package trabajoPracticoIntegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pronostico {
	
	Partido partido;
	Equipo equipo;
	ResultadoEnum resultado;
	int puntos;
	
	
	public Pronostico() {
		
	}
	
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado, int puntos) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
		this.puntos = puntos;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public ResultadoEnum getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	 public int puntos (){
	        if(partido.resultado(equipo) == resultado) {
	            return 1;  //Si el resultado pronosticado del equipo es igual al resultado del equipo suma un punto
	        } else {
	            return 0; //Si es diferente no suma nada
	        }
	    }
	 
	 public static List<String> ResultadosPronosticos(){
		 String archivo2 = "D:\\Users\\Brenda\\Desktop\\Java - UTN\\TrabajoPractico\\pronostico.csv";
		 List<String> pronosticos = new ArrayList<>();
		 
		 Pronostico pronosticosRonda[] = new  Pronostico[3];
	        try {
	            pronosticos = Files.readAllLines(Paths.get(archivo2));
	            pronosticos.remove(0);//removemos primera linea del archivo pronosticos
	            int i =0;
	            
	            for ( i =0; i < pronosticos.size() ; i++){//recorre partidos
	                Pronostico pronostico = new Pronostico();
	                ResultadoEnum resultadoPronostico;
	                if ( pronosticos.get(i).split(";")[1].isEmpty()) {
	                    if (pronosticos.get(i).split(";")[3].isEmpty()) {
	                        resultadoPronostico = ResultadoEnum.EMPATE;
	                    } else {
	                        resultadoPronostico = ResultadoEnum.GANADOR;
	                    }
	                } else {
	                    resultadoPronostico = ResultadoEnum.PERDEDOR;
	                    }
	               
	             
	                //pronostico.setPartido(partidosRonda[i]);//partidosRonda[i]
	                //pronostico.setEquipo(partidosRonda[i].getEquipo1());//partidosRonda[i]
	                pronostico.setResultado(resultadoPronostico);
	                pronosticosRonda[i] = pronostico;
	           }
	            int totalPuntos=0;
	            for (i =0; i < pronosticos.size() ; i++) {
	                totalPuntos += pronosticosRonda[i].puntos();
	            }
	            System.out.println("El puntaje de acuerdo al pronostico que seteo es: "+ totalPuntos);

	        
	 } catch (IOException e) {
         throw new RuntimeException(e);
     }
	       return pronosticos;
	        
	 }
}
