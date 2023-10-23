package parcial2;
import java.util.ArrayList;


public class Partido {

	public static void main(String[] args) {
		Jugador jug1 = new Jugador(Posicion.ARQUERO, Posicion.DEFENSA);
		Jugador jug2 = new Jugador(Posicion.DEFENSA, Posicion.MEDIOCAMPO);
		Jugador jug3 = new Jugador(Posicion.DEFENSA, Posicion.DELANTERO);
		Jugador jug4 = new Jugador(Posicion.ARQUERO, Posicion.DEFENSA);
		Jugador jug5 = new Jugador(Posicion.ARQUERO, Posicion.DEFENSA);
		ArrayList<Jugador> juagadores1 = new ArrayList<Jugador>();
		juagadores1.add(jug1);
		juagadores1.add(jug2);
		juagadores1.add(jug3);
		juagadores1.add(jug4);
		juagadores1.add(jug5);
		Equipo equipo1 = new Equipo();
		equipo1.setJugadores(juagadores1);
		
		Jugador jug6 = new Jugador(Posicion.ARQUERO, Posicion.DEFENSA);
		Jugador jug7 = new Jugador(Posicion.MEDIOCAMPO, Posicion.MEDIOCAMPO);
		Jugador jug8 = new Jugador(Posicion.MEDIOCAMPO, Posicion.DELANTERO);
		Jugador jug9 = new Jugador(Posicion.ARQUERO, Posicion.MEDIOCAMPO);
		Jugador jug10 = new Jugador(Posicion.ARQUERO, Posicion.MEDIOCAMPO);
		ArrayList<Jugador> juagadores2 = new ArrayList<Jugador>();
		juagadores2.add(jug6);
		juagadores2.add(jug7);
		juagadores2.add(jug8);
		juagadores2.add(jug9);
		juagadores2.add(jug10);
		Equipo equipo2 = new Equipo();
		equipo2.setJugadores(juagadores2);
		
		if (equipo1.esApto()) {
			System.out.println("El equipo 1 es apto");
		}
		else {
			System.out.println("El equipo 1 no es apto");
		}
		
		if (equipo2.esApto()) {
			System.out.println("El equipo 2 es apto");
		}
		else {
			System.out.println("El equipo 2 no es apto");
		}

	}

}
