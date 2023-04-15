package trabajoPracticoIntegrador;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContarPuntaje {

	@org.junit.jupiter.api.Test
	public void contarPuntaje() {
		
		Persona participante = new Persona();
		
		
		Equipo argentina = new Equipo("Argentina","Arg");
		Equipo arabia = new Equipo("Arabia Saudita","ArBi");
		Equipo polonia = new Equipo("Polonia","Pol");
		Equipo mexico = new Equipo("Mexico","Mex");
		
		
		Partido partido1 = new Partido(argentina,arabia,1,2);
		Partido partido2 = new Partido(polonia,mexico,0,0);
		
		Partido[] vectorPartidos = {partido1,partido2};
		
		Ronda ronda = new Ronda("1",vectorPartidos,2);
		
		
		Pronostico pronostico1 = new Pronostico(partido1,argentina,ResultadoEnum.GANADOR);
		Pronostico pronostico2 = new Pronostico(partido2,polonia,ResultadoEnum.EMPATE);
		
		Pronostico[] pronostico = {pronostico1,pronostico2};
		participante.setProdePersona(pronostico);
	
		assertEquals(1,participante.puntaje());
		assertEquals(2,participante.puntaje());
	}
}	
