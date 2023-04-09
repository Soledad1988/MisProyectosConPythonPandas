package trabajoPracticoIntegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Partido {

	Equipo equipo1;
	Equipo equipo2;
	int golesEquipo1;
	int golesEquipo2;
	ResultadoEnum resultado;

	
	public Partido() {
		
	}
	
	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2, ResultadoEnum resultado) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.resultado = resultado;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	public ResultadoEnum getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}

	 public  ResultadoEnum resultado (Equipo equipo) {
	       if(golesEquipo1 ==  golesEquipo2){
	            return  ResultadoEnum.EMPATE;
	        }
	        if (equipo.equals(equipo1)){
	            if (golesEquipo1>golesEquipo2){
	                return ResultadoEnum.GANADOR;
	            }else {
	                return ResultadoEnum.GANADOR;
	            }
	        }
	        if (equipo.equals(equipo2)){
	            if (golesEquipo2>golesEquipo1 ){
	                return ResultadoEnum.GANADOR;
	            }else {
	                return ResultadoEnum.PERDEDOR;
	            }
	        }
	        return null;
	    }

	 
	/* public static List<String> ResultadosPartidos(){
		
		 String partidos = "D:\\Users\\Brenda\\Desktop\\Java - UTN\\TrabajoPractico\\partido.csv";
		 List<String> partido = new ArrayList<>();
		 
		 Pronostico pronosticosRonda[] = new  Pronostico[3];
	    
	            int i =0;
	            try {
	                partidos = Files.readAllLines(Paths.get(resultado));
	                partidos.remove(0);//removemos primera linea del archivo resultados
	               
	                int i =0;
	               for ( String linea: partidos  ){ //recorro cada linea del archivo resultados
	                    String[] arrayResultado = linea.split(";");
	                    //creamos el partido con (equipo,goles)
	                    Equipo equipo1 =new Equipo();//creo el equipo1
	                    equipo1.setNombre(arrayResultado[0]);//seteo el nombre del equipo 1 en el array
	                    Equipo equipo2 = new Equipo();//creo el equipo 2
	                    equipo2.setNombre(arrayResultado[3]);//seteo el nombre de equipo 2 en el array
	                    Partido partido1 = new Partido();//creo el partido
	                    //seteamos el partido con datos  de la linea de archivo
	                    partido1.setEquipo1(equipo1);
	                    partido1.setEquipo2(equipo2);
	                    partido1.setGolesEquipo1(Integer.parseInt(arrayResultado[1]));//convertimos gol de string a int
	                    partido1.setGolesEquipo2(Integer.parseInt(arrayResultado[2]));
	                    //agregamos partido al array
	                    partidosRonda[i] = partido1;
	                    i++;
	                }  
	        

	        
	 } catch (IOException e) {
         throw new RuntimeException(e);
     }
	       return partido;
	        
	 }*/
}
