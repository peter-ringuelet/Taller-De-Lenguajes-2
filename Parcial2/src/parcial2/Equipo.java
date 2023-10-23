package parcial2;
import java.util.ArrayList;

public class Equipo {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo() {}
	
	public Equipo(ArrayList<Jugador> jugadores) {
		super();
		this.jugadores = jugadores;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public boolean esApto() {
		int arquero=0;
		int defensor=0;
		int medio=0;
		int delantero=0;
		for (Jugador jug : this.jugadores) {
			if (jug.getPos1()==Posicion.ARQUERO || jug.getPos2()==Posicion.ARQUERO) {
				arquero++;
			}
			if (jug.getPos1()==Posicion.DEFENSA || jug.getPos2()==Posicion.DEFENSA) {
				defensor++;
			}
			if (jug.getPos1()==Posicion.MEDIOCAMPO || jug.getPos2()==Posicion.MEDIOCAMPO) {
				medio++;
			}
			if (jug.getPos1()==Posicion.DELANTERO || jug.getPos2()==Posicion.DELANTERO) {
				delantero++;
			}
		}
		if (arquero>=1 && defensor>=2 && medio>=1 && delantero>=1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
